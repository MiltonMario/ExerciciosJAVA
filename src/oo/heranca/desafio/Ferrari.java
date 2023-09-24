package oo.heranca.desafio;

public class Ferrari extends Carro{

	int acelerar() {
		
		int velocidade1 = super.acelerar();
		int velocidade2 = super.acelerar();
		int velocidade3 = super.acelerar();
		return velocidade1 + velocidade2 + velocidade3;
	}
	
	int frear() {
		
		if(velocidadeAtual >= 0) {
			velocidadeAtual -= 10;
		} if(velocidadeAtual <= 0) {
			velocidadeAtual = 0;
		}
		
		return velocidadeAtual;
	}
}
