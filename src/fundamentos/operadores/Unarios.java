package fundamentos.operadores;

public class Unarios {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		
		a++; // a = a + 1
		a--; // a = a - 1
		
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("Mini Desafio...");
		System.out.println(++a == b--);
		// como ++a � uma forma prefixada ela tem uma precedencia maior que a compara��o,
		// e s� depois da compara��o tem o decremento do b-- que � uma forma posfixada. sendo assim "true"
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}
