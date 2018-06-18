package br.com.aplicacao.factory;

public class ProdutorFactory  {
	
	public static AbstractFactory getFactory(String tipoFabrica) {
		switch (tipoFabrica) {
		case "COR":
			return new CorFactory();
		case "FORMA":
			return new FormaFactory();
		default:
			return null;
		}
	}

}
