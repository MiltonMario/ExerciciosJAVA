package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Milton", 76);
		
		Comida c1 = new Comida("Macarrão", 0.200);
		Comida c2 = new Comida("Beef", 1);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		p1.comer(c2);
		System.out.println(p1.apresentar());
		p1.comer(c2);
		System.out.println(p1.apresentar());
	}
}
