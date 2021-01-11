package Ejercicio3;

public class Calcular_rec {

	public static void main(String[] args) {
		
		rectangulo Cuadrado1 = new rectangulo ();
		rectangulo Cuadrado2 = new rectangulo ();
		
		Cuadrado1.x1=0;
		Cuadrado1.y1=0;
		Cuadrado1.x2=5;
		Cuadrado1.y2=5;
		
		Cuadrado2.x1=7;
		Cuadrado2.y1=9;
		Cuadrado2.x2=2;
		Cuadrado2.y2=3;
		
		/*Primer rectangulo*/
		int ladoC1_1 = Cuadrado1.x2 - Cuadrado1.x1;
		int ladoC1_2 = Cuadrado1.y2 - Cuadrado1.y1;
		/*System.out.println (ladoC1_1);
		System.out.println (ladoC1_2);*/
		System.out.println ("Primer rectangulo");
		System.out.println ("Coordenadas: "  + Cuadrado1.x1 + " " +  Cuadrado1.y1 + " "  + Cuadrado1.x2 +  " " + Cuadrado1.y2 );
		System.out.println ("Perimetro: " + (ladoC1_1 * 2 + ladoC1_2 * 2));
		System.out.println ("Area: " + (ladoC1_1 * ladoC1_2));
		
		/*Segundo rectangulo*/
		int ladoC2_1 = Cuadrado2.x1 - Cuadrado2.x2;
		int ladoC2_2 = Cuadrado2.y1 - Cuadrado2.y2;
		/*System.out.println (ladoC2_1);
		System.out.println (ladoC2_2);*/
		System.out.println (" ");
		System.out.println ("Segundo rectangulo");
		System.out.println ("Coordenadas: "  + Cuadrado2.x1 + " " +  Cuadrado2.y1 + " "  + Cuadrado2.x2 +  " " + Cuadrado2.y2 );
		System.out.println ("Perimetro: " + (ladoC2_1 * 2 + ladoC2_2 * 2));
		System.out.println ("Area: " + (ladoC2_1 * ladoC2_2));
		
		
	}

}
