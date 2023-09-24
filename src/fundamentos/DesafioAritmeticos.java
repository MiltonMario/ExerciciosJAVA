package fundamentos;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
		
		double a1 = (1 - 5) * (2 - 7);
		double a2 = (a1 / 2);
		double a = Math.pow(a2, 2);
		
		double b1 = (3 + 2) * 6;
		double b2 = Math.pow(b1, 2);
		double b3 = 3 * 2;
		double b = b2 / b3;
		
		double c1 = b - a;
		double c2 = Math.pow(c1, 3);
		double c3 = Math.pow(10, 3);
		double c = c2 / c3;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c);
	}
}
