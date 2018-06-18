package br.com.aplicacao.factory;

import br.com.aplicacao.inter.Cor;
import br.com.aplicacao.inter.Forma;
import br.com.aplicativo.formas.Circulo;
import br.com.aplicativo.formas.Quadrado;
import br.com.aplicativo.formas.Retangulo;

public class FormaFactory extends AbstractFactory {

	@Override
	public Forma getForma(String forma) {
		switch (forma) {
		case "CIRCULO":
			return new Circulo();
		case "RETANGULO":
			return new Retangulo();
		case "QUADRADO":
			return new Quadrado();
		default:
			return null;
		}
	}

	@Override
	public Cor getCor(String cor) {
		return null;
	}

}
