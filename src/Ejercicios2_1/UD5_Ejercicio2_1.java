package Ejercicios2_1;

public class UD5_Ejercicio2_1 {
	
public static void main(String[] args) {
		
		Punto primera = new Punto (5,0);
		
		Punto segundo = new Punto (10,10);
		
		Punto tercero = new Punto (3,-7);
		
		System.out.println (primera.x + " " + primera.y);
		
		System.out.println (segundo.x + " " + segundo.y);
		
		System.out.println (tercero.x + " " + tercero.y);
		
		/*Multiplicacion*/
		int perimer = primera.x * primera.y;
		
		System.out.println ("Multiplicacion primero: " + perimer);
		
		/*Division*/
		int segundero = segundo.y / segundo.x;
		
		System.out.println ("Division segundo: " + segundero);
		
		/*Suma*/
		int tercerero = tercero.x + tercero.y;
		
		System.out.println ("Suma tercero: " + tercerero);
		
		
	}

}

