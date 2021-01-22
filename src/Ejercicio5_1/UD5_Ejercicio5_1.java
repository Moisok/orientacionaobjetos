package Ejercicio5_1;

import java.util.Scanner;

public class UD5_Ejercicio5_1 {

public static void main(String[] args) {
		
		int desplazaX; 
		
		int desplazaY; 
	
		Scanner teclado = new Scanner (System.in);
		
		Punto primera = new Punto (0,0);
		
		Punto segundo = new Punto (0,0);
		
		Punto tercero = new Punto (0,0);
		
		Punto cuarto = new Punto (0,0);
		
		Punto.creaPuntoAleatorio(primera);
	
		primera.imprime();
		
		Punto.creaPuntoAleatorio(segundo);
		
		segundo.imprime();
		
		Punto.creaPuntoAleatorio(tercero);
		
		tercero.imprime();
		
		Punto.creaPuntoAleatorio(cuarto);
		
		cuarto.imprime();
		
		/*Desplazar primer punto*/
		/*System.out.println ("Desplazar puntos");
		System.out.println ("Desplaza el punto X del primer punto");
		desplazaX = teclado.nextInt();
		System.out.println ("Desplaza el punto Y del primer punto");
		desplazaY = teclado.nextInt();
		primera.desplaza(desplazaX,desplazaY);
		primera.imprime();*/
		
		
		/*desplazar segundo punto*/
		/*System.out.println ("Desplazar puntos");
		System.out.println ("Desplaza el punto X del segundo punto");
		desplazaX = teclado.nextInt();
		System.out.println ("Desplaza el punto Y del segundo punto");
		desplazaY = teclado.nextInt();
		segundo.desplaza(desplazaX,desplazaY);
		segundo.imprime();
		
		primera.distancia(segundo);*/

		

	}
}
