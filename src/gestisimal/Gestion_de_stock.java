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
		
		int IntroStock = 0;
		
		int OutStock;
		
		int opcion = 0;
		
		int select;
		
		articulo articulos[] = new articulo [100];
		
		/*Primer array lo llenamos con "LIBRE" en la parte del codigo*/
		for (int i=0;i<articulos.length;i++) {
		articulos[i]= new articulo();
		}
		
		
		/*Comienza el menu*/
		while (opcion < 7) {
			System.out.println ("1. Listado");
			System.out.println ("2. Alta");
			System.out.println ("3. Baja");
			System.out.println ("4. Modificacion");
			System.out.println ("5. Entrada de stock");
			System.out.println ("6. Salida de stock");
			System.out.println ("7. Salir");
			
			opcion = teclado.nextInt();
			
			switch (opcion) {
			
			/*Mostrar listado*/
			
			case 1:
				
				for (int i=0; i<articulos.length; i++) {
					if (!articulos[i].getCodigo().equals("LIBRE")) {
					System.out.println(articulos[i].toString());
				}
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
						break;
					}
					else {
						System.out.println ("No existe el codigo");
						break;
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
					OutStock = teclado.nextInt();
					IntroStock = IntroStock - OutStock;
					if (articulos[j].getStock() < OutStock) {
						System.out.println ("No hay suficiente stock");
					}
					else {
						articulos[j].setStock(IntroStock);
							}

					
					}	
				}	
				break;
				
				
				
			/*Salir del programa*/
				
			case 7:
				System.out.println ("Gracias por usar el programa");
				break;
			}
			
		
/*FINAL*/
			
		}
	}
}	


