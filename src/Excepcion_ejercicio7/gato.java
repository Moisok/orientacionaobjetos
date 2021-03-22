package Excepcion_ejercicio7;

//Clase gato

public class gato {

	//Artributos
	private String nombre;
	
	private int edad;
	
	
	//Constructor
	public gato (String nombre, int edad) throws Exception {
		//Comprobar nombre
		if (nombre.length()>=3) {
			this.nombre=nombre;
		}
		
		else {
			throw new Exception("El nombre de " + nombre + " no es valido, minimo 3 letras");
		}
		
		//Comprobar edad
		if (edad < 0) {
			throw new Exception("La edad de " + nombre + " no es valida");
		}
		this.edad=edad;
	}

	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setNombre(String nombre) throws Exception {
		if (nombre.matches("^[A-Za-z]{3}%")) {
			this.nombre=nombre;
		}
		
		else {
			throw new Exception("El nombre no es valido");
		}
	}


	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			throw new Exception("La edad de " + nombre + " no es valida");
		}
		this.edad=edad;
	}
	
	//Informacion
	
	public String info () {
		String informacion = "Nombre: " + nombre + " Edad: " + edad;
		return informacion;
	}
	
	
	
	
	
}
