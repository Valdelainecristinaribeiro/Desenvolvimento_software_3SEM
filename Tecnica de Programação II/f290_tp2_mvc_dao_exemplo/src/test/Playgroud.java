package test;

import java.sql.Connection;
import java.util.List;

import model.contato.ContatoVO;
import model.contato.dao.ConexaoFactory;
import model.contato.dao.ContatoDAO;
import services.ContatoServices;


public class Playgroud {
    public static void main(String[] args) {
        try {
            // cria conexão com banco
            Connection conexao = ConexaoFactory.getConexao();
            System.out.println("Conexão criada" + conexao);

            // cria contato DAO
            ContatoDAO contatoDAO = new ContatoDAO(conexao);
            System.out.println("ContatoDAO criado" + contatoDAO);

            // cria camada de serviço
            ContatoServices servico = new ContatoServices(contatoDAO);
            System.out.println("Camada de serviços criados" + servico);

            // cria objeto contatoVO
            ContatoVO contatoVO = new ContatoVO("Teste", "teste@test.com");
            System.out.println("Objeto contatoVO criado" + contatoVO);

            // salva contatoVO
            servico.salvar(contatoVO);

            // buscar contato por email
            ContatoVO buscacontato = servico.buscarPorEmail("teste@test.com");
            System.out.println("Contato busacado por email, email encontrado: " + buscacontato);

            // atualizar contato
            if (buscacontato != null) {
                buscacontato.setNome("Teste2");
                servico.atualizar(buscacontato);
            }

            // buscar todos
            List<ContatoVO> contatos = servico.buscarTodos();
            System.out.println("Lista de contatos: ");
            for (ContatoVO contato : contatos) {
                System.out.println(contato);
            }

            // exclui contato pelo ID
            if (buscacontato != null) {
                servico.excluir(buscacontato.getId());
            }

            // fecha conexão com banco
            conexao.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
