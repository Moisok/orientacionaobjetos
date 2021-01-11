package Ejercicio4;

public class Art_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Articulo pieza1 = new Articulo ();
		
		pieza1.nombre = "camiseta";
		pieza1.precio = 12.5;
		pieza1.iva= 21;
		pieza1.stock=3;
		
		
		System.out.println ("Articulo: " + pieza1.nombre);
		System.out.println ("Precio: " + pieza1.precio + "€");
		System.out.println ("Plus iva: " + pieza1.precio * pieza1.iva / 100 + "€");
		double calcula_iva1 = pieza1.precio * pieza1.iva / 100;
		System.out.println ("Quedan: " + pieza1.stock);
		System.out.println ("Total: " + (pieza1.precio + calcula_iva1) + "€");
		
	}

}
