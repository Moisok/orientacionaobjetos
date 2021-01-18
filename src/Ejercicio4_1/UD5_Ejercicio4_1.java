package Ejercicio4_1;

import java.util.Scanner;

public class UD5_Ejercicio4_1 {

public static void main(String[] args) {
		
		int desplazaX; 
		
		int desplazaY; 
	
		Scanner teclado = new Scanner (System.in);
		
		Punto primera = new Punto (5,0);
		
		Punto segundo = new Punto (10,10);
		
		Punto tercero = new Punto (3,-7);
		
	
		primera.imprime();
		
		segundo.imprime();
		
		tercero.imprime();
		
		
		
		primera.setXY(6,6);
		
		segundo.setXY(7,3);
		
		tercero.setXY(5,-5);
		
		
		primera.imprime();
		
		segundo.imprime();
		
		tercero.imprime();
		
		/*Desplazar primer punto*/
		System.out.println ("Desplazar puntos");
		System.out.println ("Desplaza el punto X del primer punto");
		desplazaX = teclado.nextInt();
		System.out.println ("Desplaza el punto Y del primer punto");
		desplazaY = teclado.nextInt();
		primera.desplaza(desplazaX,desplazaY);
		primera.imprime();
		
		
		/*desplazar segundo punto*/
		System.out.println ("Desplazar puntos");
		System.out.println ("Desplaza el punto X del segundo punto");
		desplazaX = teclado.nextInt();
		System.out.println ("Desplaza el punto Y del segundo punto");
		desplazaY = teclado.nextInt();
		segundo.desplaza(desplazaX,desplazaY);
		segundo.imprime();
		
		primera.distancia(segundo);
	}

}
