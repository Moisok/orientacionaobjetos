package Ejercicio4_4;

import java.util.Scanner;

public class UD5_Ejercicio4_4 {

public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		int almacenar;
		
		Articulo pieza1 = new Articulo ("Camiseta",12.5,21,5);
		
		Articulo pieza2 = new Articulo ("Calcetines",28.5,21,4);
			
		pieza1.Info();

		pieza1.precio();
		
		System.out.println ("El precio final es de " + pieza1.precio());
		
		System.out.println ("Con la tajeta socio se aplica un 15% de descuento: "  + pieza1.descuento());
		System.out.println ("El precio final es de " + (pieza1.precio() - pieza1.descuento()));
		
		pieza2.Info();
		
		pieza2.precio();
		
		System.out.println ("El precio final es de " + pieza2.precio());
		
		System.out.println ("Con la tajeta socio se aplica un 15% de descuento: "  + pieza2.descuento());
		System.out.println ("El precio final es de " + (pieza2.precio() - pieza2.descuento()));
		
		System.out.println ("¿Cuantos articulos quieres vender?");
		
		cantidad = teclado.nextInt();
		
		pieza1.ventas(cantidad);
		
		if (pieza1.ventas(cantidad) == 1) {
			System.out.println("Has vendido: " + cantidad + " de " + pieza1.getNombre());
			System.out.println (pieza1.ventas(cantidad));
		}
		
		
		else {
			System.out.println ("No ha sido posible realizar la venta por falta de stock");
			System.out.println (pieza1.ventas(cantidad));
		}
		
		pieza1.Info();
		
		
		}

			}

/*System.out.println ("Has obtenido por la venta: " + (pieza2.precio() - pieza2.descuento()) * cantidad);
pieza1.Info();
System.out.println ("¿Cuanto quieres almacenar?");
almacenar = teclado.nextInt();
pieza1.almacenar(almacenar);
pieza1.Info();*/
	
