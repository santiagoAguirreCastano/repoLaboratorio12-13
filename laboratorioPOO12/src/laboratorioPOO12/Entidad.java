package laboratorioPOO12;

import javax.swing.JOptionPane;

public class Entidad {

	private double ladoA;
	private double ladoB;
	
	public void ingresarDatos() {
		String cadena;
		
		cadena =JOptionPane.showInputDialog(null, "Ingrese la longitud del lado A; ");
		ladoA =Double.parseDouble(cadena);
		
		cadena =JOptionPane.showInputDialog(null, "Ingrese la longitd del labo B: ");
		ladoB =Double.parseDouble(cadena);
		
	}
	
	public void calcularArea() {
		double resultado;
		
		resultado = ladoA * ladoB;
		
		JOptionPane.showInternalMessageDialog(null, "El resultado es: "+resultado);
	}
}
