package NumerosComplejos;


/*Calculadora de numeros complejos creada por moises sepulveda*/

import java.util.Scanner;

public class NumerosComplejos {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numero1;
		
		double numero2;
		
		int opcion = 0;
		
		
		System.out.println ("Bienvenido a la calculadora de numeros complejos");
		System.out.println ("Introduce un numero doble");
		System.out.print ("INTRODUCE: ");
		numero1 = teclado.nextDouble();
		System.out.println ("Introduce otro numero doble");
		System.out.print ("INTRODUCE: ");
		numero2 = teclado.nextDouble();
	
		complejos complejo1 = new complejos(numero1,numero2);
		
		System.out.println ("Ahora vamos a construir el segundo numero complejo");
		System.out.println ("Introduce un numero doble");
		System.out.print ("INTRODUCE: ");
		numero1 = teclado.nextDouble();
		System.out.println ("Introduce otro numero doble");
		System.out.print ("INTRODUCE: ");
		numero2 = teclado.nextDouble();
		
		complejos complejo2 = new complejos(numero1,numero2);

		while (opcion < 7) {
		System.out.println("¿Que operacion quieres hacer?");
		System.out.println("1 IMPRIMIR NUMEROS");
		System.out.println("2 SUMAR");
		System.out.println("3 RESTAR");
		System.out.println("4 MULTIPLICAR");
		System.out.println("5 DIVIDIR");
		System.out.println("6 CONSTRUIR VECTOR");
		System.out.println("7 SALIR");
		System.out.print ("INTRODUCE: ");
		opcion = teclado.nextInt();

		
		switch (opcion) {
		case 1: 
			complejo1.imprimir();
			complejo2.imprimir();
			break;
		case 2:
			System.out.println("La suma es: " + complejo1.suma(complejo2));
			System.out.println(" ");
			break;
		case 3:
			System.out.println("La resta es: " + complejo1.resta(complejo2));
			System.out.println(" ");
			break;
		case 4: 
			System.out.println("La multiplicacion es: " + complejo1.multiplicar(complejo2));
			System.out.println(" ");
			break;
		case 5:
			System.out.println("La division es: " + complejo1.division(complejo2));
			System.out.println(" ");
			break;
		case 6:
			System.out.println("PROXIMAMENTE");
			System.out.println(" ");
			break;
		case 7:
		System.out.println("Gracias por usar nuestra calculadora");
		break;
			}
		}
	}
}




/*	
complejos complejo2 = new complejos(5,7);

complejo1.imprimir();
complejo2.imprimir();

System.out.println("La suma es: " + complejo1.suma(complejo2));
System.out.println(" ");
System.out.println("La resta es: " + complejo1.resta(complejo2));
System.out.println(" ");
System.out.println("La multiplicacion es: " + complejo1.multiplicar(complejo2));
System.out.println(" ");
System.out.println("La division es: " + complejo1.division(complejo2));
System.out.println(" ");
*/