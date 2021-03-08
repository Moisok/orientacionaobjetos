package Ejercicio_Resuelto;

//Clase que hereda los artributos del profesor en este caso es interino

public class profesorInterino extends profesor {

	//Artributos propios interino
	private String asignatura;
	
	private boolean sustitucion;
	
	//Constructor
	public profesorInterino (String nombre, String apellidos, int edad, String centro, String curso, 
	String asignatura, boolean sustitucion) {

	super (nombre,apellidos,edad,centro,curso);
	
	this.asignatura=asignatura;
	
	this.sustitucion=sustitucion;
	}

	//Getters y setters
	
	public String getAsignatura() {
		return asignatura;
	}

	public boolean isSustitucion() {
		return sustitucion;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public void setSustitucion(boolean sustitucion) {
		this.sustitucion = sustitucion;
	}
	
	//Metodos heredados
	@Override
	public String informacion() {
		String info ="Nombre: " + nombre + " apellidos: " + apellidos +
		" edad: " + edad + " centro: " + centro + " curso: " + curso + " asignatura: " + 
		asignatura + " ¿es sustituto?: " + sustitucion;		
		return info;
	}

	
	
	
	
	
	
	
}
