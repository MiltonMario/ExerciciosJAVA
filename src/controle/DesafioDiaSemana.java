package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1
		// quarta -> 4
		// ter�a -> 3
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o dia: ");
		String dia = teclado.nextLine();
		
		System.out.println(dia.equals("domingo"));
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Hoje � o dia 1");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("Hoje � o dia 2");
		} else if(dia.equalsIgnoreCase("ter�a") || dia.equalsIgnoreCase("terca")) {
			System.out.println("Hoje � o dia 3");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("Hoje � o dia 4");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("Hoje � o dia 5");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("Hoje � o dia 6");
		} else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("s�bado")) {
			System.out.println("Hoje � o dia 7");
		}
		
		teclado.close();
	}
}
