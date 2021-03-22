package Ejercicios_TryCatch;

import java.util.*;

public class Ejercicio_2 {
	
	public static void main (String [] args) {

	//Construccion de Scanner
	Scanner teclado = new Scanner(System.in);
	
	//Artributos
	
	int valorA;
	
	int valorB;
	
	int division;
	
	//Empezamos el programa
	try {
		
		//Pedimos por pantalla
		
		System.out.println ("Introduce valor (A)");
		
		valorA = teclado.nextInt();
		
		System.out.println ("Introduce valor (B)");
		
		valorB =teclado.nextInt();
		
		division = valorA/valorB;
		
		System.out.println ("El resultado es: " + division);
		
	}
	
	//Comprobar
	
	catch (InputMismatchException e) {
		
		System.out.println ("Valor introducido incorrecto");
	}
	
	catch (ArithmeticException b) {
		
		System.out.println ("Los valores no son correctos");
		
	}
	
	//Final
	
	finally {
		
		System.out.println ("Estoy en el final");
	}
	
	}
}