package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		Data d2 = new Data(14, 11, 2022);
		
		//String hoje = d1.dia + "/" + d1.mes + "/" + d1.ano;
		System.out.printf("A data de hoje é %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
	}
}
