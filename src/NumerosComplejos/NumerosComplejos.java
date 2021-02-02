package NumerosComplejos;

/*Calculadora de numeros complejos creada por moises sepulveda*/

import java.util.Scanner;

public class NumerosComplejos {

	public static void main (String [] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double numero1;
		
		double numero2;
		
		double operaIm = 0;
		
		double operaRel = 0;
		
		complejos cv[] = new complejos [5];
		
		int opcion = 0;
		
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

		while (opcion < 10) {
		System.out.println("ELIGE OPERACION");
		System.out.println("1 IMPRIMIR NUMEROS");
		System.out.println("2 SUMAR");
		System.out.println("3 RESTAR");
		System.out.println("4 MULTIPLICAR");
		System.out.println("5 DIVIDIR");
		System.out.println("6 CONSTRUIR VECTOR COMPLEJOS RANDOM");
		System.out.println("7 SUMAR VECTOR");
		System.out.println("8 RESTAR VECTOR");
		System.out.println("9 MULTIPLICAR VECTOR");
		System.out.println("10 SALIR");
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
			
			System.out.println("Ha continuacion se generaran numeros para el vector");
			for (int i=0;i<cv.length;i++) {
			numero1 = Math.random() * (20 - 1) + 1;
			numero2 = Math.random() * (20 - 1) + 1;
			cv[i] = new complejos(numero1,numero2);
			System.out.println ("["+i+"]:"+ cv[i].getRel() + "  +  " + cv[i].getIm() + " i");
			}
			break;
			
		case 7:
			
			/*Suma vector*/
			
			System.out.println(" ");
			System.out.println("Sumar");
			System.out.println(" ");
			
			/*(Acumulador)*/
			
			for (int i=0;i<cv.length;i++) {
				operaRel= cv[i].getRel() + operaRel;
			}
			for (int i=0;i<cv.length;i++) {
				operaIm= cv[i].getIm() + operaIm;
			}
			System.out.println ("La suma del vector es: " + operaRel + " + " + operaIm + " i ");
			operaRel=0;
			operaIm=0;		
			break;
		
		case 8:
			
			/*Resta vector*/
			
			System.out.println(" ");
			System.out.println("Restar");
			System.out.println(" ");
			
			/*(Acumulador)*/
			
			for (int i=0;i<cv.length;i++) {
				operaRel= cv[i].getRel() - operaRel;
			}
			for (int i=0;i<cv.length;i++) {
				operaIm= cv[i].getIm() - operaIm;
			}
			System.out.println ("La resta del vector es: " + operaRel + " - " + operaIm + " i ");
			operaIm= 0;
			operaRel= 0;
			break;
		
		case 9:
			
			/*Multiplica vector*/
			operaIm = 1;
			
			operaRel = 1;
			
			System.out.println(" ");
			System.out.println("Multiplicar");
			System.out.println(" ");
			
			/*(Acumulador)*/
			
			for (int i=0;i<cv.length;i++) {
				operaRel= cv[i].getRel() * operaRel;

			}
			for (int i=0;i<cv.length;i++) {
				operaIm= cv[i].getIm() * operaIm;

			}
			System.out.println ("La multiplicacion del vector es: " + operaRel + " x " + operaIm + " i ");
			operaRel= 0;
			operaIm= 0;
			break;
			
		case 10:
			System.out.println ("Gracias por usar el programa");
			break;
			}
		}
	}
}