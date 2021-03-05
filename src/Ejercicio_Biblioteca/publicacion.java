package Ejercicio_Biblioteca;

//Clase articulo, esta clase tendra en comundo algunos artributos 
//tanto para los libros como para las revistas

public abstract class publicacion {
	
	//Artributos de superclase
	
	protected int codigo;
	
	protected String titulo;
	
	protected String fecha;
	
	//Creamos el contructor
	
	public publicacion (int codigo, String titulo, String fecha) {
		
		this.codigo=codigo;
		
		this.titulo=titulo;
		
		this.fecha=fecha;
		
	}

	//Metodos para heredar
	
	public abstract String getAny();
	
	public abstract String toString();

	public abstract int getCodi();
}
