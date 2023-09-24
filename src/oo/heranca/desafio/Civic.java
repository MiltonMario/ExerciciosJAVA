package oo.heranca.desafio;

public class Civic extends Carro{

	int acelerar() {
		
		int velocidade1 = super.acelerar();
		int velocidade2 = super.acelerar();
		return velocidade1 + velocidade2;
	}
}
