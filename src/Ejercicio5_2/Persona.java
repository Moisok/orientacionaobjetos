package Ejercicio5_2;

import java.util.regex.Pattern;

public class Persona {

	private final String dni;
	
	private String nombre;

	private String apellido;

	private int edad;
	
	private static final int mayoriaEdad = 18;
	
	
public Persona (String nombre, String apellido, int edad, String dni) {
		
	this.nombre =nombre;
		
	this.apellido = apellido;
	
	this.edad = edad;
		
	this.dni = dni;
		
	}
/*Getters*/
public String getdni() {
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

public void setnombre (String nombre) {
	this.nombre=nombre;
}

public void setapellido (String apellido) {
	this.apellido=apellido;
}


public void setedad (int edad) {
	this.edad=edad;
}

/***Nuevos metodos***/
/*Imprimir el nombre*/
public void imprime() {
	System.out.println ("Nombre: " + this.nombre);
	System.out.println ("Apellido: " + this.apellido);
	System.out.println ("Edad: " + this.edad);
	
	if (validarDNI(this.dni)) {
		System.out.println ("DNI: " + this.dni);
	}
	else {
		System.err.println ("El DNI no es valido");
	}
	System.out.println (" ");
}

/*Comprobar si es mayor de edad*/
public boolean esMayorEdad() {
	boolean mayor = false;
	
	if (this.edad >= this.mayoriaEdad) {
		mayor=true;
	}
	
	else {
		mayor=false;
	}
		
	return mayor;
	
}

/*Comprobar si es Jubileta*/
public boolean esJubilado() {
	boolean jubilado = false;
	
	if (this.edad >= 65) {
		jubilado=true;
		
	}
	else {
		jubilado=false;
	}
		
	return jubilado;
	
}

/*Calcular diferencia de edad*/
public int diferenciaEdad (Persona p) {
	int diferencia = p.edad - this.edad;
	return diferencia;
}

/***Modificaciones nuevas de los ultimos ejercicios***/

static boolean validarDNI (String dni) {
	String dniRegexp = "\\d{8}[A-HJ-NP-TV-Z]";
	return Pattern.matches(dniRegexp, dni);
}

}




