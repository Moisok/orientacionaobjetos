package Ejercicio_figuras;

//Importamos clase Math para calculos con el circulo
import java.lang.Math;

//Clase Circulo te implementa todos los metodos de "iFigura2d"

public class Circulo implements iFigura2D {
	
	private double radio;
	private double long_perimetro;
	private double long_area;
	
	//Constructor
	public Circulo (double radio) {
		this.radio=radio;
	}
	
	//Calcular perimetro
	@Override
	public double perimetro() {
		long_perimetro = 2*Math.PI*radio;
		return long_perimetro;
	}

	//Calcular area
	@Override
	public double area() {
		double elevado = Math.pow(radio, 2);
		long_area = Math.PI*elevado;
		return long_area;
	}

	//Escalar la figura
	@Override
	public void escalar(double escala) {
		radio = radio * escala;
	}

	//Mostrar los datos
	@Override
	public void imprimir() {
		System.out.println ("Tipo: Circulo") ;
		System.out.println ("Radio: " + radio);
		System.out.println ("Perimetro: " + long_perimetro);
		System.out.println ("Area: " + long_area);
		System.out.println (" ");
	}
	
	

}
