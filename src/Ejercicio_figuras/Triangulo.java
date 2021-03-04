package Ejercicio_figuras;

//Clase triangulo (Suponiendo que es equilatero) te implementa todos los metodos de "iFigura2d"

public class Triangulo implements iFigura2D {
	
	//Artributos propios
		private double altura;
		private double base;
		private double long_perimetro;
		private double long_area;
		
		//Constructor
		public Triangulo (double base, double altura) {
			this.altura=altura;
			this.base=base;
		}
		
		//Calcular perimetro
		@Override
		public double perimetro() {
			long_perimetro = base*3;
			return long_perimetro;
		}
		
		//Calcular area
		@Override
		public double area() {
			long_area = base*altura/2;
			return long_area;
		}
		
		//Escalar figura
		@Override
		public void escalar(double escala) {
			altura = altura * escala;
			base = base * altura;
		}
		
		//Imprimir datos
		@Override
		public void imprimir() {
			System.out.println ("Tipo: Triangulo") ;
			System.out.println ("Ancho: " + base);
			System.out.println ("Alto: " + altura);
			System.out.println ("Perimetro: " + long_perimetro);
			System.out.println ("Area: " + long_area);
			System.out.println (" ");
			
		}
		
		
	

}
