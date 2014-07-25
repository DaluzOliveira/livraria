package br.com.livraria.dao;

import java.util.List;

import br.com.livraria.modelo.Editora;

public interface IEditoraDao {

	public void save(Editora editora);
	
	public void delete(Editora editora);
	
	public List<Editora> listAll();
	
	public Editora update(Editora editora);
}
