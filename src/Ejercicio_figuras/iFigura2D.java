package Ejercicio_figuras;

//Clase interface (esto es una plantilla, obliga a las clases hijos a tener todo lo que "le ponemos")

public interface iFigura2D {

	//Construimos los metodos
	
	double perimetro ();
	
	double area ();
	
	void escalar (double escala);
	
	void imprimir();
	
}
