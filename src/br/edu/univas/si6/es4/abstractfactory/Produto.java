package br.edu.univas.si6.es4.abstractfactory;

public class Produto {
	
	private String nome;
	
	public Produto() {
		
	}
	
	public Produto (String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Produto: " + nome;
	}

}
