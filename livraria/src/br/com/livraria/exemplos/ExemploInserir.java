package br.com.livraria.exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.livraria.modelo.Editora;

public class ExemploInserir {
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		Editora editora = new Editora();
		editora.setCnpj("76.999.777/0001-77");
		editora.setNome_editora("Editora VIENA S/N");
		editora.setEmail("atedimento@editoravienasn.com");
		editora.setFone("(21)9800-9999");
		editora.setContato("Raimundo");
		
		String sql = "INSERT INTO tb_editora"
				+ "(nome_editora,cnpj,email,contato,fone)"
				+ "VALUES(?,?,?,?,?);";
		
		try {
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement stm = conexao.prepareStatement(sql);
			stm.setString(1, editora.getNome_editora());
			stm.setString(2, editora.getCnpj());
			stm.setString(3, editora.getEmail());
			stm.setString(4, editora.getContato());
			stm.setString(5, editora.getFone());
			
			stm.execute();
			stm.close();
			
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao inserir as"
					+ "informações."+e.getMessage());
		}
		
		System.out.println("Editora criada "+editora.getNome_editora());
		
	}

}
