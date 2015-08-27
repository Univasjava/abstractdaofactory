package br.edu.univas.si6.es4.abstractfactory;

import javax.management.RuntimeErrorException;

public abstract class AbstractDAOFactory {
	
	public static final int TIPO_RDB = 1;
	public static final int TIPO_XML = 2;
	
	public abstract ProdutoDAO createProdutoDAO();
	public abstract ClienteDAO createClienteDAO();
	
	public static AbstractDAOFactory getfFactory(int tipo){
		switch(tipo){
		case TIPO_RDB:
			return new RDBDAOFactory();
		case TIPO_XML:
			return new XMLDAOFactory();
		default:
			throw new RuntimeException("Tipo Invalido.");
		}
	}
	
	
}
