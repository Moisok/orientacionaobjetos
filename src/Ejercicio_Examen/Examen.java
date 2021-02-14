package Ejercicio_Examen;

import java.util.ArrayList;

public class Examen {

	//Artributos
	
	String asignatura;
	
	String aula;
	
	Hora hora;
	
	 Fecha fecha;
	
	// Generamos getters y setters

	public String getAsignatura() {
		return asignatura;
	}

	public String getAula() {
		return aula;
	}

	public Hora getHora() {
		return hora;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public void setAula(String aula) {
		this.aula = aula;
	}

	public void setHora(Hora hora) {
		this.hora = hora;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}
	
	//Metodo to string
	@Override
	public String toString() {
		return "Examen [asignatura= " + asignatura + ", aula= " + aula + ", hora= " + hora + ", fecha= " + fecha + "]";
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
}
