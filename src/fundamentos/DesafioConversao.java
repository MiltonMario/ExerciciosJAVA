package fundamentos;

import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu 1° salário:");
		String salario1 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite seu 2° salário:");
		String salario2 = entrada.nextLine().replace(",", ".");
		
		System.out.println("Digite seu 3° salário:");
		String salario3 = entrada.nextLine().replace(",", ".");
				
		double num1 = Double.parseDouble(salario1);
		double num2 = Double.parseDouble(salario2);
		double num3 = Double.parseDouble(salario3);
		
		double soma = num1 + num2 + num3;
		double media = soma / 3;
		
		System.out.printf("A soma é: %d", soma);
		System.out.printf("\nA média é: %d", media);
		
		entrada.close();
	}
}
