package Ejercicio_Biblioteca;

//Esta interface solo afecta a los libros, no a las revistas

public interface prestable {
	
	//Metodos de la interface
	
	void prestar ();

	void retornar ();
	
	boolean estaPrestado ();
}
