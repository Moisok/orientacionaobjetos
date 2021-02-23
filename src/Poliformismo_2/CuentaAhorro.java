package Poliformismo_2;

public class CuentaAhorro extends CuentaBancaria {
	//Constantes
	private final int saldoMinimo = 950;
	
	//Contructor
	
	public CuentaAhorro (int numeroCuenta, int saldo, int interesAnualBasico) {
		super (numeroCuenta,saldo,interesAnualBasico);
		//this.saldoMinimo=saldoMinimo;
	}
	
	//Metodos hederados
	//Calcular intereses
		@Override
		public void calcularintereses() {
			if (saldoMinimo > 950) {
			double intereses1 = saldo*interesAnualBasico;
			double intereses2 = intereses1/100;
			System.out.println ("intereses: " + intereses2);
			}
			else {
			double intereses1 = saldo*interesAnualBasico;
			double intereses2 = intereses1/50;
			System.out.println ("intereses: " + intereses2);
			}
		}
		@Override
		public void mostrar() {
		System.out.println ("Cuenta de ahorro");
		System.out.println ("Iban: " + numeroCuenta);
		System.out.println ("Saldo: " + saldo);
		System.out.println ("Intereses: " + interesAnualBasico + "%");
		System.out.println (" ");
		}

}
