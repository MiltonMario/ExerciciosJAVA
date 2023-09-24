package atividade;

import javax.swing.JOptionPane;

public class Rota {

    public void planejarDia() {        
    	int rotas = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantas rotas irá ter hoje? "));
    	
    	double totalKm = 0;
    	
    	for(int i = 1;i <= rotas; i++) {
    		
    		double km = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a km da rota " + i + " :"));
    		totalKm += km;
    	}
    	
    	double combustivelNecessario = totalKm / 2.5;
    	
    	double valorOleo = Double.parseDouble(JOptionPane.showInputDialog(null, "Qual o valo do litro de óleo diesel? "));
    	
    	double valorTotal = combustivelNecessario * valorOleo;
    	
    	String msg1 = "Total de km que serão rodados: " + totalKm;
    	String msg2 = "\nTotal de combustível necessário: " + combustivelNecessario;
    	String msg3 = "\nValor total a gastar: " + valorTotal;

    	JOptionPane.showMessageDialog(null, msg1 + msg2 + msg3);
    }
}
