package Ejercicio4_3;

public class rectangulo {
	
	private int x1;
	
	private int y1;
	
	private int x2;
	
	private int y2;
	
	public rectangulo (int x1, int x2, int y1, int y2) {
		
		this.x1=x1;
		
		this.x2=x2;
		
		this.y1=y1;
		
		this.y2=y2;
		
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
		this.x1=x1;
	}
	
	public void setY1 (int y1) {
		this.y1=y1;
	}
	
	public void setX2 (int x2) {
		this.x2=x2;
	}
	
	public void setY2 (int y2) {
		this.y2=y2;
	}
	
	/***Nuevos metodos***/
	/*Imprimir informacion por pantalla*/
	public void mostrardatos () {
		int lado1 = this.x2 - this.x1;
		int lado2 = this.y2 - this.y1;
		System.out.println ("Coordenadas: "  + this.x1 + " " +  this.y1 + " "  + this.x2  +  " " + this.y2 );
		System.out.println ("Perimetro: " + (lado1 * 2 + lado2 * 2));
		System.out.println ("Area: " + (lado1 * lado2));
	}
	

}
