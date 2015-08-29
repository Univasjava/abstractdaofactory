package br.edu.univas.si6.es4.abstractfactory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public abstract class AbstractDAOFactory {
	
	public static final int TIPO_RDB = 1;
	public static final int TIPO_XML = 2;
	
	public abstract ProdutoDAO createProdutoDAO();
	public abstract ClienteDAO createClienteDAO();
	public abstract PedidoDAO createPedidoDAO();
	
	public static AbstractDAOFactory getFactory(){
		String fileName = "daofactory.properties";
		InputStream is = AbstractDAOFactory.class.getClassLoader().getResourceAsStream(fileName);
		if(is == null) {
			throw new RuntimeException("Recurso n�o Encontrado.");
		}
		Properties props = new Properties();
		try {
			props.load(is);
		String type = props.getProperty("daofactory.factorytype");
		if("RDB".equalsIgnoreCase(type)){
			return new RDBDAOFactory();
		} else if ("XML".equalsIgnoreCase(type)){
			return new XMLDAOFactory();
		} else if ("MongoDB".equalsIgnoreCase(type)){
			return new MongoDBDAOFactory();
			}
		
		else {
			throw new RuntimeException("Tipo n�o suportado: " + type);
		}
	} catch (IOException e) {
		throw new RuntimeException("N�o foi poss�vel ler as propriedadades.", e);
	}
		
	}
}