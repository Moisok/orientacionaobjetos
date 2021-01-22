package Ejercicio5_2;

import java.util.Scanner;

public class UD5_Ejercicio5_2 {

public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in);
		System.out.print ("Introduce Nombre: ");
		String nombre = teclado.next();
		System.out.println(" ");
		System.out.print("Introduce apellido: ");
		String apellido = teclado.next();
		System.out.println(" ");
		System.out.print("Introduce edad: ");
		int edad = teclado.nextInt();
		System.out.println(" ");
		System.out.print("Introduce DNI (8 numero y 1 letra): ");
		String DNI = teclado.next();
		
		Persona persona1 = new Persona (nombre,apellido,edad,DNI);
		
		teclado = new Scanner(System.in);
		System.out.print ("Introduce Nombre: ");
		nombre = teclado.next();
		System.out.println(" ");
		System.out.print("Introduce apellido: ");
		apellido = teclado.next();
		System.out.println(" ");
		System.out.print("Introduce edad: ");
		edad = teclado.nextInt();
		System.out.println(" ");
		System.out.print("Introduce DNI (8 numero y 1 letra): ");
		DNI = teclado.next();
		
		Persona persona2 = new Persona (nombre,apellido,edad,DNI);

		persona1.imprime();
		
		persona2.imprime();
		
		System.out.println ("La difenrencia de edad entre " + persona1.getnombre() + " y " + persona2.getnombre() + " es de "+ persona2.diferenciaEdad(persona1) + " años");
		
		if (persona1.esMayorEdad()) {
			System.out.println (persona1.getnombre() + " es mayor de edad");
		}
		
		else {
			System.out.println (persona1.getnombre() + " no es mayor de edad");
		}
		
		
		if (persona2.esMayorEdad()) {
			System.out.println (persona2.getnombre() + " es mayor de edad");
		}
		
		else {
			System.out.println (persona2.getnombre() + " no es mayor de edad");
		}
	
	}

}






