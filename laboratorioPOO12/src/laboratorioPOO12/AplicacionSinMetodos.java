package laboratorioPOO12;

import javax.swing.JOptionPane;

public class AplicacionSinMetodos {

	public static void main(String args[ ]) {
		String cadena;
		double ladoA;
		double ladoB;
		double resultado;
		
		cadena = JOptionPane.showInputDialog(null,"Ingrese la longitud del lado A: ");
		ladoA = Double.parseDouble(cadena);
		
		cadena = JOptionPane.showInputDialog(null, " Ingrese la longitud del lado B: ");
		ladoB =Double.parseDouble(cadena);
		
		resultado = ladoA * ladoB;
		JOptionPane.showInputDialog(null,"El resultado es: "+resultado);
		
	}
}
