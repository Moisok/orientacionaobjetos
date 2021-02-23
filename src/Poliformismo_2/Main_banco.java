package Poliformismo_2;

//Ejercicio del banco, creado por Moises Sepulveda Segarra, en esta ocasion vamos a usar el 
//polimorfismo en un ejercicio en el cual hay que realizar operaciones en dos cuentas bancarias
public class Main_banco {
	public static void main(String[] args) {
		
		//creamos las dos cuentas bancarias
		CuentaCorriente cuenta1 = new CuentaCorriente (876567876,650,3);
		CuentaAhorro cuenta2 = new CuentaAhorro (323656987,0,3);
		
		//Ahora las mostramos
		cuenta1.mostrar();
		cuenta2.mostrar();
	
		//Añadimos saldo en la cuenta corriente y msotramos
		cuenta1.ingresar(500);
		cuenta1.mostrar();
		
		//Retiramos saldo en la cuenta corriente y mostramos
		cuenta1.retirar(300);
		cuenta1.mostrar();
		
		//Transpasamos dinero de la cuenta corriente a la cuenta
		//de ahorros y mostramos ambas cuentas
		cuenta1.transpaso(300, cuenta2);
		cuenta1.mostrar();
		cuenta2.mostrar();
		
		//Calculamos intereses
		cuenta1.calcularintereses();
		cuenta2.calcularintereses();

	}

}
