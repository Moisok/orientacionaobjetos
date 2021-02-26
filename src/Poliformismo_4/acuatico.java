package Poliformismo_4;

public class acuatico extends vehiculo{

	//Artributos de acuaticos
	
	protected double eslora;
	
	//Constructor con super
	public acuatico (String matricula, String modelo, double eslora) {
		super (matricula,modelo);
		this.eslora = eslora;
	}
	
	//Metodos heredados
	@Override
	public void imprimir_datos() {
		
	}
	
	
}
