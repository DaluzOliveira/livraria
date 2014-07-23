package br.com.livraria.exemplos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.livraria.modelo.Editora;

public class ListarExemplo {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String sql = "SELECT cod_editora,nome_editora,cnpj FROM tb_editora ";
		
		try {
			
			// Para armazerna um lista de editoras
			List<Editora> editoras = new ArrayList<Editora>();
			
			Connection conexao = ConnectionFactory.getConnection();
			PreparedStatement stm = conexao.prepareStatement(sql);
			
			ResultSet rs = stm.executeQuery();
			
			// Pecorra a lista do banco pela executeQuery
			while (rs.next()) {
				
				Editora editora = new Editora();
				
				editora.setCod_editora(rs.getInt("cod_editora"));
				editora.setCnpj(rs.getString("cnpj"));
				editora.setNome_editora(rs.getString("nome_editora"));
				
				editoras.add(editora);
			}
			
			rs.close();
			conexao.close();
			
			//Imprimir a lista na tela
			for (Editora editora : editoras) {
				System.out.println(editora.getCod_editora()+" - "+editora.getCnpj()
						+" - "+editora.getNome_editora());
			}
					
		} catch (SQLException e) {
			throw new RuntimeException("Erro ao listar as"
					+ "informações."+e.getMessage());
		}	
		
	}

}
