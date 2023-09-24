package oo.heranca.desafio;

public class Carro {

	int velocidadeAtual;
	
	int acelerar(){
		
		return velocidadeAtual += 5;
	}
	
	int frear() {
		
		if(velocidadeAtual >= 0) {
			velocidadeAtual -= 5;
		} if(velocidadeAtual <= 0) {
			velocidadeAtual = 0;
		}
		
		return velocidadeAtual;
	}
}
