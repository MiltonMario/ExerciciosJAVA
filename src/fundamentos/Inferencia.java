package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5; // declara��o e inicializa��o
		System.out.println(a);
		
		a = 12;
		System.out.println(a);
		
		// a = "..."; -> n�o troca porque a foi declara como double
		
		var b = 4.5;
		System.out.println(b);
		
		var c = "Texto";
		System.out.println(c);
		
		c = "Outro texto";
		System.out.println(c);
		
		// c = 4.5; -> n�o consigo trocar o tipo da vari�vel depois da primeira declara��o
		
		double d; // vari�vel foi declarada
		d = 123.65; // vari�vel foi inicializada
		System.out.println(d); // usada !
		
//		var e;
//		e = 123.45;
//		n�o da pra declarar e depois inicializar usando o var.
	}
}
