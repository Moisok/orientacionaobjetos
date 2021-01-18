package Ejercicio4_1;

public class Punto {
	
	/*Coordenadas*/
	
	private int x;
	
	private int y;
	

	
	public Punto (int x, int y) {
		
		this.x=x;
		
		this.y=y;
	}
	
    /*Getters*/
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}
	
	/*Setter*/
	
	public void setX (int x) {
		this.x = x;
	}
	
	public void setY (int y) {
		this.y=y;
	}
	
	/***Metodos***/
	
	/*Setter doble*/
	
	public void setXY (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/*Mostrar por pantalla*/
	
	public void imprime() {
		System.out.println (" ");
		System.out.println (x + "," + y);
	}
	
	/*Metodo para desplazar*/
	
	public void desplaza (int dx, int dy) {
		this.x = this.x + dx;
		this.y = this.y + dy;
	}
	
	/*Metodo para la distancia*/
	
	public void distancia (Punto p) {
		System.out.println("La distancia X es: " + (p.x - this.x));
		System.out.println("La distancia X es: " + (p.y - this.y));
		System.out.println("La distancia entre puntos es de :" + (p.x - this.x) + "," + (p.y - this.y));
	}
	

}