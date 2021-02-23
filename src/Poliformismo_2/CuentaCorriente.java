package Poliformismo_2;

public class CuentaCorriente extends CuentaBancaria {

	//Constructor Super
	
	public CuentaCorriente (int numeroCuenta, int saldo, int interesAnualBasico) {
		super (numeroCuenta,saldo,interesAnualBasico);
	}
	
	//Clases hederadas
	//Calcular intereses
		@Override
		public void calcularintereses() {
			double intereses1 = saldo*interesAnualBasico;
			double intereses2 = intereses1/100;
			System.out.println ("intereses: " + intereses2);
		}
	//Mostrar datos de cuenta
	@Override
	public void mostrar() {
	System.out.println ("Cuenta corriente");
	System.out.println ("Iban: " + numeroCuenta);
	System.out.println ("Saldo: " + saldo);
	System.out.println ("Intereses: " + interesAnualBasico + "%");
	System.out.println (" ");
	}
	
}
