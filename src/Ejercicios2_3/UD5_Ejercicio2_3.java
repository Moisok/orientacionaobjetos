package Ejercicios2_3;

public class UD5_Ejercicio2_3 {
	
public static void main(String[] args) {
		
		Rectangulo Cuadrado1 = new Rectangulo (0,0,5,5);
		
		Rectangulo Cuadrado2 = new Rectangulo (7,9,2,3);

		/*Primer rectangulo*/
		
		int ladoC1_1 = Cuadrado1.x2 - Cuadrado1.x1;
		
		int ladoC1_2 = Cuadrado1.y2 - Cuadrado1.y1;
		

		System.out.println ("Primer rectangulo");
		System.out.println ("Coordenadas: "  + Cuadrado1.x1 + " " +  Cuadrado1.y1 + " "  + Cuadrado1.x2 +  " " + Cuadrado1.y2 );
		System.out.println ("Perimetro: " + (ladoC1_1 * 2 + ladoC1_2 * 2));
		System.out.println ("Area: " + (ladoC1_1 * ladoC1_2));
		
		/*Segundo rectangulo*/
		
		int ladoC2_1 = Cuadrado2.x1 - Cuadrado2.x2;
		
		int ladoC2_2 = Cuadrado2.y1 - Cuadrado2.y2;

		System.out.println (" ");
		System.out.println ("Segundo rectangulo");
		System.out.println ("Coordenadas: "  + Cuadrado2.x1 + " " +  Cuadrado2.y1 + " "  + Cuadrado2.x2 +  " " + Cuadrado2.y2 );
		System.out.println ("Perimetro: " + (ladoC2_1 * 2 + ladoC2_2 * 2));
		System.out.println ("Area: " + (ladoC2_1 * ladoC2_2));
		
		
	}

}


