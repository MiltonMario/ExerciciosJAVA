package oo.heranca.desafio;

public class Teste {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		Civic civic = new Civic();
		
		ferrari.acelerar();
		civic.acelerar();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		ferrari.frear();
		civic.frear();
		
		System.out.println(ferrari.velocidadeAtual);
		System.out.println(civic.velocidadeAtual);
		
		
	}
}
