package Poliformismo_4;

public class aereos extends vehiculo {
	//Artributos propios
	protected int numAsientos;
	
	private boolean validar_matricula;
	
	//Contructor con super
	public aereos (String matricula, String modelo, int numAsientos) {
		super (matricula,modelo);
		this.numAsientos=numAsientos;
	}
	
	//Metodo para validar la matricula
	/*public boolean validar_matricula () {
		matricula = this.matricula;
		if (matricula.matches("^[0-9]{4}\\[A-Za-z]{3}")) {
			validar_matricula = true;
		}
		else {
			validar_matricula = false;
		}
		
		return validar_matricula;
		
	}*/
	
	
	//Metodos heredados
	public void imprimir_datos() {
		
	}

}
