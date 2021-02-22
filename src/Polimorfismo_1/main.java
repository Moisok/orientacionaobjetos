package Polimorfismo_1;

public class main {

	public static void main(String[] args) {
		
		// Pruebas
		
		//Creamos objeto tipo perro
		perro p1= new perro("Bobby", 5, "jugando", "Feb-2018", "Pastor alemán", false);
		perro p2= new perro("Lulu", 7, "durmiendo", "Abril-2016", "Rottweiler", false);
		gato g1= new gato("Luna", 2, "durmiendo", "Sept-2020", "negro", false);
		gato g2= new gato("Pecas", 2, "rascandose", "Julio-2019", "blanco", true);
		loro l1= new loro("Arturito", 10, "hablando", "Enero-2015", "largo", true, "Murcia");
		canario c1= new canario("Basilio", 5, "piando", "Dic-2018", "corto", true, "amarillo", true);
		
		//Creamos inventario
		inventario inventario= new inventario();
		
		//Añadimos elemento a inventario
		inventario.insertarAnimal(p1);
		inventario.insertarAnimal(p2);
		inventario.insertarAnimal(g1);
		inventario.insertarAnimal(g2);
		inventario.insertarAnimal(l1);
		inventario.insertarAnimal(c1);
		
		//Mostramos animales
		inventario.mostrarListaAnimales();
		
		//Mostramos todos los animales
		inventario.mostrarTodosAnimales();
		
		//Eliminamos un animal
		inventario.eliminarAnimal(0);
		
		//Mostramos todos los animales
		inventario.mostrarTodosAnimales();
		

	}

}
