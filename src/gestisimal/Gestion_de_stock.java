/*El menú del programa debe tener, al menos, las siguientes opciones:
1. Listado
2. Alta
3. Baja
4. Modificación
5. Entrada de mercancía
6. Salida de mercancía
7. Salir
j=articulo[i].setDescripcion()=3 (EJEMPLO)
La entrada y salida de mercancía supone respectivamente el incremento y decremento de stock de un determinado artículo. 
Hay que controlar que no se pueda sacar más mercancía de la que hay en el almacén.*/

package gestisimal;

import java.util.Scanner;

public class Gestion_de_stock {

	public static void main(String[] args) {
		/*Contruccion del scanner*/
		
		 Scanner teclado = new Scanner (System.in);
		
		/*Construccion de variables y demas*/
		
		int numArticulos;
		
		String IntroCodigo = "LIBRE";
		
		String IntroDescripcion;
		
		double IntroPrecioDeCompra;
		
		double IntroPrecioDeVenta;
		
		int IntroStock;
		
		articulo articulos[] = new articulo [3];
		
		/*Primer array lo llenamos con "LIBRE" en la parte del codigo*/
		for (int i=0;i<articulos.length;i++) {
		articulos[i]= new articulo();
		}
	
		/*Este array es para ir metiendo los datos en caso de que este "LIBRE" el hueco*/
		for (int i=0;i<3;i++) {
		
			if (IntroCodigo.equals(articulos[i].getCodigo())){
				System.out.println ("Inserta Codigo");
				IntroCodigo = teclado.next();
				articulos[i].setCodigo(IntroCodigo);
				
				System.out.println ("Inserta Descripcion");
				IntroDescripcion = teclado.next();
				articulos[i].setDescripcion(IntroDescripcion);
				
				System.out.println ("Inserta precio de compra");
				IntroPrecioDeCompra = teclado.nextDouble();
				articulos[i].setprecioDeCompra (IntroPrecioDeCompra);
				
				System.out.println ("Inserta precio de venta");
				IntroPrecioDeVenta = teclado.nextDouble();
				articulos[i].setprecioDeVenta (IntroPrecioDeVenta);
				
				System.out.println ("Inserta Stock");
				IntroStock = teclado.nextInt();
				articulos[i].setStock(IntroStock);
			}
			
		}
		
		/*Prueba para printarlo*/
		System.out.println(articulos[0].toString());	
		System.out.println(articulos[1].toString());
		System.out.println(articulos[2].toString());
	}

}
