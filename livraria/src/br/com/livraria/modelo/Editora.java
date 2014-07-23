package br.com.livraria.modelo;

public class Editora {

	private int cod_editora;
	private String nome_editora;
	private String cnpj;
	private String email;
	private String contato;
	private String fone;

	public int getCod_editora() {
		return cod_editora;
	}

	public void setCod_editora(int cod_editora) {
		this.cod_editora = cod_editora;
	}

	public String getNome_editora() {
		return nome_editora;
	}

	public void setNome_editora(String nome_editora) {
		this.nome_editora = nome_editora;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

}
