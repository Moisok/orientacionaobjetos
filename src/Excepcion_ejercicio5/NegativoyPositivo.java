package Excepcion_ejercicio5;

import java.util.*;

//Programa para probar excepciones en valores Creado por Moises Sepulveda Segarra

public class NegativoyPositivo {

	 //Funcion positivo
	
	static void imprimePositivo(int p) throws Exception {
		
		if (p < 0) {
			throw new Exception("el positivo " + p + " no es valido por que es menor que " + 0 + " por lo que es negativo");
		}
		
		else {
			System.out.println (p);
		}
		
		
	}
	
	//Funcion negativo
	
	 static void imprimeNegativo(int n) throws Exception {
		
		if (n >= 0) {
			throw new Exception("el negativo " + n + " no es valido por que es mayor que " + 0 + " por lo que es positivo");
		}
		
		else {
			System.out.println (n);
		}
		
	}
	
	//Funcion main (principal)
	
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner (System.in);	
		
	int negativo;
	
	int positivo;
	  
	for (int i=0;i<5;i++) {
	System.out.println ("Introduce positivo" );
	positivo = teclado.nextInt();
	System.out.println ("Introduce negativo");
	negativo = teclado.nextInt();
	
	try {
		imprimeNegativo(negativo);
		imprimePositivo(positivo);
	} 
	
	catch (InputMismatchException o) {
		o.printStackTrace();
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}
		
		}

			}

}
