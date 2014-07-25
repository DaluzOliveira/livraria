package br.com.livraria.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import br.com.livraria.exemplos.ConnectionFactory;
import br.com.livraria.modelo.Editora;

public class EditoraDao implements IEditoraDao {

	private Connection conexao;
	
	public EditoraDao() throws ClassNotFoundException, SQLException {
		this.conexao = ConnectionFactory.getConnection();
	}

	@Override
	public void save(Editora editora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Editora editora) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Editora> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editora update(Editora editora) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
}
