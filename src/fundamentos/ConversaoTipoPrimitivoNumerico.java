package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		float b = (float) 1.23456788888; // convers�o expl�cita (CAST)
		System.out.println(b);
		
		int c = 130;
		byte d = (byte) c; // convers�o expl�cita (CAST)
		System.out.println(d);
		
		double e = 1.9999999;
		int f = (int) e;
		System.out.println(f);
	}

}
