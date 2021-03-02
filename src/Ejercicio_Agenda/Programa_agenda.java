package Ejercicio_Agenda;

public class Programa_agenda {

	public static void main(String[] args) {
		
		//Construimos los objetos
		contactoPersona alfonsa2 = new contactoPersona ("Alfonsa",334567889,"02/04/1990");
		contactoPersona alfonsa = new contactoPersona ("Alfonsa",334567889,"02/04/1990");
		contactoPersona martina = new contactoPersona ("Martina",587422123,"05/06/1978");
		contactoEmpresa copinsa = new contactoEmpresa ("Copinsa.SA",666555443,"https://compsa-sa.com"); 
		contactoEmpresa susaeta = new contactoEmpresa ("Susaeta.SA",66645854,"https://www.susaeta.es"); 
		contactoEmpresa compuhostignet = new contactoEmpresa ("Compu Hosting",66688883,"https://www.compuHosting.net"); 
		contactoEmpresa insecticidas = new contactoEmpresa ("Insecticidas Paco",555555555,"https://tienda-insecticidas.es"); 
		agenda contactos = new agenda();
		
		//comprobamos y añadimos los objetos
		if (contactos.aniadirContacto(insecticidas) == false) {
			System.out.println ("Se agrego: " + insecticidas.getNombre());
			contactos.aniadir(insecticidas);
		}
		if (contactos.aniadirContacto(compuhostignet) == false ) {
			System.out.println ("Se agrego: " + compuhostignet.getNombre());
			contactos.aniadir(compuhostignet);
		}
		if (contactos.aniadirContacto(susaeta) == false) {
			System.out.println ("Se agrego: " + susaeta.getNombre());
			contactos.aniadir(susaeta);
		}
		if (contactos.aniadirContacto(copinsa) == false) {
			System.out.println ("Se agrego: " + copinsa.getNombre());
			contactos.aniadir(copinsa);
		}
		if (contactos.aniadirContacto(martina) == false) {
			System.out.println ("Se agrego: " + martina.getNombre());
			contactos.aniadir(martina);
		}
		if (contactos.aniadirContacto(alfonsa ) == false) {
			System.out.println ("Se agrego: " + alfonsa.getNombre());
			contactos.aniadir(alfonsa);
		}
		if (contactos.aniadirContacto(alfonsa2) == false) {
			System.out.println ("Se agrego: " + alfonsa2.getNombre());
			contactos.aniadir(alfonsa2);
		}
		else {
			System.out.println ("No se ha podido agregar a " + alfonsa2.getNombre()+ " por que esta repetido");
		}
	
		//Ahora los muestro
		System.out.println (" ");
		contactos.mostrar();
		
		//Ahora miro si existe el contacto y elimino
		System.out.println (" ");
		if (contactos.eliminarContacto("Insecticidas Paco")) {
			contactos.elmina(insecticidas);
			System.out.println ("Se ha eliminado a: " + insecticidas.getNombre() + " de la agenda" );
		}
		if (contactos.eliminarContacto("Retronet")) {
			
		}
		else {
			System.out.println ("El contacto no existe");
		}
		
		//Ahora vuelvo a mostrar para comprobar que se ha eliminado
		System.out.println (" ");
		contactos.mostrar();
		
		//Comprobar si el contacto existe
		System.out.println (" ");
		
		if (contactos.existeContacto("Martina")) {
			System.out.println ("EL contacto " + martina.getNombre() + " esta en la agenda");
		}
		if (contactos.existeContacto("Manuel")) {
		
		}
		else {
			System.out.println ("No existe en la agenda");
		}
		
		//Comprobar en que posicion se encuentran los contactos
		System.out.println (" ");
		System.out.println ("El contacto " + copinsa.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Copinsa.SA"));
		System.out.println ("El contacto " + susaeta.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Susaeta.SA"));
		System.out.println ("El contacto " + martina.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Martina"));
		System.out.println ("El contacto " + compuhostignet.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Compu Hosting"));
		System.out.println ("El contacto " + alfonsa.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Alfonsa"));
		
		/***Parte sin herencias Comentada***/
		
		/*
		//Construyo los objetos
		contacto pepe = new contacto ("Pepe", 78679);
		contacto arturo = new contacto ("Arturo", 78679);
		contacto natalia = new contacto ("Natalia", 78766557);
		contacto natalia2 = new contacto ("Natalia", 78766557);
		contacto manuel = new contacto ("Manuel", 6557);
		agenda contactos = new agenda ();

		//Ahora vamos a usar las operaciones basicas
		//Comprobar y añadir contacto
		if (contactos.aniadirContacto(pepe) ) {
			System.out.println ("El contacto esta repetido");
		}
		else {
			contactos.aniadir(pepe);
			System.out.println ("El contacto "+ pepe.getNombre() +" se ha añadido");
		}
		if (contactos.aniadirContacto(arturo) ) {
			System.out.println ("El contacto esta repetido");
		}
		else {
			contactos.aniadir(arturo);
			System.out.println ("El contacto "+ arturo.getNombre() +" se ha añadido");
		}
		if (contactos.aniadirContacto(natalia)) {
			System.out.println ("El contacto esta repetido");
		}
		else {
			contactos.aniadir(natalia);
			System.out.println ("El contacto "+ natalia.getNombre() +" se ha añadido");
		}
		if (contactos.aniadirContacto(natalia2) ) {
			System.out.println ("El contacto esta repetido, no se ha agregado");
		}
		else {
			contactos.aniadir(natalia2);
			System.out.println ("El contacto "+ natalia2.getNombre() +" se ha añadido");
		}
		if (contactos.aniadirContacto(manuel) ) {
			System.out.println ("El contacto esta repetido, no se ha agregado");
		}
		else {
			contactos.aniadir(manuel);
			System.out.println ("El contacto "+ manuel.getNombre() +" se ha añadido");
		}
		
		System.out.println (" ");
		
		//Ahora muestro la lista
		contactos.mostrar();
		
		System.out.println (" ");
		
		//Comprobar y eliminar el contacto
		if (contactos.eliminarContacto("Manolo")) {
			System.out.println ("El contacto se ha eliminado correctamente" );
		}
		else {
			System.out.println ("EL contacto no se ha eliminado por que no se ha encontrado en la agenda");
		}
		if (contactos.eliminarContacto("Manuel")) {
			contactos.elmina(manuel);
			System.out.println ("El contacto se ha eliminado correctamente" );
		}
		else {
			System.out.println ("EL contacto no se ha eliminado por que no se ha encontrado en la agenda");
		}
		
		//Ahora vuelvo a mostrar la agenda
		System.out.println (" ");
		
		contactos.mostrar();
		
		System.out.println (" ");
		
		//Ahora vamos a comprobar si existe el contacto
		
		if (contactos.existeContacto("Pepe")) {
			System.out.println ("El contacto " + pepe.getNombre() + " existe" );
			
		}
		else {
			System.out.println ("No existe el contacto");
		}
		if (contactos.existeContacto("Natalia")) {
			System.out.println ("El contacto " + natalia.getNombre() + " existe");
			
		}
		else {
			System.out.println ("No existe el contacto");
		}
		if (contactos.existeContacto("Arturo")) {
			System.out.println ("El contacto " + natalia.getNombre() + " existe");
			
		}
		else {
			System.out.println ("No existe el contacto");
		}
		if (contactos.existeContacto("Bartolo")) {		
		}
		
		else {
			System.out.println ("No existe el contacto");
		}
		
		System.out.println (" ");
		
		//Por ultimo buscaremos en que posicion del ArrayList se encuentra el contacto
		
		System.out.println ("El contacto " + pepe.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Pepe"));
		System.out.println ("El contacto " + arturo.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Arturo"));
		System.out.println ("El contacto " + natalia.getNombre() + " se encuentra en la posicion " + contactos.buscarContacto("Natalia"));
		
		*/
	}

}
