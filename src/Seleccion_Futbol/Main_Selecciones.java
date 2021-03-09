package Seleccion_Futbol;

import java.util.ArrayList;

//Clase principal main, programa para gestionar selecciones de futbol (o equipos)
//Creado por Moises Sepulveda Segarra
public class Main_Selecciones {
	
	public static void main (String [] args) {
		
		//Creamos a tres integrantes de la seleccion, un jugador, un masajista y un entrenador
		
		//Entrenador
		Entrenador luis = new Entrenador (001, "Luis", "Enrique", 59, 021);
		
		//Futbolista
		Futbolista pedro = new Futbolista (001, "Pedro", "Gonzalez", 21, 07, "Delantero");
		
		//Masajista
		Masajista raul = new Masajista (001, "Raul", "Martinez", 30, "Masajista", 10);
		
		//Creamos ArrayList y mostramos informacion en bucle foreach
		
		ArrayList <SeleccionFutbol> listado = new ArrayList <SeleccionFutbol>();
		
		listado.add(luis);
		listado.add(pedro);
		listado.add(raul);
		
		for (SeleccionFutbol seleccionFutbol : listado) {
			seleccionFutbol.informacion();
		}
		
		//Vamos a ver los metodos en cada tipo
		
		for (SeleccionFutbol seleccionFutbol : listado) {
			seleccionFutbol.entrenar();
			seleccionFutbol.viajar();
			seleccionFutbol.concentrar();
			seleccionFutbol.jugarPartido();
		}
		
			System.out.println (" ");
		//Vamos a ver los metodos de cada uno
			luis.planificarEntrenamiento();
			System.out.println (" ");
			pedro.entrevista();
			System.out.println (" ");
			raul.darMasaje();
	}

}
