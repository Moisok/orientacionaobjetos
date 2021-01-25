package Actividad_DeparBank;

import java.util.Scanner;

import java.util.regex.Pattern;

public class CuentaBancaria {
	
	static Scanner teclado = new Scanner (System.in);
	
	private final String iban;
	
	private final String titular;
	
	private float saldo;
	
	private int [] movimientos = new int [100];

	private int nMovimientos;
	
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
	public float ingresos (float saldo) {
		float ingreso = 0;
		ingreso = teclado.nextFloat();
		if (ingreso >= 3000) {
		System.out.println (" ");
		System.err.println ("AVISO: NOTIFICACION A HACIENDA");
		System.out.println (" ");
		}
		this.saldo = this.saldo + ingreso;
		nMovimientos++;
		System.out.println (nMovimientos);
		return saldo;
	}
	
	/*Funcion para retirar dinero*/
	
	public float retirada (float saldo) {
		float retirada = 0;
		retirada = teclado.nextFloat();
		if (retirada >= 3000) {
			System.out.println (" ");
			System.err.println ("AVISO: NOTIFICACION A HACIENDA");
			System.out.println (" ");
			}
		this.saldo = this.saldo - retirada;
		if (this.saldo < -50) {
			System.out.println (" ");
			System.out.println (" ");
			System.err.println ("No hay suficiente Saldo");
			System.out.println (" ");
			System.out.println (" ");
			this.saldo = this.saldo + retirada;
			return saldo;
		}
		nMovimientos++;
		System.out.println (nMovimientos);
		return saldo;
	}

	/*Funcion para ver los datos*/
	public void datos() {
		System.out.println (" ");
		System.out.println ("El titular de la cuenta es: " + this.titular);
		System.out.println ("Su Nº de iban es: " + this.iban);
		System.out.println ("Su saldo disponible es de " + this.saldo);
		System.out.println (" ");
	}
	
	public void movimientos () {
		System.out.println ("Has realizado " + nMovimientos);
		System.out.println (" ");
		for (int i = 0; i<this.nMovimientos; i++) {
			System.out.println ((i+1) + ": " + this.movimientos[this.nMovimientos]);
		}
		
	}
	
	
}
	
	
	
	

