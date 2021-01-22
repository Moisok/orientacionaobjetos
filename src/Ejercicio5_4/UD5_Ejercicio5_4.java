package Ejercicio5_4;

import java.util.Scanner;

public class UD5_Ejercicio5_4 {

public static void main(String[] args) {
	/*Aplicar 21% de iva a cosas normales*/
	/*Aplicar 10% para hosteleria*/
	/*Aplicar 4% por productos de primera necesidad*/
	
	Scanner teclado = new Scanner (System.in);
		
	int opcion;
	String nombre;
	int precio;
	int stock;
	
	
	System.out.print ("¿Que tipo de producto vas a operar?");
	System.out.println (" ");
	System.out.println ("Producto estandar (INTRODUCE 1)");
	System.out.println ("Hostelería, transporte, vivienda, etc. (INTRODUCE 2)");
	System.out.println ("alimentos básicos, libros, medicamentos, etc. (INTRODUCE 3)");
	System.out.print ("introduce numero: ");
	opcion = teclado.nextInt();
	switch(opcion){
    case 1:
        System.out.println("Introduce nombre de articulo");
        System.out.print("Nombre: ");
        nombre = teclado.next();
        System.out.println("Introduce precio de articulo");
        System.out.print("Precio: ");
        precio = teclado.nextInt();
        System.out.println("Introduce Stock de articulo");
        System.out.print("Cantidad: ");
        stock = teclado.nextInt();
        Articulo objeto = new Articulo (nombre,precio,0,stock,opcion);
        System.out.println("Este tipo de articulo tiene un 21% de iva");
        System.out.println("Nombre: " + objeto.getNombre());
        System.out.println("Precio: " + objeto.getPrecio() + "€");
        System.out.println("Iva: " + objeto.getIva() + "% " + "( "+ objeto.getPrecio()*objeto.getIva()+" )");
        System.out.println("Stock: " + objeto.getStock());
        double calculaiva = (objeto.getPrecio()*objeto.getIva()) + objeto.getPrecio();
        System.out.println("El precio total es:" + calculaiva);
        break;
    case 2:
    	System.out.println("Introduce nombre de articulo");
        System.out.print("Nombre: ");
        nombre = teclado.next();
        System.out.println("Introduce precio de articulo");
        System.out.print("Precio: ");
        precio = teclado.nextInt();
        System.out.println("Introduce Stock de articulo");
        System.out.print("Cantidad: ");
        stock = teclado.nextInt();
        Articulo objeto1 = new Articulo (nombre,precio,0,stock,opcion);
        System.out.println("Este tipo de articulo tiene un 10% de iva");
        System.out.println("Nombre: " + objeto1.getNombre());
        System.out.println("Precio: " + objeto1.getPrecio() + "€");
        System.out.println("Iva: " + objeto1.getIva() + "% " + "( "+objeto1.getPrecio()*objeto1.getIva()+" )");
        System.out.println("Stock: " + objeto1.getStock());
        calculaiva = (objeto1.getPrecio()*objeto1.getIva()) + objeto1.getPrecio();
        System.out.println("El precio total es:" + calculaiva);
        break;
     case 3:
    	 System.out.println("Introduce nombre de articulo");
         System.out.print("Nombre: ");
         nombre = teclado.next();
         System.out.println("Introduce precio de articulo");
         System.out.print("Precio: ");
         precio = teclado.nextInt();
         System.out.println("Introduce Stock de articulo");
         System.out.print("Cantidad: ");
         stock = teclado.nextInt();
         Articulo objeto2 = new Articulo (nombre,precio,0,stock,opcion);
         System.out.println("Este tipo de articulo tiene un 4% de iva");
         System.out.println("Nombre: " + objeto2.getNombre());
         System.out.println("Precio: " + objeto2.getPrecio() + "€");
         System.out.println("Iva: " + objeto2.getIva() + "% " + "( "+objeto2.getPrecio()*objeto2.getIva()+" )");
         System.out.println("Stock: " + objeto2.getStock());
         calculaiva = (objeto2.getPrecio()*objeto2.getIva()) + objeto2.getPrecio();
         System.out.println("El precio total es:" + calculaiva);
        break;
     default:
        System.out.println(" ");
}
	}
}
