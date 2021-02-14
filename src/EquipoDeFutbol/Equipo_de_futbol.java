//Ejercicio del equipo de futbol, creado a partir de los pasos del video
//Creado por Moises Sepulveda Segarra

package EquipoDeFutbol;

import java.util.ArrayList;

public class Equipo_de_futbol {

	public static void main(String[] args) {
		
		//Contruccion del entrenador
		Entrenador entrenador = new Entrenador();
		
		entrenador.setNombreEntrnador("Bartolo Contreras");
		entrenador.setNacionalidad("Espania");
		
		//Construccion de los jugadores
		Jugador jugador1 = new Jugador();
		Jugador jugador2 = new Jugador();
		
		jugador1.setNomnbreJugador("Alfonsito");
		jugador1.setNacionalidad("Italia");
		jugador1.setPosicionJuego("Delantero");
		
		jugador2.setNomnbreJugador("Griezma");
		jugador2.setNacionalidad("Frances");
		jugador2.setPosicionJuego("Defensa");
		
		//Creamos nuevo arraylist
		ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
		//Llenamos el ArrayList
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		
		//Construccion del equipo
		Equipo equipo = new Equipo();
		
		equipo.setNombreEquipo("PuenteTocinosFC");
		equipo.setEstadio("Estadio municipal PuenteTocinos");
		equipo.setEntrenador(entrenador);
		equipo.setJugador(jugadores);
		
		//Mostramos los datos
		System.out.println(equipo.toString());
		System.out.println(" ");
		equipo.mostrarJugadores();
		System.out.println(" ");
		equipo.mostrarEntrenador();
	}
}
