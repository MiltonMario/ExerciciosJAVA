package controle;

import java.util.Scanner;

public class LogicaDoGrupo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double numero1 = 0;
		double numero2 = 0;
		double resultado = 0;
		int contador = 0;
		
		System.out.println("Digite um numero: ");
		numero1 = entrada.nextDouble();
		
		System.out.println("Digite um numero: ");
		numero2 = entrada.nextDouble();
		
		while (contador < numero2) {
			resultado = resultado + numero1;
			contador = contador + 1;
		}
		
		System.out.println("O resultado da multiplicacao e: " + resultado);
		
		entrada.close();
	}
}
