package Polimorfismo_1;

public class perro extends mascotas {
	
	private String raza;
	
	private int pulgas;
	
	//Constructor super
	public perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, int pulgas) {
		
		super(nombre, edad, estado, fechaNacimiento);
		
		this.raza=raza;
		
		this.pulgas=pulgas;

	}
	
	
	//Getters y setter
	public String getRaza() {
		return raza;
	}


	public int getPulgas() {
		return pulgas;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public void setPulgas(int pulgas) {
		this.pulgas = pulgas;
	}
	
	//Funcion hederada de hablar
	@Override	
	public void habla() {
		System.out.println ("Wof Wof soy" + nombre );
		
	}
	//Funcion hederada de mostrar
	@Override
	public void muestra() {
		System.out.println ("Nombre: " + nombre);
		System.out.println ("edad: " + edad);
		System.out.println ("estado: " + estado);
		System.out.println ("fechaNacimiento: " + fechaNacimiento);
		System.out.println ("raza: " + raza);
		System.out.println ("pulgas: " + pulgas);
	}


	
	
	
	
	

	

}
