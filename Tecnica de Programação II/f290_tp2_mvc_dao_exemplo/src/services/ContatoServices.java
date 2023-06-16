package services;

import java.util.ArrayList;
import java.util.List;

import model.contato.ContatoVO;
import model.contato.dao.ContatoDAO;
import model.contato.dao.IContato;


public class ContatoServices {
    private IContato dao;    

    public ContatoServices(ContatoDAO dao) throws Exception{
        this.dao =  dao;
    }

    public void salvar(ContatoVO pContato) throws Exception {
        try {
            dao.salvar(pContato);
        } catch (Exception e) {
            System.out.println("Falha ao salvar contato.");
            throw e;
        }
    }

    public void atualizar(ContatoVO pContato) throws Exception {
        try {
            dao.atualizar(pContato);
            System.out.println("Contato atualizado.");
        } catch (Exception e) {
            System.out.println("Falha ao atualizar contato.");
            throw e;
        }
    }

    public ContatoVO buscarPorEmail(String pEmail) throws Exception {
        ContatoVO contato = null;
        try {
            contato = dao.buscarPorEmail(pEmail);
        } catch (Exception e) {
            System.out.println("Falha ao buscar por email.");
            throw e;
        }
        return contato;
    }


    public List<ContatoVO> buscarTodos() throws Exception {
        List<ContatoVO> contatos = new ArrayList<>();
        try {
            contatos = dao.buscarTodos();
        } catch (Exception e) {
            System.out.println("Falha ao buscar todos.");
            throw e;
        }
        return contatos;
    }

    public void excluir(Integer pId) throws Exception {
        try {
            dao.excluir(pId);
        } catch (Exception e) {
            System.out.println("Falha ao excluir.");
            throw e;
        }
    }
}
