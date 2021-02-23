package Poliformismo_2;

public class CuentaAhorro extends CuentaBancaria {
	//Constantes
	private final int saldoMinimo = 100;
	
	//Contructor
	
	public CuentaAhorro (int numeroCuenta, int saldo, int interesAnualBasico) {
		super (numeroCuenta,saldo,interesAnualBasico);
		//this.saldoMinimo=saldoMinimo;
	}
	
	//Metodos hederados
	//Calcular intereses
		@Override
		public void calcularintereses() {
			double intereses;
			if (saldoMinimo > 500) {
			intereses = saldo*(interesAnualBasico/100);
			System.out.println ("intereses: " + intereses);
			}
			else {
			intereses = saldo*(interesAnualBasico/50);
			System.out.println ("intereses: " + intereses);
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
