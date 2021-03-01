package Ejercicio_Agenda;

public class contacto {

	//Metodos de contacto
	
	private String nombre;
	
	private int telefono;
	
	//Constructor

	public contacto (String nombre, int telefono) {
		
		this.nombre=nombre;
		
		this.telefono=telefono;
	}
	
	//Getters y setter
	
	public String getNombre () {
		return nombre;
	}
	
	public int getTelefono () {
		return telefono;
	}
	
	public void setNombre () {
		this.nombre=nombre;
	}
	
	public void setTelefono () {
		this.telefono=telefono;
	}
	
	
}
