package Ejercicio2;

public class Datos_main {

	public static void main(String[] args) {
		
		Persona Manuel = new Persona ();
		Persona Alfonso = new Persona ();
		
		Manuel.nombre="Manuel";
		
		Manuel.apellido="Cervantes";
		
		Manuel.edad=54;
		
		Manuel.dni=54577809;
		
		Alfonso.nombre="Alfonso";
		
		Alfonso.apellido="Garcia";
		
		Alfonso.edad=21;
		
		Alfonso.dni=57899850;
		
		System.out.println (" ");
		System.out.println ("Nombre: " + Manuel.nombre);
		System.out.println ("Apellido: " + Manuel.apellido);
		System.out.println ("Edad: " + Manuel.edad);
		System.out.println ("DNI: " + Manuel.dni);
		System.out.println (" ");
		System.out.println ("Nombre: " + Alfonso.nombre);
		System.out.println ("Apellido: " + Alfonso.apellido);
		System.out.println ("Edad: " + Alfonso.edad);
		System.out.println ("DNI: " + Alfonso.dni);

	}

}
