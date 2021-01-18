package Ejercicio4_2;

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

/***Nuevos metodos***/
/*Imprimir el nombre*/
public void imprime() {
	System.out.println ("Nombre: " + this.nombre);
	System.out.println ("Apellido: " + this.apellido);
	System.out.println ("Edad: " + this.edad);
	System.out.println ("DNI: " + this.dni);
	System.out.println (" ");
}

/*Comprobar si es mayor de edad*/
public boolean esMayorEdad() {
	boolean mayor = false;
	
	if (this.edad >= 18) {
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

}



