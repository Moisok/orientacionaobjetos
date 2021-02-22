package Polimorfismo_1;

public class gato extends mascotas{
	
	private String color;
	
	private boolean peloLargo;

	//Constructor de gatos
	public gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean peloLargo) {
		
		super(nombre, edad, estado, fechaNacimiento);
		
		this.color=color;
		
		this.peloLargo=peloLargo;
		
	}

	//Getters y setter
	
	public String getColor() {
		return color;
	}

	public boolean isPeloLargo() {
		return peloLargo;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setPeloLargo(boolean peloLargo) {
		this.peloLargo = peloLargo;
	}
	
	//Funciones heredaras
	
	//Funcion de mostrar
	@Override
	public void habla() {
		System.out.println ("Miauuuuuuu soy " + nombre);
	}
	
	@Override
	//Funcion mostrar
	public void muestra() {
		System.out.println ("Nombre: " + nombre);
		System.out.println ("edad: " + edad);
		System.out.println ("estado: " + estado);
		System.out.println ("fechaNacimiento: " + fechaNacimiento);
		System.out.println ("color: " + color);
		System.out.println ("pelo largo: " + peloLargo);
		System.out.println (" ");
	}

}
