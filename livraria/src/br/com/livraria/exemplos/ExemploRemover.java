package br.com.livraria.exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.livraria.modelo.Editora;

public class ExemploRemover {

	public static void main(String[] args) throws ClassNotFoundException {
				
		Editora editora = new Editora();
		editora.setCod_editora(4);
		
		String sql = "DELETE FROM tb_editora WHERE cod_editora = ?";
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setInt(1, editora.getCod_editora());
			
			stm.execute();
			stm.close();
			
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao remover as"
					+ "informações."+e.getMessage());
		}
		
		System.out.println("Editora excluida com sucesso ");


	}

}
