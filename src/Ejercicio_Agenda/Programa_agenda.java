package Ejercicio_Agenda;

public class Programa_agenda {

	public static void main(String[] args) {
		
		//Construyo los objetos
		contacto pepe = new contacto ("Pepe", 78679);
		contacto arturo = new contacto ("Arturo", 78679);
		contacto natalia = new contacto ("Natalia", 78766557);
		contacto natalia2 = new contacto ("Natalia", 78766557);
		agenda contactos = new agenda ();
		
		//Compruebo el arraylist
		contactos.aniadir(pepe);
		contactos.aniadir(arturo);
		contactos.aniadir(natalia);
		contactos.aniadir(natalia2);
		
		//Muestro la agenda
		contactos.mostrar();
		
		//miro si funciona la comprobacion
		System.out.println (contactos.aniadirContacto(natalia2));
		
		//Comprobar la posicion
		System.out.println (contactos.buscarContacto("Pepe"));
		
	}

}
