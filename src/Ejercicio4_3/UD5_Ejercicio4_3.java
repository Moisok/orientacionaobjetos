package Ejercicio4_3;

public class UD5_Ejercicio4_3 {
	
public static void main(String[] args) {
		
		rectangulo Cuadrado1 = new rectangulo (0,0,5,5);
		
		rectangulo Cuadrado2 = new rectangulo (7,9,2,3);

		/*Primer rectangulo*/
		
		Cuadrado1.mostrardatos();
		
		System.out.println (" ");
		
		Cuadrado2.mostrardatos();
		
		System.out.println (" ");
		
		Cuadrado1.perimetro();
		
		System.out.println (" ");
		
		Cuadrado2.perimetro();
		
		System.out.println (" ");
		
		Cuadrado1.area();
		
		System.out.println (" ");
		
		Cuadrado2.area();
		
		Cuadrado1.setALL(8,6,5,3);
		
		System.out.println (" ");
		
		Cuadrado1.mostrardatos();
		
		System.out.println (" ");
		
		Cuadrado1.area();
		
		System.out.println (" ");
		
		Cuadrado1.perimetro();
		
		
		
	}

}






