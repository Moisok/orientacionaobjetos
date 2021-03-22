package Ejercicios_TryCatch;

import java.util.*;

public class Ejercicio_4 {

	public static void main(String[] args) {
		
		//Scanner
		Scanner teclado = new Scanner (System.in);
		
		//Artributos
		//Numero aleatorio entre 1 y 100
		
		int aleatorio = (int)(Math.random()*100);
		
		//Vector
		
		int vector [] = new int [aleatorio];
		
		//Posicion
		
		int posicion;

		//Mensaje
		
		System.out.println ("Se ha generado un vector de: " + aleatorio + " posiciones");
		
		//Empezamos el programa
		
		try {
			
			//Bucle para rellenar con aleatorios
			for (int i=0; i<vector.length; i++) {
				int aleatorios2 = (int)(Math.random()*10);
				vector[i]=aleatorios2;
			}
			
			//Pedimos valor (posicion de vector)
			System.out.println ("¿Que posicion quieres ver?");
			posicion = teclado.nextInt();
			
			//Mostramos todo el vector para comprobar que es cierto
			
	
			for (int e=0; e<vector.length; e++) {
				System.out.println ("P" + e + ":["+vector[e]+"] ");
			}
			
			//Mostramos la posicion
			
			System.out.println (" ");
			
			System.out.println ("En la posicion: " + posicion + " del vector se encuentra el numero: [" + vector[posicion] + "]");
			
		}
		
		catch (ArrayIndexOutOfBoundsException a) {
			System.out.println ("La posicion no es correcta, no hay tantas posiciones:" + a);
		}
		
		catch (InputMismatchException e) {
			System.out.println ("El valor no es valido:" + e);
		}
		
		finally {
			System.out.println (" ");
			System.out.println ("Estoy en el final");
		}
		
		
	}

}
