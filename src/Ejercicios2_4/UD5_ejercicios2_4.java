package Ejercicios2_4;

public class UD5_ejercicios2_4 {

	public static void main(String[] args) {
		
	Articulo pieza1 = new Articulo ("Camiseta",12.5,21,3);
	
	Articulo pieza2 = new Articulo ("Calcetines",28.5,21,4);
		
	
		
		System.out.println ("Articulo: " + pieza1.nombre);
		System.out.println ("Precio: " + pieza1.precio + "€");
		System.out.println ("Plus iva: " + pieza1.precio * pieza1.iva / 100 + "€");
		double calcula_iva1 = pieza1.precio * pieza1.iva / 100;
		System.out.println ("Quedan: " + pieza1.stock);
		System.out.println ("Total: " + (pieza1.precio + calcula_iva1) + "€");
		
		System.out.println (" ");
		System.out.println ("Articulo: " + pieza2.nombre);
		System.out.println ("Precio: " + pieza2.precio + "€");
		System.out.println ("Plus iva: " + pieza2.precio * pieza2.iva / 100 + "€");
		double calcula_iva2 = pieza2.precio * pieza2.iva / 100;
		System.out.println ("Quedan: " + pieza2.stock);
		System.out.println ("Total: " + (pieza2.precio + calcula_iva2) + "€");
		/*Prueba*/
		
	}

}
