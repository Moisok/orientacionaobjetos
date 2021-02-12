package EquipoDeFutbol;

import java.util.ArrayList;

public class Equipo {
	
	//Variables
	
	private String nombreEquipo;
	
	private String estadio;
	
	//Tenemos dentro de una clase, otra clase en este caso entrenador
	private Entrenador entrenador;
	
	//Ahora creamos un arraylist
	ArrayList<Jugador> jugador = new ArrayList<>();

	// Setters y Getters
	
	public String getNombreEquipo() {
		return nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public String getEstadio() {
		return estadio;
	}

	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	public Entrenador getEntrenador() {
		return entrenador;
	}

	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	public ArrayList<Jugador> getJugador() {
		return jugador;
	}

	public void setJugador(ArrayList<Jugador> jugador) {
		this.jugador = jugador;
	}
	
	//To String
	@Override
	public String toString() {
		return "Equipo [nombreEquipo=" + nombreEquipo + ", estadio=" + estadio + "]";
	}
	
	
	public void mostrarJugadores() {
		for (Jugador jugador2 : jugador) {
			System.out.println(jugador2.getNomnbreJugador());
			System.out.println(jugador2.getNacionalidad());
			System.out.println(jugador2.getPosicionJuego());
		}
	}
	
	public void mostrarEntrenador() {
		System.out.println("Entrenador: " + entrenador.getNombreEntrnador());
		
	}
	
	
}
