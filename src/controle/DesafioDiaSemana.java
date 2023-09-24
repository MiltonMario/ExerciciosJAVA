package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		// Domingo -> 1
		// quarta -> 4
		// terça -> 3
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Digite o dia: ");
		String dia = teclado.nextLine();
		
		System.out.println(dia.equals("domingo"));
		
		if(dia.equalsIgnoreCase("domingo")) {
			System.out.println("Hoje é o dia 1");
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("Hoje é o dia 2");
		} else if(dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println("Hoje é o dia 3");
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println("Hoje é o dia 4");
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println("Hoje é o dia 5");
		} else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println("Hoje é o dia 6");
		} else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
			System.out.println("Hoje é o dia 7");
		}
		
		teclado.close();
	}
}
