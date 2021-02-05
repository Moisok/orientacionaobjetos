/*Gestion de almacen y stock creado por Moises sepulveda Segarra*/

package gestisimal;

import java.util.Scanner;

public class Gestion_de_stock {

	public static void main(String[] args) {
		/*Contruccion del scanner*/
		
		 Scanner teclado = new Scanner (System.in);
		
		/*Construccion de variables y demas*/
		
		int numArticulos;
		
		String IntroCodigo;
		
		String IntroDescripcion;
		
		double IntroPrecioDeCompra;
		
		double IntroPrecioDeVenta;
		
		int IntroStock;
		
		int opcion = 0;
		
		int select;
		
		articulo articulos[] = new articulo [3];
		
		/*Primer array lo llenamos con "LIBRE" en la parte del codigo*/
		for (int i=0;i<articulos.length;i++) {
		articulos[i]= new articulo();
		}
		
		
		/*Comienza el menu*/
		while (opcion < 7) {
			System.out.println ("1. Listado");
			System.out.println ("2. Alta");
			System.out.println ("3. Baja");
			System.out.println ("4. Modificación");
			System.out.println ("5. Entrada de stock");
			System.out.println ("6. Salida de stock");
			System.out.println ("7. Salir");
			
			opcion = teclado.nextInt();
			
			switch (opcion) {
			
			/*Mostrar listado*/
			
			case 1: 
				for (int i=0; i<articulos.length; i++) {
					System.out.println(articulos[i].toString());
				}
				break;
				
			/*Introducir mercancia*/
				
			case 2: 
					System.out.println ("Inserta Codigo");
					IntroCodigo = teclado.next();
					
					System.out.println ("Inserta Descripcion");
					IntroDescripcion = teclado.next();
					
					System.out.println ("Inserta precio de compra");
					IntroPrecioDeCompra = teclado.nextDouble();
					
					System.out.println ("Inserta precio de venta");
					IntroPrecioDeVenta = teclado.nextDouble();
				
					int i= 0;
					
					while (!articulos[i].getCodigo().equals("LIBRE")){
						
						i++;
						
					}
						
						articulos[i].setCodigo(IntroCodigo);
						
						
						articulos[i].setDescripcion(IntroDescripcion);
						
						
						articulos[i].setprecioDeCompra (IntroPrecioDeCompra);
						
						
						articulos[i].setprecioDeVenta (IntroPrecioDeVenta);

				break;
				
			/*Dar de baja mercancia (Dar de baja por codigo no por numero)*/
				
			case 3:	
				System.out.println ("¿Que articulo quieres dar de baja? (COD DE ARTICULO)");
				IntroCodigo = teclado.next();
				
				for (int j=0;j<articulos.length;j++) {
					if (articulos[j].getCodigo().equals(IntroCodigo)) {
						articulos[j]= new articulo();
					}
					else {
						System.out.println ("No existe el codigo");
					}
				}
				
				break;
				
			/*Modificar articulo*/	
				
			case 4:	
				System.out.println ("¿Que articulo quieres modificar? (COD DE ARTICULO)");
				IntroCodigo = teclado.next();
				
				for (int j=0;j<articulos.length;j++) {
					if (articulos[j].getCodigo().equals(IntroCodigo)) {
					System.out.println ("Inserta Codigo");
					IntroCodigo = teclado.next();
					articulos[j].setCodigo(IntroCodigo);
					
					System.out.println ("Inserta Descripcion");
					IntroDescripcion = teclado.next();
					articulos[j].setDescripcion(IntroDescripcion);
					
					System.out.println ("Inserta precio de compra");
					IntroPrecioDeCompra = teclado.nextDouble();
					articulos[j].setprecioDeCompra (IntroPrecioDeCompra);
					
					System.out.println ("Inserta precio de venta");
					IntroPrecioDeVenta = teclado.nextDouble();
					articulos[j].setprecioDeVenta (IntroPrecioDeVenta);
					
					articulos[j].setStock(0);
					}
				}
				break;
				
			/*Meter mercancia*/
			
			case 5:
				System.out.println ("¿Que articulo quieres introducir Stock? (COD DE ARTICULO)");
				IntroCodigo = teclado.next();
				for (int j=0;j<articulos.length;j++) {
					if (articulos[j].getCodigo().equals(IntroCodigo)) {
					System.out.println ("introduce mercancia");
					IntroStock = teclado.nextInt();
					articulos[j].setStock(IntroStock);
					}
				}
	
				break;
			/*Sacar mercancia*/
				
			case 6:	
				
				System.out.println ("¿Que articulo quieres sacar Stock? (COD DE ARTICULO)");
				IntroCodigo = teclado.next();
				for (int j=0;j<articulos.length;j++) {
					if (articulos[j].getCodigo().equals(IntroCodigo)) {
					System.out.println ("introduce mercancia");
					IntroStock = teclado.nextInt();
						if (IntroStock < articulos[j].getStock()) {
							/*Corregir esto*/
						articulos[j].setStock(IntroStock) = articulos[j].setStock(IntroStock) - articulos[j].setStock(IntroStock);
						}
						else {
							System.out.println ("No hay suficiente stock");
						}
					}	
				}	
				
				
				
				
			/*Salir del programa*/
				
			case 7:
				System.out.println ("Gracias por usar el programa");
				break;
			}
			
		
/*FINAL*/
			
		}
	}
}	


