package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na ter�a (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trabalho1 = false;
		boolean trabalho2 = false;
		
		System.out.println(trabalho1 || trabalho2);
		System.out.println("A fam�lia vai comprar a TV de 32 polegadas");
		
		System.out.println(trabalho1 && trabalho2);
		System.out.println("A fam�lia vai comprar a TV de 42 polegadas, e vai tomar sorvete");
		
		System.out.println(!trabalho1 && !trabalho2);
		System.out.println("A fam�lia n�o vai comprar a TV, e vai ficar em casa mais saudavel");
		
		
		/*
		 * if(trabalho1 || trabalho2) { System.out.
		 * println("A fam�lia vai comprar a TV de 32 polegadas, e vai tomar sorvete"); }
		 * if (trabalho1 && trabalho2) { System.out.
		 * println("A fam�lia vai comprar a TV de 50 polegadas, e vai tomar sorvete"); }
		 * if (!trabalho1 && !trabalho2) { System.out.
		 * println("A fam�lia n�o vai comprar a TV, e vai ficar em casa mais saudavel");
		 * }
		 */
	}
}
