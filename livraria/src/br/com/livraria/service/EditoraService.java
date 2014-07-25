package br.com.livraria.service;

import java.sql.SQLException;
import java.util.List;

import br.com.livraria.dao.EditoraDao;
import br.com.livraria.dao.IEditoraDao;
import br.com.livraria.modelo.Editora;

public class EditoraService {

	private IEditoraDao dao;
	
	public EditoraService() throws ClassNotFoundException, SQLException {
		this.dao = new EditoraDao();
	}
	
	public void salvar(Editora editora){
		this.dao.save(editora);
	}
	
	public Editora editar(Editora editora){
		return editora;
	}
	
	public List<Editora> listarTodas(){
		return null;
	}
	
	public void remover(Editora editora){}
	
	public List<Editora> buscarPorCNPJ(String cnpj){
		return null;
	}
	
}
