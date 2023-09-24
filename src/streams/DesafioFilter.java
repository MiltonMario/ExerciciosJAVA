package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Carro c1 = new Carro("Civic", true, false);
		Carro c2 = new Carro("Fiesta", true, true);
		Carro c3 = new Carro("Hb20", false, false);
		Carro c4 = new Carro("Onix", true, true);
		Carro c5 = new Carro("Virtus", true, false);
		Carro c6 = new Carro("Fox", false, true);
		
		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6);
		
		Predicate<Carro> gasolina = a -> a.abastecido;
		Predicate<Carro> condicao = a -> a.boaCondicao;
		Function<Carro, String> boaViagem = 
				a -> "Seu carro " + a.nome + " está em condições de viagem !!!";
		
		carros.stream()
			.filter(condicao)
			.filter(gasolina)
			.map(boaViagem)
			.forEach(System.out::println);
	}
}
