package Herencia_Empleats;

import java.util.ArrayList;

public class Dades_empleats {
	
	public static void main (String[]args) {
		
		//Construix els empleats
		Empleat E1 = new Empleat("Rafa");
		Directiu D1 = new Directiu ("Mario");
		Operari OP1 = new Operari("Alfonso");
		Oficial OF1 = new Oficial ("Luis");
		Tecnic T1 = new Tecnic ("Pablo");
		
		/*Imprime per pantalla
		System.out.println (E1.toString());
		System.out.println (D1.toString());
		System.out.println (OP1.toString());
		System.out.println (OF1.toString());
		System.out.println (T1.toString());*/
		
		//Construyo l ArrayList
		ArrayList<Empleat> listaEmpleats = new ArrayList <Empleat>();
		
		//Anyado elemets l arraylist
		listaEmpleats.add(E1);
		listaEmpleats.add(D1);
		listaEmpleats.add(OP1);
		listaEmpleats.add(OF1);
		listaEmpleats.add(T1);
		
		for (Empleat empleat : listaEmpleats) {
			System.out.println (empleat.toString());
		}
	}
}
