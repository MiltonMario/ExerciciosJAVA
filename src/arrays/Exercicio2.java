package arrays;

public class Exercicio2 {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[4];
		
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		notasAlunoA[3] = 9.7;
		
		for(double nota: notasAlunoA) {
			System.out.print(nota + " ");
		}
	}
}
