package NumerosComplejos;


/*Calculadora de numeros complejos creada por moises sepulveda*/

import java.util.Scanner;

public class NumerosComplejos {

	public static void main (String [] args) {
		
		complejos complejo1 = new complejos(8,3);
		complejos complejo2 = new complejos(5,7);
		
		complejo1.imprimir();
		complejo2.imprimir();
		
		System.out.println("La suma es: " + complejo1.suma(complejo2));
		System.out.println(" ");
		System.out.println("La resta es: " + complejo1.resta(complejo2));
		System.out.println(" ");
		System.out.println("La multiplicacion es: " + complejo1.multiplicar(complejo2));
		System.out.println(" ");
		System.out.println("La division es: " + complejo1.division(complejo2));
		System.out.println(" ");
		

	}
	
	
}
