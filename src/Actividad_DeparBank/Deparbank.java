package Actividad_DeparBank;

import java.util.Scanner;

import java.util.regex.Pattern;

public class Deparbank {

	/*Funcion Menu de operaciones*/
	
	public static void menu (CuentaBancaria cuenta) {
		
		int opcion = 0;
		String continuar;
		int ingreso;
		int retirada;
		float cantidad = 0;;
		
		Scanner teclado = new Scanner (System.in);
		
		
		while (opcion < 7) {
		System.out.println (" ");
		System.out.println ("Elige opcion");
		System.out.println ("Introduce 1 <- Para consultar los datos");
		System.out.println ("Introduce 2 <- Mostrar titular");
		System.out.println ("Introduce 3 <- Mostrar saldo");
		System.out.println ("Introduce 4 <- Realizar ingreso");
		System.out.println ("Introduce 5 <- Realizar retirada");
		System.out.println ("Introduce 6 <- Consultar Movimientos");
		System.out.println ("Introduce 7 <- Retirar tarjeta y salir");
		System.out.print ("SELECCION: ");
		
		opcion = teclado.nextInt();
		
		if (opcion > 7) {
			opcion = 0;
			System.out.println (" ");
			System.err.println ("La opcion no es valida");
		}
	
		switch (opcion) {
		
		case 1:
			opcion = 0;
			cuenta.datos();
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 2:	
			opcion = 0;
			System.out.println (" ");
			System.out.println ("El titular de la tarjeta es: " + cuenta.getTitular() );
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 3:	
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Su saldo disponible es de " + cuenta.getSaldo() + "€");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 4:	
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Saldo disponible: " + cuenta.getSaldo() + "€");
			System.out.println ("Introduce cantidad a ingresar: " );
			System.out.print ("INGRESE(€): ");
			cantidad = teclado.nextFloat();
			cuenta.ingresos(cantidad);
			System.out.println ("Tienes un saldo actual de: " + cuenta.getSaldo() + "€");
			System.out.println (" ");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.println (" ");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 5:	
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Saldo disponible: " + cuenta.getSaldo() + "€");
			System.out.println ("Introduce cantidad a retirar: " );
			System.out.print ("RETIRE(€): ");
			cantidad = teclado.nextFloat();
			cuenta.retirada(cantidad);
			System.out.println ("Tienes un saldo actual de: " + cuenta.getSaldo() + "€");
			System.out.println (" ");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.println (" ");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 6:	
			opcion = 0;
			opcion = 0;
			System.out.println (" ");
			cuenta.movimientos();
			System.out.println ("Saldo disponible: " + cuenta.getSaldo() + "€");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 7:	
			System.out.println (" ");
			System.out.println ("Que tenga usted un buen dia y gracias por nuestros servicios");
			break;
	  }	
	}
  }
	
	public static void main (String [] args){
		
		
		Scanner teclado = new Scanner (System.in);
		
		int opcion;
		String nombre;
		int saldo;
		String iban;
		
		/*Menu principal del cajero*/
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
			
			CuentaBancaria cuenta1 = new CuentaBancaria ("ES2165005849555659897474","Manolo");
			menu(cuenta1);
			
			break;
			
		case 2:
			
			System.out.println ("Introduce Nombre de titular: ");
			System.out.print ("INTRODUCE NOMBRE: ");
			nombre = teclado.next();
			System.out.println ("Introduce el numero de iban");
			System.out.println ("recuerda que debe empezar por ES21 seguido de 20 digitos");
			System.out.println (" ");
			System.out.print ("INTRODUCE IBAN: ");
			iban = teclado.next();
			CuentaBancaria cuenta2 = new CuentaBancaria (iban,nombre);
			menu(cuenta2);
			break;
			
			
		case 3:
			System.out.println ("Que tenga usted un buen dia y gracias por nuestros servicios");
			break;
		}
		
		
		
	}
	
}
