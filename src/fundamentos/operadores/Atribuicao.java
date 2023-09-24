package fundamentos.operadores;

public class Atribuicao {

	public static void main(String[] args) {
		int a = 3;
		int b = a;
		int c = a + b;
		
		c += b; // c = c + b;
		c -= a; // c = c - b;
		c *= b; // c = c * b;
		c /= b; // c = c / b;
		
		System.out.println(c);
		
		c %= 2; // c = c % 2; 0 ou 1 - se der "0" numero par se der "1" numero impar
		System.out.println(c);
	}
}
