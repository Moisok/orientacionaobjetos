package ExerciciGatoSimple;

import java.util.Scanner;

public class GatoMain {

	public static void main(String[] args) {
		/*Construccion de teclado*/
		Scanner teclado = new Scanner(System.in);
		/*Variables de comida*/
		String comidadegato;
		
		/*Comienza el programa*/
		
		/*Construimos dos gatos*/
		
		GatoSimple gato1 = new GatoSimple ("Misi","azul","siames",8,"macho",5);
		GatoSimple gato2 = new GatoSimple ("Pepe","blanco","pardo",6,"macho",3);
		GatoSimple gato3 = new GatoSimple ("Crispin","gris","pardo",5,"macho",2);
		GatoSimple gato4 = new GatoSimple ("Batoni","rayasgrises","siames",9,"macho",3);
		GatoSimple gato5 = new GatoSimple ("Ramona","negro","siames",4,"hembra",5);
		
		/*Le damos de comer al gato, solo come si es pescado*/
		System.out.println ("Dale de comer al gato");
		comidadegato = teclado.next();

		gato1.come(comidadegato);
		
		/*El gato maulla*/
		gato1.maullar();
		
		/*El gato ronronea*/
		gato1.ronronear();

		/*El gato pelea solo si ambos gatos son machos*/
		gato1.pelea(gato2);
		
		/*Contruccion del array de gatos*/
		GatoSimple gatetes [] = new GatoSimple [5];
		gatetes [0] = gato1;
		gatetes [1] = gato2;
		gatetes [2] = gato3;
		gatetes [3] = gato4;
		gatetes [4] = gato5;
						
		/*Bucle for each*/
		
		for (GatoSimple gatos : gatetes) {
			System.out.println(gatos.toString());
		}
		
	}

}




