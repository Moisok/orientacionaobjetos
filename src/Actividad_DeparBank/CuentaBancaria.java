package Actividad_DeparBank;

import java.util.Scanner;

public class CuentaBancaria {
	
	int opcion;
	
	String continuar;
	
	static Scanner teclado = new Scanner (System.in);
	
	private static String iban;
	
	private static String titular;
	
	private float saldo;
	
	private int ingreso;
	
	private int retirada;
	
	private int movimientos;
	
	private float contM;
	
	private float contR;
	
	
	public CuentaBancaria (String iban, String titular, float saldo) {
		
		this.iban=iban;
		
		this.titular=titular;
		
		this.saldo=saldo;
	}
	
	/*Menu del cajero*/
	
	public void menu () {
		
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
			System.out.println (" ");
			System.out.println ("El titular de la cuenta es: " + titular);
			System.out.println ("Su Nº de iban es: " + iban);
			System.out.println ("Su saldo disponible es de " + saldo + "€");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 2:	
			opcion = 0;
			System.out.println (" ");
			System.out.println ("El titular de la tarjeta es: " + titular );
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 3:	
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Su saldo disponible es de " + saldo + "€");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 4:	
			opcion = 0;
			System.out.println (" ");
			ingresos(this.saldo);
			System.out.println ("Tienes un saldo actual de: " + saldo + "€");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 5:	
			opcion = 0;
			System.out.println (" ");
			retirada(this.saldo);
			System.out.println ("Tienes un saldo actual de: " + saldo + "€");
			System.out.println (" ");
			System.out.println ("Introduzca 'c' para continuar");
			System.out.print ("SELECCION: ");
			continuar = teclado.next();
			break;
		case 6:	
			opcion = 0;
			System.out.println (" ");
			System.out.println ("Has ingresado dinero: " + ingreso + " veces");
			System.out.println ("Has retirado dinero: " + retirada + " veces");
			System.out.println (" ");
			System.out.println ("Cantidad de dinero ingresada: " + contM + "€");
			System.out.println ("Cantidad de dinero retirada: " + contR + "€");
			System.out.println (" ");
			System.out.println ("Actualmente tiene " + saldo + "€");
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
	
	/*Funcion para los ingresos*/
	
	public float ingresos (float saldo) {
		this.saldo=saldo;
		float ingreso = 0;
		System.out.println (" ");
		System.out.println ("Actualmente tiene " + saldo + "€");
		System.out.println ("Introduce cantidad a ingresar: " );
		System.out.print ("INGRESE(€): ");
		ingreso = teclado.nextFloat();
		this.saldo = this.saldo + ingreso;
		if (ingreso >= 3000) {
		System.err.println ("AVISO: NOTIFICACION A HACIENDA");
		}
		this.ingreso++;
		this.contM= this.contM + ingreso;
		return saldo;
	}
	
	/*Funcion para retirar dinero*/
	public float retirada (float saldo) {
		this.saldo=saldo;
		float retirada = 0;
		System.out.println (" ");
		System.out.println ("Actualmente tiene " + saldo  + "€");
		System.out.println ("Introduce cantidad a retirar: " );
		System.out.print ("RETIRE(€): ");
		retirada = teclado.nextFloat();
		this.saldo = this.saldo - retirada;
		if (this.saldo < -50) {
			System.out.println ("No hay suficiente saldo");
			this.saldo = this.saldo + retirada;
		}
		else {
		if (retirada >= 3000) {
		System.err.println ("AVISO: NOTIFICACION A HACIENDA");
		}
		}
		this.retirada++;
		this.contR= this.contR + retirada;
		return saldo;
	}
		
}
	
	
	
	

