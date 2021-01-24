package Actividad_DeparBank;

import java.util.Scanner;

public class Deparbank {

	public static void main (String [] args){
		
		
		Scanner teclado = new Scanner (System.in);
		
		int opcion;
		String nombre;
		int saldo;
		String iban;
		
		System.out.println ("Bienvenido al cajero de DeparBank");
		System.out.println ("A continuacion tendra que elegir");
		System.out.println (" ");
		System.out.println ("Opcion1: Ingresar tarjeta existente");
		System.out.println ("Opcion2: Crear nueva cuenta bancaria");
		System.out.println ("Opcion3: Salir");
		System.out.print ("SELECCION: ");
		opcion = teclado.nextInt();
		
		if (opcion > 3) {
			System.err.println ("Opcion no Valida");
		}
		
		switch (opcion) {
		
		case 1:
			
			CuentaBancaria cuenta1 = new CuentaBancaria ("ES21 6500 5849 55 5659897474","Manolo",0);
			cuenta1.menu();
			break;
			
		case 2:
			
			System.out.println ("Introduce Nombre de titular: ");
			System.out.print ("INTRODUCE NOMBRE: ");
			nombre = teclado.next();
			System.out.println ("¿Cuanto saldo quieres introducir?");
			System.out.print ("INGRESE(€): ");
			saldo = teclado.nextInt();
			if (saldo >= 3000) {
				System.err.println ("AVISO: NOTIFICACION A HACIENDA");
				}
			
			CuentaBancaria cuenta2 = new CuentaBancaria ("ES21 6500 5849 55 5659897474",nombre,saldo);
			cuenta2.menu();
			break;
			
			
		case 3:
			System.out.println ("Que tenga usted un buen dia y gracias por nuestros servicios");
			break;
		}
		
		
		
	}
	
}
