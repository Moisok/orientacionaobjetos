package Polimorfismo_1;

public class canario extends aves {
	
	String color;
	
	boolean canta;

	//Constructor super
	public canario(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String color, boolean canta) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		
		this.color=color;
		
		this.canta=canta;
	}
	
	//Metodos heredaros
	@Override
	public void muestra() {
		System.out.println ("Nombre: " + nombre);
		System.out.println ("edad: " + edad);
		System.out.println ("estado: " + estado);
		System.out.println ("fechaNacimiento: " + fechaNacimiento);
		System.out.println ("pico: " + pico);
		System.out.println ("vuela: " + vuela);
		System.out.println ("Color: " + color);
		System.out.println ("Canta: " + canta);
		System.out.println (" ");
	}
	
	@Override
	public void habla() {
		System.out.println ("Pio pio Soy" + nombre);
	}
	
	@Override
	public void volar() {
		System.out.println ("�Puede volar?" + vuela);
	}
	
	

}
