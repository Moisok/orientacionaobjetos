package Excepcion_Ejercicio6;

//Ejercicio gatos por Moises Sepulveda Segarra

import java.util.*;

public class Gato_main {

	public static void main(String[] args)   {
		
		try {
			gato leopoldo = new gato ("Leopoldo", 5);
			System.out.println(leopoldo.info());
			gato batony = new gato ("batony", 6);
			System.out.println(batony.info());
			gato mi = new gato ("mi", 6);
			System.out.println(mi.info());
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
