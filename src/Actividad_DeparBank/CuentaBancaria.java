package Actividad_DeparBank;

import java.util.Scanner;

import java.util.regex.Pattern;

public class CuentaBancaria {
	
	static Scanner teclado = new Scanner (System.in);
	
	private final String iban;
	
	private final String titular;
	
	private float saldo;
	
	private final int max = 100;
	
	private float movimientos [] = new float [max];

	private int nMovimientos = 0;
	
	private static boolean validarIBAN;
	
	public CuentaBancaria (String iban, String titular) {
		
		this.iban=iban;
		
		this.titular=titular;
		
	}
	
	/*Construccion de getters*/
	public String getIban() {
		return iban;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public float getSaldo() {
		return saldo;
	}

	/*Funcion para los ingresos*/
	public void ingresos (float cantidad) {
		
		if (cantidad >= 3000) {
		System.out.println (" ");
		System.err.println ("AVISO: NOTIFICACION A HACIENDA");
		System.out.println (" ");
		}
		this.saldo = this.saldo + cantidad;
		this.movimientos[nMovimientos]=cantidad;
		nMovimientos++;
	}
	
	
	/*Funcion para retirar dinero*/
	public void retirada (float cantidad) {
		
		if ((this.saldo - cantidad) < -50) {
			System.out.println (" ");
			System.err.println ("No hay suficiente Saldo");
			System.out.println (" ");
			
		}
		
		else {
			
			this.saldo = this.saldo - cantidad;
			this.movimientos[nMovimientos]=-cantidad;
			this.nMovimientos++;
		}

	}

	/*Funcion para ver los datos*/
	
	public void datos() {
		System.out.println (" ");
		System.out.println ("El titular de la cuenta es: " + this.titular);
		System.out.println ("Su Nº de iban es: " + this.iban);
		System.out.println ("Su saldo disponible es de " + this.saldo);
		System.out.println (" ");
	}
	
	/*Funcion para ver los movimientos*/
	
	public void movimientos () {
		
		System.out.println (" ");
		
		for (int i = 0; i<this.nMovimientos; i++) {
		System.out.println ("Movimiento" +(i+1) + ": "+ this.movimientos[i]+ "€");
		}
	}
}
	
	
	
	

