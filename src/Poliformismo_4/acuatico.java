package Poliformismo_4;

public class acuatico extends vehiculo{

	//Artributos de acuaticos
	
	protected double eslora;
	
	private boolean validar_matricula;

	
	//Constructor con super
	public acuatico (String matricula, String modelo, double eslora) {
		super (matricula,modelo);
		this.eslora = eslora;
	}
	
	//Metodos heredados
	@Override
	public void imprimir_datos() {
		
	}
	
	//Metodo para validar la matricula
			@Override
			public boolean validar_matricula () {
				validar_matricula= this.validar_matricula;
				if (matricula.matches("^[A-Z]{10}")) {
					validar_matricula = true;
				}
				else {
					validar_matricula = false;
				}
				
				return validar_matricula;
			}
	
	
}
