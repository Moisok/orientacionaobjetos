/*El menú del programa debe tener, al menos, las siguientes opciones:
1. Listado
2. Alta
3. Baja
4. Modificación
5. Entrada de mercancía
6. Salida de mercancía
7. Salir

La entrada y salida de mercancía supone respectivamente el incremento y decremento de stock de un determinado artículo. 
Hay que controlar que no se pueda sacar más mercancía de la que hay en el almacén.*/

package gestisimal;

public class Gestion_de_stock {

	public static void main(String[] args) {
		
		articulo prueba = new articulo (12345,"Bombilla",12,13,80);

		System.out.println ("Esto es una prueba " + prueba.getCodido());
		System.out.println ("Esto es una prueba " + prueba.getDescripcion());
		System.out.println ("Esto es una prueba " + prueba.getPcompra());
		System.out.println ("Esto es una prueba " + prueba.getPventa());
		System.out.println ("Esto es una prueba " + prueba.getStock());
	}

}
