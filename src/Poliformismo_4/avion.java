package Poliformismo_4;

public class avion extends aereos {

	//Artributos propios
	private double tiempoVuelo;
	
	//Constructor super
	public avion (String matricula, String modelo, int numAsientos, double tiempoVuelo) {
		super (matricula,modelo,numAsientos);
		this.tiempoVuelo=tiempoVuelo;
	}
	
	//Metodo heredado para mostrar informacion
	@Override
	public void imprimir_datos() {
		String datos = "Matricula: " + matricula + " Modelo: " + modelo + " Asientos: " + numAsientos + " Tiempo maximo de vuelo: " + tiempoVuelo;
		System.out.println (datos);
	}
	
}
