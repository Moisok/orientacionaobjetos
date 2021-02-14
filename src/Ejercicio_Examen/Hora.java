package Ejercicio_Examen;

public class Hora {
	
	//Creamos artributos

	int horas;
	
	int minutos;
	
	//Constructor
	
	public Hora (int horas, int minutos) {
		
		this.horas=horas;
		
		this.minutos=minutos;		
	}

	//Getters
	public int getHoras() {
		return horas;
	}

	public int getMinutos() {
		return minutos;
	}

	//To String
	@Override
	public String toString() {
		return "[" + horas + ":" + minutos + "]";
	}

	
	
	
	

}
