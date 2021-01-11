package Ejercicio1;

public class UD5_EjercicioA1 {

	public static void main(String[] args) {
		
		Punto primera = new Punto ();
		
		Punto segundo = new Punto ();
		
		Punto tercero = new Punto ();
		
		primera.x=5;
		primera.y=0;
		
		segundo.x=10;
		segundo.y=10;
		
		tercero.x=-3;
		tercero.y=7;
		
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
