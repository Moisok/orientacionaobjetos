package Poliformismo_4;

public abstract class vehiculo {
	
	protected final String matricula;
	
	protected final String modelo;
	
	//Constructor
	public vehiculo (String matricula, String modelo) {
		this.matricula=matricula;
		this.modelo=modelo;
	}
	
	//Getter de modelo y matricula
	
	public String getMatricula() {
		return matricula;
	}

	public String getModelo() {
		return modelo;
	}
	

	//Metodos a heredar
	public abstract void imprimir_datos();
	
	public abstract boolean validar_matricula ();

	

}
