package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		final double FATOR = 5.0 / 9.0;
		final int AJUSTE = 32;
		
		double fah = 86;
		double cel = (fah - AJUSTE) * FATOR;
		System.out.println("O resultado é " + cel + "°C.");
		
		fah = 150;
		cel = (fah - AJUSTE) * FATOR;
		System.out.println("O resultado é " + cel + "°C.");
	}
}
