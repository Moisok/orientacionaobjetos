package Poliformismo_4;

public class helicoptero extends aereos {

	//Artributos propios
	
	private int numeroHelices;
	
	//Constructor con super
	public helicoptero (String matricula, String modelo, int numAsientos, int numHelices) {
		super (matricula,modelo,numAsientos);
		this.numeroHelices=numHelices;
	}
	
	//Metodos heredados para mostrar informacion
	@Override
	public void imprimir_datos() {
		String datos = "Matricula: " + matricula + " Modelo: " + modelo + " Asientos: " + numAsientos + " Numero de helices: " + numeroHelices;
		System.out.println (datos);
	}
}
