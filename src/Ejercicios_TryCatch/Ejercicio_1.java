package Ejercicios_TryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		
		//Construimos teclado
		
		Scanner teclado = new Scanner(System.in);		
		
		// Artributo
		
		int valorA;
		
		//Empezamos el programa
		try {
		System.out.println("Introduce valor");
		
		valorA = teclado.nextInt();
		
		System.out.println("Has introducido " + valorA);
		}
		//Si metemos un valor no valido.....
		catch (InputMismatchException e) {
			
		System.out.println ("Valor introducido incorrecto");	
			
		}
		//Finalizacion (mensaje de finalizacion)
		finally {
		
		System.out.println ("Estoy en el finally");	
			
		}
		

	}

}
