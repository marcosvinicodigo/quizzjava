package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// TODO: Auto-generated Javadoc
/**
 * The Class DAO.
 */
public class DAO {
	
	/** The driver. */
	private String driver = "com.mysql.cj.jdbc.Driver";
	
	/** The url. */
	private String url = "jdbc:mysql://127.0.0.1:3306/dbquizz?useTimezone=true&serverTimezone=UTC";

	/** The user. */
	private String user = "root";
	
	/** The password. */
	private String password = "987456123abcd";
	
	/**
	 * Conectar.
	 *
	 * @return the connection
	 */
	// Metodo de conexão
		private Connection conectar() {
			Connection con = null;
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, user, password);
				return con;
			} catch (Exception e) {
				System.out.println(e);
				return null;

			}

		}

		/**
		 * Ler pergunta.
		 *
		 * @return the array list
		 */
		public ArrayList<JavaBeans> lerPergunta() {
			
			//Criando o comando que vai ser usado no banco de dados
			String read = "select * from perguntas order by id";
			ArrayList<JavaBeans> perguntas = new ArrayList<>();
			
			try {
				//Conectando ao banco de dados
				Connection con = conectar();
				
				//Preparando o comando para ser executado
				PreparedStatement pst = con.prepareStatement(read);
				
				//Executando o comando e colocando os dados das perguntas no Objeto
				ResultSet rs = pst.executeQuery();
				
				while(rs.next()) {
				//Variaiveis que recebem os dados do banco que foram armazenadas no rs
					int id = rs.getInt(1);
					String pergunta = rs.getString(2);
					String resp1 = rs.getString(3);
					String resp2 = rs.getString(4);
					String resp3 = rs.getString(5);
					String resp4 = rs.getString(6);
					int respcerta = rs.getInt(7);
					
					perguntas.add(new JavaBeans(id,pergunta,resp1,resp2,resp3,resp4,respcerta));		
				}
				con.close();
				
				return perguntas;
	
				
			} catch (Exception e) {
				System.out.println(e);
				return null;
			}
	
		}
		
		/**
		 * Inserir rank.
		 *
		 * @param novorank the novorank
		 */
		public void inserirRank(Rank novorank) {
			String create = "insert into ranking (nome,pontos) values (?,?)";
			try {
				
				Connection con = conectar();
				
				PreparedStatement pst = con.prepareStatement(create);
				pst.setString(1, novorank.getNome());
				pst.setInt(2, novorank.getPontos());
				
				pst.executeUpdate();
				
				con.close()
				;
			} catch (Exception e) {
				System.out.println(e);
				
			}
			
		}
		
		/**
		 * Enviar rank.
		 *
		 * @return the array list
		 */
		public ArrayList<Rank> enviarRank(){
			
			ArrayList<Rank> rank = new ArrayList<>();
			String read = "select * from ranking order by pontos desc";
			try {
				
				Connection con = conectar();
				
				PreparedStatement pst = con.prepareStatement(read);
				
				ResultSet rs = pst.executeQuery();
				
				while(rs.next()) {
					int id = rs.getInt(1);
					String nome = rs.getString(2);
					int pontos = rs.getInt(3);
					
					rank.add(new Rank(id,nome,pontos));
					
				}
				
				con.close();
				
				return rank;
				
				
				
			} catch (Exception e) {
				
				System.out.println(e);
				return null; 
				
			}
			
		}
	
}
