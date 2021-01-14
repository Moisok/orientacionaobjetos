package Ejercicio3_2;

public class Persona {

		private int dni;
		
		private String nombre;

		private String apellido;

		private int edad;
		
	public Persona (String nombre, String apellido, int edad, int  dni) {
			
		this.nombre =nombre;
			
		this.apellido = apellido;
		
		this.edad = edad;
			
		this.dni = dni;
			
		}
	/*Getters*/
	public int getdni() {
		return dni;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public String getapellido() {
		return apellido;
	}
	
	public int getedad() {
		return edad;
	}
	
	/*Setter*/
	public void setdni (int dni) {
		this.dni = dni;
	}
	
	public void setnombre (String nombre) {
		this.nombre=nombre;
	}
	
	public void setapellido (String apellido) {
		this.apellido=apellido;
	}
	
	public void setedad (int edad) {
		this.edad=edad;
	}

	}


