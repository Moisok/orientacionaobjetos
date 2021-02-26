package Poliformismo_4;

public class submarino extends acuatico {

	//Artributos porpios
	private double profundidad;
	
	//Constructor con super
	public submarino (String matricula, String modelo, double eslora, double profundidad) {
		super (matricula,modelo,eslora);
		this.profundidad=profundidad;
	}
	
	//Metodos heredados
	@Override
	public void imprimir_datos() {
		String datos = "Matricula: " + matricula + " Modelo: " + modelo + " Eslora: " + eslora + " profundidad: " + profundidad;
		System.out.println (datos);
	}
}
