package Ejercicio_Resuelto;

//Clase persona, defino yo los artributos

public class persona {
	
	//Artributos de la clase persona
	
	protected String nombre;
	
	protected String apellidos;
	
	protected int edad;
	
	//Constructor
	
	public persona (String nombre, String apellidos, int edad) {
		
		this.nombre = nombre;
		
		this.apellidos = apellidos;
		
		this.edad = edad;
		
	}
		
	//Getters
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public int getEdad () {
		return edad;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
