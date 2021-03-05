package Ejercicio_Biblioteca;

//Clase revista, en este caso solo descendera de la superclase publicacion
//No se implementa interface

public class revista extends publicacion{
	
	//Artributos propios
	private int numero;
	
	
	//Constructor
		public revista(int codigo, String titulo, String fecha, int numero) {
			super(codigo, titulo, fecha);
			this.numero=numero;
		}

	//Metodos heredados
		
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
			String info = "Codigo: " + codigo + " titulo: " + titulo + " fecha: " + fecha + " numero: " + numero;
			return info;
		}
}
