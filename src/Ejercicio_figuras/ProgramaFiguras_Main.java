package Ejercicio_figuras;

//Programa para gestionar figuras creado por Moises Sepulveda Segarra

import java.util.ArrayList;

public class ProgramaFiguras_Main {

	public static void main(String[] args) {
		
		//Construimos los objetos
		Cuadrado cuadrado1 = new Cuadrado (5);
		Rectangulo rectangulo1 = new Rectangulo (10,6);
		Triangulo triangulo1 = new Triangulo (6,8);
		Circulo circulo1 = new Circulo (4);
		
		//Creamos ArrayList
		ArrayList<iFigura2D>listado = new ArrayList<iFigura2D>();
		
		//Añadimos los objetos al ArrayList
		listado.add(cuadrado1);
		listado.add(rectangulo1);
		listado.add(triangulo1);
		listado.add(circulo1);
		
		//Invocamos las operaciones en cada figura
		for (iFigura2D iFigura2D : listado) {
			iFigura2D.perimetro();
			iFigura2D.area();
		}
		
		//Mostramos la informacin de todos los objetos
		for (iFigura2D iFigura2D : listado) {
			iFigura2D.imprimir();
		}
		
		//Escalamos todas las figuras a 2
		for (iFigura2D iFigura2D : listado) {
			iFigura2D.escalar(2);
		}
		for (iFigura2D iFigura2D : listado) {
			iFigura2D.perimetro();
			iFigura2D.area();
		}
		
		System.out.println ("=== AJUSTAR TAMAÑO DE LAS FIGURAS x2 ===");
		System.out.println ("==========================================");
		System.out.println ("==========================================");
		System.out.println ("==========================================");
		
		
		//Mostramos la informacin de todos los objetos
		for (iFigura2D iFigura2D : listado) {
			 iFigura2D.imprimir();
		}
				
				//Escalamos todas las figuras a 0,1
		for (iFigura2D iFigura2D : listado) {
			iFigura2D.escalar(0.1);
			
				}
		
		for (iFigura2D iFigura2D : listado) {
					iFigura2D.perimetro();
					iFigura2D.area();
				}
				
		System.out.println ("=== AJUSTAR TAMAÑO DE LAS FIGURAS x0,1 ===");
		System.out.println ("==========================================");
		System.out.println ("==========================================");
		System.out.println ("==========================================");		
		
		//Mostramos la informacin de todos los objetos
		for (iFigura2D iFigura2D : listado) {
			iFigura2D.imprimir();
		}
		
	}

}
