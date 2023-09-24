package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		// SortedSet e TreeSet mant�m a ordem de inser��o.
		SortedSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		// Para dar um espa�o entre os conjuntos.
		System.out.println();
		
		// Set e HashSet n�o mant�m a ordem de inser��o.
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(120);
		nums.add(6);
		
		// nums.get(1); N�o � poss�vel acessar pelo indice
		
		for(int n: nums) {
			System.out.println(n);
		}
	}
}
