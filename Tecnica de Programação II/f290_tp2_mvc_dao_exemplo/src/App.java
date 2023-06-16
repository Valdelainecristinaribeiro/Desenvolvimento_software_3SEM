import java.sql.Connection;

import model.contato.ContatoVO;
import model.contato.dao.ConexaoFactory;
import model.contato.dao.ContatoDAO;
import services.ContatoServices;

public class App {

    public static void main(String[] args) {
        /*
         * 
         * 
         create table fatec.contatos(
	        id int primary key auto_increment,
            nome varchar(100) not null,
            email varchar(100) not null
        );
         */

        try {
            Connection connection = ConexaoFactory.getConexao();
            ContatoDAO dao = new ContatoDAO(connection);
            ContatoServices services = new ContatoServices(dao);
            ContatoVO c1 = new ContatoVO("Joao Pedro", "jp@gmail.com");
            services.salvar(c1);
            System.out.println(services.buscarTodos());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
