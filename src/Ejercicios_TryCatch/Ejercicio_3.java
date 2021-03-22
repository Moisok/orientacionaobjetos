package Ejercicios_TryCatch;

import java.util.*;

public class Ejercicio_3 {

	public static void main(String[] args) {
	
		//Construimos teclado y artributos
		
		Scanner teclado = new Scanner(System.in);
		
		double vector [] = new double [5];
		
		double valor;
		
		//Empezamos el programa
		
		try {
		for (int i=0; i<vector.length+2; i++) {
			
			System.out.println ("Introduce valor");
			
			valor = teclado.nextDouble();
			
			vector[i] = valor;
			
			System.out.println ("Has introducido: " + valor);
		}
		
		for (int e=0; e<vector.length; e++) {
			
			System.out.println (vector[e]);
		}
		
		}
		
		//Comprobacion
		
		catch (InputMismatchException e) {
			
			System.out.println ("Valor introducido incorrecto" + e);
		}
		
		catch (ArrayIndexOutOfBoundsException b) {
			
			System.out.println ("Te has pasado"
				+ b );
			
		}
		
		//Final
		
		finally {
			
			System.out.println ("Estoy en el final");
		}
		
		
	}

}
