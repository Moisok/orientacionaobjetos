package Ejercicio_Herencia2;

import java.util.ArrayList;

public class Cuerpos_celestes {

	public static void main(String[] args) {
		
		//Contruimos arraylist de astros
		
		ArrayList<Astros> listado = new ArrayList<Astros>();
		
		//Construimos satelites y planetas
		Planetas mercurio = new Planetas ("Mercurio",434323,3325,3323065,243465,543445,434545,1000,false);
		Planetas marte = new Planetas ("Mercurio",434,35,3065,265,545,545,200000,true);
		Planetas tierra = new Planetas ("Tierra",45,34,3000,23,56,56,300000,true);
		Satelites luna = new Satelites ("Luna",20,45,450,0,10,35000,23,"Tierra");
		Satelites phobos = new Satelites ("phobos",23,44,555,6,78,3507600,10,"Marte");
		Satelites deimos = new Satelites ("deimos",23,45,5675,8,30,353407600,5,"Marte");

		listado.add(mercurio);
		listado.add(marte);
		listado.add(tierra);
		listado.add(luna);
		listado.add(phobos);
		listado.add(deimos);
		
		//Imprimimos por pantalla
		for (Astros astros : listado) {
			System.out.println (astros.toString());
		}
		
		
	}

}
