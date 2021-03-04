package Ejercicio_figuras;

//Clase rectangulo te implementa todos los metodos de "iFigura2d"

public class Rectangulo implements iFigura2D {
	
	//Artributos propios
	private double altura;
	private double base;
	private double long_perimetro;
	private double long_area;
	
	//Constructor
	public Rectangulo (double altura, double base) {
		this.altura = altura;
		this.base = base;
	}
	
	//Calcular perimetro
	@Override
	public double perimetro() {
		long_perimetro = (base*2)+(altura*2);
		return long_perimetro;
	}
	
	//Calcular area
	@Override
	public double area() {
		long_area = base*altura;
		return long_area;
	}
	
	//Escalar la figura
	@Override
	public void escalar(double escala) {
		altura = altura * escala;
		base = base * altura;
		
	}
	
	//Mostrar artributos
	@Override
	public void imprimir() {
		System.out.println ("Tipo: Rectangulo") ;
		System.out.println ("Ancho: " + base);
		System.out.println ("Alto: " + altura);
		System.out.println ("Perimetro: " + long_perimetro);
		System.out.println ("Area: " + long_area);
		System.out.println (" ");
	}
	

	
}
