package br.edu.univas.si6.es4.abstractfactory;

public class PedidoRDBDAO implements PedidoDAO{
	
	public void insert(Pedido pd){
		System.out.println("Inserindo pedido no bando de dados relacional...");
		System.out.println(pd);
	}
	
	public Pedido[] list(){
		System.out.println("Buscando no pedidos no banco de dados relacional...");
		return new Pedido[0];
	}
	

}
