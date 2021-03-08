package Ejercicio_Resuelto;

//Control de profesores del instituto

public class TestHerencia4 {

	public static void main(String[] args) {
		
		//Creamos objetos
		profesorTitular Alfonso = new profesorTitular("Alfonso", "Velasco", 39, "IES santas pascuas", 
		"4B","Matematicas", "Ciencias y tecnologia", true);
		
		profesorTitular Manoli = new profesorTitular("Manuela", "Carrasco", 68, "IES santas pascuas", 
				"2A","Manualidades", "Ciencias y tecnologia", false);
		
		profesorTitular Alberto = new profesorTitular("Alberto", "Fuckencio", 22, "IES santas pascuas", 
				"1A","Lenguaje", "Filologia", true);
		
		
		profesorInterino Rafael = new profesorInterino("Rafael", "Alcantara", 45, "IES Garbanzuelo",
				"2C", "Lenguaje", false);

		profesorInterino Raquel = new profesorInterino("Raquel", "Palomares", 19, "IES Garbanzuelo",
				"4A", "INGLES", true);
		
		//Experimentamos
		//Añadimos a la arrylist y mostramos (tambien creamos objeto de tipo listarProfesores)
		listarProfesores listado = new listarProfesores();
		
		listado.añadir(Alfonso);
		listado.añadir(Manoli);
		listado.añadir(Alberto);
		
		listado.añadir(Rafael);
		listado.añadir(Raquel);
		
		listado.mostrar();
		
		//Eliminamos y mostramos
		listado.eliminar(Raquel);
		listado.eliminar(Alberto);
		System.out.println ("========================================================================================================================================");
		listado.mostrar();
		
	}

}
