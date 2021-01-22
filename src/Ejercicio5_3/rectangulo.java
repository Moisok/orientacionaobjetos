package Ejercicio5_3;

public class rectangulo {
	
	private int x1;
	
	private int y1;
	
	private int x2;
	
	private int y2;
	
	private final static int min = 0;
	
	private final static int max = 100; 
	
	public rectangulo (int x1, int x2, int y1, int y2) {
		/*Comprobacion x1*/
		if (x1 < this.max && x1 > this.min ) {
		this.x1=x1;
		}
		else {
			System.err.println ("Error no puede ser mayor que 100 o menor que 0");
		}
		/*Comprobacion y1*/
		if (y1 < this.max && y1 > this.min ) {
		this.y1=y1;
		}
		else {
			System.err.println ("Error no puede ser mayor que 100 o menor que 0");
		}
		/*Comprobacion x2*/
		if (x2 < this.max && x2 > this.min ) {
			this.x2=x2;
			}
			else {
			System.err.println ("Error no puede ser mayor que 100 o menor que 0");
			}
		/*Comprobacion y2*/
		if ( y2 < this.max && y2 > this.min ) {
			this.y2=y2;
			}
			else {
			System.err.println ("Error no puede ser mayor que 100 o menor que 0");
			}
		
	}
	
	/*Getters*/
	public int getX1(){
		return x1;
	}
	
	public int getY1() {
		return y2;
	}
	
	public int getX2() {
		return x2;
	}
	
	public int getY2() {
		return y2;
	}
	
	
	/*setter*/
	public void setX1 (int x1) {
		if (x1 < this.max && x1 > this.min ) {
			this.x1=x1;
			}
			else {
				System.err.println ("Error no puede ser mayor que 100 o menor que 0");
			}
	}
	
	public void setY1 (int y1) {
		if (y1 < this.max && y1 > this.min ) {
			this.y1=y1;
			}
			else {
				System.err.println ("Error no puede ser mayor que 100 o menor que 0");
			}
	}
	
	public void setX2 (int x2) {
		if (x2 < this.max && x2 > this.min ) {
			this.x2=x2;
			}
			else {
			System.err.println ("Error no puede ser mayor que 100 o menor que 0");
			}
	}
	
	public void setY2 (int y2) {
		if ( y2 < this.max && y2 > this.min ) {
			this.y2=y2;
			}
			else {
			System.err.println ("Error no puede ser mayor que 100 o menor que 0");
			}
	}
	
	/***Nuevos metodos***/
	/*Imprimir informacion por pantalla*/
	public void mostrardatos () {
		System.out.println ("Lado 1: " + this.x1);
		System.out.println ("Lado 2: " + this.y1);
		System.out.println ("Lado 3: " + this.x2);
		System.out.println ("Lado 4: " + this.y2);
		
	}
	
	/*Setters dobles y cuadruples*/
	
	public void setX1Y1 (int x1, int y1) {
		this.x1=x1;
		this.y1=y1;
	}
	
	public void setX2Y2 (int x2, int y2) {
		this.x2=x2;
		this.y2=y2;
	}
	
	public void setALL (int x1, int y1, int x2, int y2) {
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	
	/*Perimetro*/
	public void perimetro() {
		int lado1 = this.x2 - this.x1;
		int lado2 = this.y2 - this.y1;
		System.out.println ("El perimetro es: " + (lado1 * 2 + lado2 * 2));
		
	}
	
	/*Calcular area*/
	public void area () {
		int lado1 = this.x2 - this.x1;
		int lado2 = this.y2 - this.y1;
		System.out.println ("Area: " + (lado1 * lado2));
		

	}
	
	/***Generacion de rectangulos aleatorios*/
	/*Crear cuadrado aleatorio*/
	public static void RECaleatorio (rectangulo a) {
		a.x1=(int)(0 + Math.random() * (200 - 0 + 1));
		a.y1=(int)(0 + Math.random() * (200 - 0 + 1));
		a.x2=(int)(0 + Math.random() * (200 - 0 + 1));
		a.y2=(int)(0 + Math.random() * (200 - 0 + 1));
	}
}
