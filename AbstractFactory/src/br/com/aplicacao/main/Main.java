package br.com.aplicacao.main;

import br.com.aplicacao.factory.AbstractFactory;
import br.com.aplicacao.factory.ProdutorFactory;
import br.com.aplicacao.inter.Cor;
import br.com.aplicacao.inter.Forma;

public class Main {

	public static void main(String[] args) {
		
	      AbstractFactory formaFactory = ProdutorFactory.getFactory("FORMA");

	      Forma circulo = formaFactory.getForma("CIRCULO");
	      circulo.desenhar();

	      Forma retangulo = formaFactory.getForma("RETANGULO");
	      retangulo.desenhar();
	      
	      Forma quadrado = formaFactory.getForma("QUADRADO");
	      quadrado.desenhar();

	      AbstractFactory corFactory = ProdutorFactory.getFactory("COR");

	      Cor vermelho = corFactory.getCor("VERMELHO");
	      vermelho.preencherCor();

	      Cor verde = corFactory.getCor("VERDE");
	      verde.preencherCor();

	      Cor azul = corFactory.getCor("AZUL");
	      azul.preencherCor();

	}

}
