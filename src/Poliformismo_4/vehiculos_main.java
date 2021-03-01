//Ejercicio para almacenar vehiculos y todos sus datos

package Poliformismo_4;

import java.util.ArrayList;

public class vehiculos_main {

	public static void main(String[] args) {
		
		//Contruimos ArraList de tipo vehiculos
		
		ArrayList <vehiculo> listado = new ArrayList <vehiculo>();
		
		//Creamos vehiculos
		
		coche nissan = new coche ("3287RGH","Nissan", 4, false);
		moto kawasaki = new moto ("4567D","Kawasaki",2,"verde");
		submarino lowcost = new submarino ("GFHJKIUJHY","Lowcost",25,1000);
		avion boing747 = new avion ("TTTA987654", "Boing747",500,74);
		helicoptero apache = new helicoptero ("JHG87656","Apache",2,4);
		
		
		//insertamos vehiculos en el arraylist
		
		listado.add(nissan);
		listado.add(kawasaki);
		listado.add(lowcost);
		listado.add(boing747);
		listado.add(apache);
		
		//Mostramos los datos del arraylist
		
		for (vehiculo vehiculo : listado) {
			vehiculo.imprimir_datos();
		}
		
		System.out.println (" ");
		
		//Validamos matriculas
		
		for (vehiculo vehiculo : listado) {
			System.out.println (" ");
			if (vehiculo.validar_matricula()) {
				System.out.println ("La matricula de " + vehiculo.getModelo() + " con matricula " + vehiculo.getMatricula() + " es valida");
			}
			else {
				System.out.println ("ERROR: la matricula de " + vehiculo.getModelo() + " con matricula " + vehiculo.getMatricula() + " no es valida");
			}
		}
		
	}

}
