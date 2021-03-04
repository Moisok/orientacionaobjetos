package Ejercicio_figuras;

//Clase cuadrado te implementa todos los metodos de "iFigura2d"

public class Cuadrado implements iFigura2D {

	//Artributos propios
	private double lado;
	private double long_perimetro;
	private double long_area;
	
	//Constructor
	public Cuadrado (double lado) {
		this.lado=lado;
	}
	
	//Metodos implementados (heredados)
	
	
	//Calcular perimetro
	@Override
	public double perimetro() {
		
		long_perimetro = lado * 4;
		
		return long_perimetro;
	}

	//Calcular Area
	@Override
	public double area() {
		
		long_area = lado*lado;
		
		return long_area;
	}

	//Escalar las figuras
	@Override
	public void escalar(double escala) {
			lado = lado * escala;
		}
	
	//Mostrar informacion
	@Override
	public void imprimir() {
		System.out.println ("Tipo: Cuadrado") ;
		System.out.println ("Lados: " + lado);
		System.out.println ("Perimetro: " + long_perimetro);
		System.out.println ("Area: " + long_area);
		System.out.println (" ");
	}
}


