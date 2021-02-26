package Poliformismo_4;

public class terrestre extends vehiculo{
	
	//Artributos propios
	
	protected int numRuedas;

	public terrestre(String matricula, String modelo, int numRuedas) {
		super(matricula, modelo);
		this.numRuedas=numRuedas;
	}
	
	//Metodo heredado
	@Override
	public void imprimir_datos() {
	}

}
