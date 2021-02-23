package Poliformismo_2;

public abstract class CuentaBancaria {

	protected int numeroCuenta;
	
	protected int saldo;
	
	protected int interesAnualBasico;
	
	//Constructor
	
	public CuentaBancaria (int numeroCuenta, int saldo, int interesAnualBasico) {
		
		this.numeroCuenta=numeroCuenta;
		
		this.saldo=saldo;
		
		this.interesAnualBasico=interesAnualBasico;
		
	}
	
	//Getters
	public int getNumeroCuenta (int numeroCuenta) {
		return numeroCuenta;
	}
	
	public int getSaldo (int saldo) {
		return saldo;
	}
	
	
	/*Actualizar el saldo*/
	private void aniadir (int cantidad) {
		this.saldo=this.saldo+cantidad;
	}
	
	//Ingresar
	public void ingresar (int cantidad) {
		aniadir(cantidad);
	}
	
	//Retirar
	public void retirar (int cantidad) {
		if (this.saldo<cantidad) {
			System.err.println("No hay suficientes fondos");
		}
		else {
		aniadir(-cantidad);
		}

	}
	
	//Le paso una cuenta y le sumo el saldo de la otra
	public void transpaso (int cantidad, CuentaBancaria C) {
		this.retirar(cantidad);
		C.ingresar(cantidad);
	}
	
	//Clase que debe heredar
	public abstract void calcularintereses();
	
	public abstract void mostrar();
}
