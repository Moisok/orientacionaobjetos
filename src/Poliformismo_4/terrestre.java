package Poliformismo_4;

public class terrestre extends vehiculo{
	
	//Artributos propios
	
	protected int numRuedas;
	
	private boolean validar_matricula;

	public terrestre(String matricula, String modelo, int numRuedas) {
		super(matricula, modelo);
		this.numRuedas=numRuedas;
	}
	
	//Metodo heredado
	@Override
	public void imprimir_datos() {
	}
	
	//Metodo para validar la matricula
		@Override
		public boolean validar_matricula () {
			validar_matricula= this.validar_matricula;
			if (matricula.matches("^[0-9]{4}[A-Z]{3}")) {
				validar_matricula = true;
			}
			else {
				validar_matricula = false;
			}
			
			return validar_matricula;
		}

}
