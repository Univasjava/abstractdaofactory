package br.edu.univas.si6.es4.abstractfactory;

public class PedidoXMLDAO implements PedidoDAO{
	
	public void insert(Pedido pd){
		System.out.println("Inserindo pedido no XML...");
		System.out.println(pd);
	}
	
	public Pedido[] list(){
		System.out.println("Buscando pedidos no XML...");
		return new Pedido[0];
	}
	
}
