package Ejercicio_Biblioteca;

//Clase libro, se implementa la interface prestable y ademas es hija de "publicacion"

public class libro extends publicacion implements prestable {

	//Artributos propios
	private boolean prestado = false;
	
	//Constructor
	public libro(int codigo, String titulo, String fecha) {
		super(codigo, titulo, fecha);
	}

	// metodos de la interface "Prestable" 
	@Override
	public void prestar() {
		prestado=true;
		
	}

	@Override
	public void retornar() {
		prestado=false;
	}

	@Override
	public boolean estaPrestado() {
		return prestado;
	}

	//Metodos de la superclase 
	@Override
	public String getAny() {
		return fecha;
	}

	@Override
	public int getCodi() {
		return codigo;
		
	}

	@Override
	public String toString() {
		String info = "Codigo: " + codigo + " titulo: " + titulo + " fecha: " + fecha + " ¿esta prestado?: " + prestado;
		return info;
	}
	
 
	

}
