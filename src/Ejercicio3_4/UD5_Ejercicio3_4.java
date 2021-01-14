package Ejercicio3_4;


public class UD5_Ejercicio3_4 {

	public static void main(String[] args) {
		
		Articulo pieza1 = new Articulo ("Camiseta",12.5,2,3);
		
		Articulo pieza2 = new Articulo ("Calcetines",28.5,21,4);
			
			/*Articulo 1*/
			if (pieza1.getPrecio() <= 0) {
				System.out.println (" ");
				System.out.println ("Error de precio");
			}
			
			if (pieza1.getIva() != 21) {
				System.out.println (" ");
				System.out.println ("Error de iva");
			}
			
			else {
			System.out.println (" ");
			System.out.println ("Articulo: " + pieza1.getNombre());
			System.out.println ("Precio: " + pieza1.getPrecio() + "€");
			System.out.println ("Plus iva: " + pieza1.getPrecio() * pieza1.getIva() / 100 + "€");
			double calcula_iva1 = pieza1.getPrecio() * pieza1.getIva() / 100;
			System.out.println ("Quedan: " + pieza1.getStock());
			System.out.println ("Total: " + (pieza1.getPrecio() + calcula_iva1) + "€");
			}
			
			/*Correccion articulo1*/
			pieza1.setIva(21);
			
			if (pieza1.getPrecio() <= 0) {
				System.out.println (" ");
				System.out.println ("Error de precio");
			}
			
			if (pieza1.getIva() != 21) {
				System.out.println (" ");
				System.out.println ("Error de iva");
			}
			
			else {
			System.out.println (" ");
			System.out.println ("Articulo: " + pieza1.getNombre());
			System.out.println ("Precio: " + pieza1.getPrecio() + "€");
			System.out.println ("Plus iva: " + pieza1.getPrecio() * pieza1.getIva() / 100 + "€");
			double calcula_iva1 = pieza1.getPrecio() * pieza1.getIva() / 100;
			System.out.println ("Quedan: " + pieza1.getStock());
			System.out.println ("Total: " + (pieza1.getPrecio() + calcula_iva1) + "€");
			}
			
			
			/*Segundo articulo*/
			if (pieza2.getPrecio() <= 0) {
				System.out.println (" ");
				System.out.println ("Error de precio");
			}
			
			if (pieza2.getIva() != 21) {
				System.out.println (" ");
				System.out.println ("Error de iva");
			}
			
			else {
			System.out.println (" ");
			System.out.println ("Articulo: " + pieza2.getNombre());
			System.out.println ("Precio: " + pieza2.getPrecio() + "€");
			System.out.println ("Plus iva: " + pieza2.getPrecio() * pieza2.getIva() / 100 + "€");
			double calcula_iva2 = pieza2.getPrecio() * pieza2.getIva() / 100;
			System.out.println ("Quedan: " + pieza2.getStock());
			System.out.println ("Total: " + (pieza2.getPrecio() + calcula_iva2) + "€");
			}
			
			pieza2.setIva(25);
			
			if (pieza2.getPrecio() <= 0) {
				System.out.println (" ");
				System.out.println ("Error de precio");
			}
			
			if (pieza2.getIva() != 21) {
				System.out.println (" ");
				System.out.println ("Error de iva");
			}
			
			else {
			System.out.println (" ");
			System.out.println ("Articulo: " + pieza2.getNombre());
			System.out.println ("Precio: " + pieza2.getPrecio() + "€");
			System.out.println ("Plus iva: " + pieza2.getPrecio() * pieza2.getIva() / 100 + "€");
			double calcula_iva2 = pieza2.getPrecio() * pieza2.getIva() / 100;
			System.out.println ("Quedan: " + pieza2.getStock());
			System.out.println ("Total: " + (pieza2.getPrecio() + calcula_iva2) + "€");
			}
			
			

			
		}

			}
	