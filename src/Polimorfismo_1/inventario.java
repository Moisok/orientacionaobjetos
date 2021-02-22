package Polimorfismo_1;

import java.util.ArrayList;

public class inventario {
	
	//Construimos el ArrayList
	private ArrayList<mascotas>animales=new ArrayList<mascotas>();

	//Mostrar lista de animales
	private String getTipoMascota (mascotas m) {
		
		String cadena = null;
		
		if (m instanceof perro){
			cadena =  " perro ";
		}
		if (m instanceof gato){
			cadena =  " gato ";
		}
		if (m instanceof loro){
			cadena = " loro ";
		}
		if (m instanceof canario){
			cadena =  " canario ";
		}
		return cadena;
	}
	
	//Mostrar lista de animales
	public void mostrarListaAnimales() { 
		System.out.println (" ");
		System.out.println("Lista de animales");
		for (int i=0;i<animales.size();i++) {
			mascotas m = animales.get(i);
			String tipo = getTipoMascota(m);
			String nombre = m.nombre;
			System.out.println (m.nombre + " es un " + tipo);
		}
		
	}
	
	//Mostrar un animal 
	public void mostrarUnAnimal (int indice) {
		System.out.println (animales.get(indice).toString());
	}
	
	//Mostrar todos los animales
	
	public void mostrarTodosAnimales() {
		System.out.println (" ");
		System.out.println("Todos los animales");
		for (mascotas mascotas : animales) {
			mascotas.muestra();
		}
	}
	  
	//Insertar un animal 
	public void insertarAnimal(mascotas a) {
		animales.add(a);
	}
	
	//Eliminar un animal
	public void eliminarAnimal (int indice) {
		animales.remove(indice);
	}
	
	//Vaciar el inventario
	public void caciarInventario() {
		animales.clear();
	}
	
}
