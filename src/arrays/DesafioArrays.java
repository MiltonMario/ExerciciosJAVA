package arrays;

import java.util.Scanner;

public class DesafioArrays {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas que seram armazenadas.");
		double[] notas = new double[entrada.nextInt()];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i + 1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		double total = 0;
		for (double nota: notas) {
			total += nota;
		}
		
		System.out.println();
		System.out.println("A media é: " + total / notas.length + "!");
		
		entrada.close();
	}
}
