//Ejercicio para almacenar vehiculos y todos sus datos

package Poliformismo_4;

import java.util.ArrayList;

public class vehiculos_main {

	public static void main(String[] args) {
		
		//Contruimos ArraList de tipo vehiculos
		
		ArrayList <vehiculo> listado = new ArrayList <vehiculo>();
		
		//Creamos vehiculos
		coche nissan = new coche ("3287R","Nissan", 4, false);
		moto kawasaki = new moto ("4567I","Kawasaki",2,"verde");
		submarino lowcost = new submarino ("4567U","Lowcost",25,1000);
		avion boing747 = new avion ("8987TTT", "Boing747",500,74);
		helicoptero apache = new helicoptero ("65678HHH","Apache",2,4);
		
		
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
		
	}

}
