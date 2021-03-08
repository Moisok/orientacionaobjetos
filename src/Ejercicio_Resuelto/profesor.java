package Ejercicio_Resuelto;

//Clase que hereda los artributos de persona

public abstract class profesor extends persona {

	protected String centro;
	
	protected String curso;
	
	//Constructor
	
	public profesor (String nombre, String apellidos, int edad, String centro, String curso) {
	
	super (nombre,apellidos,edad);
	
	this.centro = centro;
	
	this.curso = curso;
	
	}

	//Getters y setter
	
	public String getCentro() {
		return centro;
	}


	public String getCurso() {
		return curso;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}


	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//Clase a heredar
	
	public abstract String informacion ();
	
}

	
	

