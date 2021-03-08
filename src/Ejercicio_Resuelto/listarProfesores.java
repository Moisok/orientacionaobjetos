package Ejercicio_Resuelto;

//Clase para listar a las personas

import java.util.ArrayList;

public class listarProfesores {

	//Creamos arraylist
	ArrayList<profesor>listado = new ArrayList<profesor>();
	
	
	//Metodo para añadir persona al arraylist
	public void añadir (profesor p) {
		listado.add(p);
	}
	
	//Metodo para eliminar del arraylist
	public void eliminar (profesor p) {
		listado.remove(p);
	}
	
	//metodo para mostrar datos del arraylist
	public void mostrar () {
		for (profesor profesor : listado) {
			System.out.println(profesor.informacion());
		}
	}
}	
