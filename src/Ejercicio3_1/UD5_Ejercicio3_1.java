package Ejercicio3_1;

public class UD5_Ejercicio3_1 {

public static void main(String[] args) {
		
		Punto primera = new Punto (5,0);
		
		Punto segundo = new Punto (10,10);
		
		Punto tercero = new Punto (3,-7);
		
		System.out.println (primera.getX() + " " + primera.getY());
		
		System.out.println (segundo.getX() + " " + segundo.getY());
		
		segundo.setX(9);
		segundo.setY(11);
		
		System.out.println (segundo.getX() + " " + segundo.getY());
		
		System.out.println (tercero.getX() + " " + tercero.getY());
		
		/*Multiplicacion*/
		int perimer = primera.getX() * primera.getY();
		
		System.out.println ("Multiplicacion primero: " + perimer);
		
		/*Division*/
		int segundero = segundo.getX() / segundo.getY();
		
		System.out.println ("Division segundo: " + segundero);
		
		/*Suma*/
		int tercerero = tercero.getX() + tercero.getY();
		
		System.out.println ("Suma tercero: " + tercerero);
		
		
	}

}


