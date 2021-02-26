package Poliformismo_4;

public class moto extends terrestre {

	//Artributos propios
	private String color;

	//Constructor
	public moto(String matricula, String modelo, int numRuedas, String color) {
		super(matricula, modelo, numRuedas);
		this.color=color;
		
	}
	
	//Metodo heredado de mostrar datos
	@Override
	public void imprimir_datos() {
		String datos = "Matricula: " + matricula + " Modelo: " + modelo + " Ruedas: " + numRuedas + " color: " + color;
		System.out.println (datos);
	}

	
	
	
}
