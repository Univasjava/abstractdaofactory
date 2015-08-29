package br.edu.univas.si6.es4.abstractfactory;

public class PedidoMongoDBDAO implements PedidoDAO{
	
	public void insert(Pedido pd){
		System.out.println("Inserindo pedido no Mongo DB...");
		System.out.println(pd);
	}
	
	public Pedido[] list(){
		System.out.println("Buscando pedidos no Mongo DB...");
		return new Pedido[0];
	}
	
}
