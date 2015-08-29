package br.edu.univas.si6.es4.abstractfactory;

public interface PedidoDAO {
	
		public void insert(Pedido pd);
		
		public Pedido[] list();

	}