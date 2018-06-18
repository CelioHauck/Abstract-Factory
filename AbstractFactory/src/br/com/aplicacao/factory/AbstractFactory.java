package br.com.aplicacao.factory;

import br.com.aplicacao.inter.Cor;
import br.com.aplicacao.inter.Forma;

public abstract class AbstractFactory {

	public abstract Forma getForma(String forma);
	public abstract Cor getCor(String cor);
	
}
