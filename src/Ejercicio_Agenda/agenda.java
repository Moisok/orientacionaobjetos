package Ejercicio_Agenda;

import java.util.ArrayList;

public class agenda {
	//Construimos ArrayList
	
	ArrayList <contacto> agenda_contactos = new ArrayList <contacto>();
	
	//Metodos
	//Aniadir al arraylist
	public void aniadir (contacto cont) {
		agenda_contactos.add(cont);
	}
	
	//Eliminar del arrylist
	public void elmina (contacto cont) {
		agenda_contactos.remove(cont);
	}
	
	
	//Aniadir comprobando
	public boolean aniadirContacto (contacto cont) {
		boolean repetido = false;
		for (contacto x : agenda_contactos) {
			//Se recorre todos los elementos de la lista y se compara el bojeto con el otro
			if (cont.getNombre().equals(x.getNombre())){
				
				repetido = true;
			}
			else {
				repetido = false;
			}
		}
		return repetido;
	}
	
	//Eliminar contacto (si el nombre esta, lo elimina si no no se ha encontrado)
	public boolean eliminarContacto (String nombre) {
				boolean elimina = false;
		for (contacto x : agenda_contactos) {
			//Se recorre todos los elementos de la lista y se compara el bojeto con el otro
			if (nombre.equals(x.getNombre())){
				elimina = true;
			}
			else {
				elimina = false;
			}
		}
		return elimina;
	}
	
	//Comprobar si el contacto existe
	public boolean existeContacto (String nombre) {
		boolean existe = false;
		for (contacto contacto : agenda_contactos) {
			if (nombre.equals(contacto.getNombre())) {
				existe = true;
			}
			else {
				existe = false;
			}
		}
		return existe;
		
	}
	
	//To string de contactos
	public void mostrar() {
		for (contacto contacto : agenda_contactos) {
			System.out.println ("Nombre: " + contacto.getNombre() + " telfono: " + contacto.getTelefono());
		}
	}
	
	//Buscar contacto
	public int buscarContacto (String nombre) {
		
		return agenda_contactos.indexOf(nombre);
			
		}
}
