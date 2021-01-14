package Ejercicio3_3;

public class UD5_Ejercicio3_3 {
	
public static void main(String[] args) {
		
		Rectangulo Cuadrado1 = new Rectangulo (0,0,5,5);
		
		Rectangulo Cuadrado2 = new Rectangulo (7,9,2,3);

		/*Primer rectangulo*/
		
		int ladoC1_1 = Cuadrado1.getX2() - Cuadrado1.getX1();
		
		int ladoC1_2 = Cuadrado1.getY2() - Cuadrado1.getY1();
		
		if (ladoC1_1 < 0 || ladoC1_2 < 0) {
			System.out.println (" ");
			System.out.println ("ERROR");
		}
		
		else {
		System.out.println ("Primer rectangulo");
		System.out.println ("Coordenadas: "  + Cuadrado1.getX1() + " " +  Cuadrado1.getY1() + " "  + Cuadrado1.getX2() +  " " + Cuadrado1.getY2() );
		System.out.println ("Perimetro: " + (ladoC1_1 * 2 + ladoC1_2 * 2));
		System.out.println ("Area: " + (ladoC1_1 * ladoC1_2));
		}
		
		/*Segundo rectangulo*/
		
		int ladoC2_1 = Cuadrado2.getX1() - Cuadrado2.getX2();
		
		int ladoC2_2 = Cuadrado2.getY1() - Cuadrado2.getY2();
		
		if (ladoC2_1 < 0 || ladoC2_2 < 0) {
			System.out.println (" ");
			System.out.println ("ERROR");
		}

		else {
		System.out.println (" ");
		System.out.println ("Segundo rectangulo");
		System.out.println ("Coordenadas: "  + Cuadrado2.getX1() + " " +  Cuadrado2.getY1() + " "  + Cuadrado2.getX2() +  " " + Cuadrado2.getY2() );
		System.out.println ("Perimetro: " + (ladoC2_1 * 2 + ladoC2_2 * 2));
		System.out.println ("Area: " + (ladoC2_1 * ladoC2_2));
		}
		
		 /*Correccion del segundo rectangulo*/
		
		Cuadrado2.setX1(9);
		Cuadrado2.setX2(9);
		Cuadrado2.setY1(9);
		Cuadrado2.setY2(9);
		
		ladoC2_1 = Cuadrado2.getX1() - Cuadrado2.getX2();
		
		ladoC2_2 = Cuadrado2.getY1() - Cuadrado2.getY2();
		
		if (ladoC2_1 < 0 || ladoC2_2 < 0) {
			System.out.println (" ");
			System.out.println ("ERROR");
		}

		else {
		System.out.println (" ");
		System.out.println ("Segundo rectangulo");
		System.out.println ("Coordenadas: "  + Cuadrado2.getX1() + " " +  Cuadrado2.getY1() + " "  + Cuadrado2.getX2() +  " " + Cuadrado2.getY2() );
		System.out.println ("Perimetro: " + (ladoC2_1 * 2 + ladoC2_2 * 2));
		System.out.println ("Area: " + (ladoC2_1 * ladoC2_2));
		}
		
		
	}

}



