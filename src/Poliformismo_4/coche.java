package Poliformismo_4;

public class coche extends terrestre {

	//Artributos propios
	private boolean aire;

	//Constructor super
	public coche(String matricula, String modelo, int numRuedas, boolean aire) {
		super(matricula, modelo, numRuedas);
		this.aire=aire;
	}

	
	//Mostrar datos
	@Override
	public void imprimir_datos() {
		String datos = "Matricula: " + matricula + " Modelo: " + modelo + " Ruedas: " + numRuedas + " ¿tiene aire acondicionado?: " + aire;
		System.out.println (datos);
	}
	
	
	
	
	
	
}
