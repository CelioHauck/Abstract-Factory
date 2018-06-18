package br.com.aplicacao.factory;

import br.com.aplicacao.cores.Azul;
import br.com.aplicacao.cores.Verde;
import br.com.aplicacao.cores.Vermelho;
import br.com.aplicacao.inter.Cor;
import br.com.aplicacao.inter.Forma;

public class CorFactory extends AbstractFactory {

	@Override
	public Forma getForma(String forma) {
		return null;
	}

	@Override
	public Cor getCor(String cor) {
		switch (cor) {
		case "AZUL":
			return new Azul();
		case "VERMELHO":
			return new Vermelho();
		case "VERDE":
			return new Verde();
		default:
			return null;
		}
	}

}
