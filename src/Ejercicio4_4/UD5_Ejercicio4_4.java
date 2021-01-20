package Ejercicio4_4;

import java.util.Scanner;

public class UD5_Ejercicio4_4 {

public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantidad;
		
		String nombre;
		int precio;
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
		
		boolean sihay = pieza1.ventas(cantidad);
		
		if (sihay) {
			System.out.println("Has vendido: " + cantidad + " de " + pieza1.getNombre());
			System.out.println (pieza1.ventas(cantidad));
			pieza1.restar(cantidad);
		}
		else {
			System.out.println ("No ha sido posible realizar la venta por falta de stock");
			System.out.println (pieza1.ventas(cantidad));
		}
		
		pieza1.Info();
		
		System.out.println ("Ahora vamos a actualizar los datos del aritculo");
		System.out.println ("Nombre de articulo: ");
		nombre = teclado.next();
		System.out.println ("Precio del articulo: ");
		precio = teclado.nextInt();
		System.out.println ("¿Cuanto stock hay?");
		almacenar = teclado.nextInt();
		
		pieza1.actualizar(nombre, precio, 21, almacenar);
		
		pieza1.Info();
		
		System.out.println ("El precio final es de " + pieza1.precio());
		
		System.out.println ("Con la tajeta socio se aplica un 15% de descuento: "  + pieza1.descuento());
		System.out.println ("El precio final es de " + (pieza1.precio() - pieza1.descuento()));
		
		System.out.println ("¿Cuantos articulos quieres vender?");
		
		cantidad = teclado.nextInt();
		
		pieza1.ventas(cantidad);
		
		sihay = pieza1.ventas(cantidad);
		
		if (sihay) {
			System.out.println("Has vendido: " + cantidad + " de " + pieza1.getNombre());
			System.out.println (pieza1.ventas(cantidad));
			pieza1.restar(cantidad);
		}
		else {
			System.out.println ("No ha sido posible realizar la venta por falta de stock");
			System.out.println (pieza1.ventas(cantidad));
		}
		
		pieza1.Info();
		
		
		}

		

			}

