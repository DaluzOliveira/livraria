package br.com.livraria.exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.livraria.modelo.Editora;

public class ExemploEditar {

	public static void main(String[] args) throws ClassNotFoundException {
				
		Editora editora = new Editora();
		editora.setNome_editora("Editora VIENA S/N");
		editora.setCod_editora(3);
		
		String sql = "UPDATE tb_editora SET nome_editora = ?"
				+ "WHERE cod_editora = ?";
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setString(1, editora.getNome_editora());
			stm.setInt(2, editora.getCod_editora());
			
			stm.execute();
			stm.close();
			
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao remover as"
					+ "informações."+e.getMessage());
		}
		
		System.out.println("Editora atualizada com sucesso ");
	}
}
