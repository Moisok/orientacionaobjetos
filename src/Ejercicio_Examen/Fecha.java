package Ejercicio_Examen;

public class Fecha {

	//Definimos artributos
	
	private int dia;
	
	private int mes;
	
	private int anio;
	
	//Creamos constructor
	
	public Fecha (int dia, int mes, int anio) {
		
		this.dia=dia;
		
		this.mes=mes;
		
		this.anio=anio;
		
	}

	//Creamos Getters
	
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAnio() {
		return anio;
	}
	
	
	//Metodo To String
	
	@Override
	public String toString() {
		return "[ " +dia + "/" + mes + "/" + anio + "]";
	}
	
	}
	
	
	
	

