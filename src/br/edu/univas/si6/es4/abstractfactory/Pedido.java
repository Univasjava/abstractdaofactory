package br.edu.univas.si6.es4.abstractfactory;

public class Pedido {

	private String nome;

	public Pedido() {
	}

	public Pedido(String nome) {
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
		return "Pedido: " + nome;
	}

}
