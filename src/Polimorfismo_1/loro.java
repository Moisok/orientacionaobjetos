package Polimorfismo_1;

public class loro extends aves {
	
	//Definimos las variables
	private String origen;

	//Constructor
	public loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String origen) {
		super(nombre, edad, estado, fechaNacimiento, pico, vuela);
		
		this.origen=origen;
	}

	//Getters y Setters
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}
	
	//Metodos hederados
	@Override
	public void muestra() {
		System.out.println ("Nombre: " + nombre);
		System.out.println ("edad: " + edad);
		System.out.println ("estado: " + estado);
		System.out.println ("fechaNacimiento: " + fechaNacimiento);
		System.out.println ("pico: " + pico);
		System.out.println ("vuela: " + vuela);
		System.out.println ("Origen: " + origen);
		System.out.println (" ");
		
	}
	
	@Override
	public void habla() {
		System.out.println ("krikk krikkk Soy" + nombre);
	}
	
	@Override
	public void volar() {
		System.out.println ("¿Puede volar?" + vuela);
	}
	
	//Metodo propio
	public void saluda () {
		System.out.println ("Holaaaaa krik krik");
	}
	
	
	
	
	
	
	

}
