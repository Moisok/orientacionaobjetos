package Excepcion_ejercicio7;

//Ejercicio de los gatos con ArrayList por Moises

import java.util.*;

import Excepcion_Ejercicio6.gato;

public class gato_main {

	public static void main(String[] args)   {
		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList <gato> Lista_gatos = new ArrayList<gato>();
		
		String nombre;
		
		int edad;
		
		try {
			
			for (int i=0;i<5;i++) {
				
				System.out.println ("Introduce nombre");
				
				nombre = teclado.next();
				
				System.out.println ("Introduce edad");
				
				edad = teclado.nextInt();
				
				gato gatos = new gato (nombre, edad);
				
				Lista_gatos.add(gatos);
			}
			
			for (gato gato : Lista_gatos) {
				System.out.println(gato.info());
			}
			
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}



//Primer Gato
/*System.out.println ("Introduce nombre para gato1");
nombre = teclado.next();
System.out.println ("Introduce edad para gato1");
edad = teclado.nextInt();
gato gato1 = new gato (nombre, edad); */