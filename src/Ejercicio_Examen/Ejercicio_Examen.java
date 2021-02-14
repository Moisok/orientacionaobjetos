//Ejercicio que genera examenes creado por Moises Sepulveda Segarra

package Ejercicio_Examen;

import java.util.ArrayList;
import java.util.Iterator;

import Ejercicio1_Producto.Producto;


public class Ejercicio_Examen {

	public static void main(String[] args) {
		
		//Creamos objeto tipo examen 
		
		Examen examen1 = new Examen();
		
		//Creamos objeto de fecha y de hora
		Fecha fecha1 = new Fecha(7,8,98);
		Hora hora1 = new Hora (12,30);
		
		Fecha fecha2 = new Fecha(6,5,99);
		Hora hora2 = new Hora (13,45);
		
		
		Fecha fecha3 = new Fecha(1,2,99);
		Hora hora3 = new Hora (11,30);
		
		Fecha fecha4 = new Fecha(4,5,98);
		Hora hora4 = new Hora (10,30);
		
		Fecha fecha5 = new Fecha(2,3,98);
		Hora hora5 = new Hora (12,30);
		
		
		//Metemos los datos en el examen
		
		examen1.setAsignatura("Matematicas");
		examen1.setAula("Ciencias");
		examen1.setFecha(fecha1);
		examen1.setHora(hora1);
		
		//Mostramos datos por pantalla
		System.out.println (examen1.toString());
		
		System.out.println(" ");
		
		//Creamos arraylist
		
		ArrayList <Examen> examenes = new ArrayList<Examen>();
		
		//Creamos 4 examenes y los metemos en el arraylist
		Examen examen2 = new Examen();
		examen2.setAsignatura("Lengua");
		examen2.setAula("Plastica");
		examen2.setFecha(fecha2);
		examen2.setHora(hora2);
		
		Examen examen3 = new Examen();
		examen3.setAsignatura("Conocimiento del medio");
		examen3.setAula("Ingles 3");
		examen3.setFecha(fecha3);
		examen3.setHora(hora3);
		
		Examen examen4 = new Examen();
		examen4.setAsignatura("Tecnologia");
		examen4.setAula("Ciencias");
		examen4.setFecha(fecha4);
		examen4.setHora(hora4);
		
		Examen examen5 = new Examen();
		examen5.setAsignatura("Frances");
		examen5.setAula("Castellano");
		examen5.setFecha(fecha5);
		examen5.setHora(hora5);
		
		examenes.add(examen1);
		examenes.add(examen2);
		examenes.add(examen3);
		examenes.add(examen4);
		examenes.add(examen5);
		
		//Mostramos datos de los examenes con bucle for each
		for (Examen examen : examenes) {
			System.out.println(examen.toString());
		}
		
		System.out.println(" ");
		
		//Mostramos los datos del examen por iterator
		Iterator<Examen> iterador_examenes = examenes.iterator();
		while(iterador_examenes.hasNext()){
    		Examen datos =iterador_examenes.next();
    		System.out.println ("Asignatura: " + datos.asignatura + " aula:" + datos.aula + " hora:" + datos.hora + " fecha:" + datos.fecha);
  }
 }
}
