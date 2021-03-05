package Ejercicio_Biblioteca;
//Programa biblioteca para gestionar libros y revistas (Si estan prestados o no etc...)

import java.util.ArrayList;

public class Biblioteca {

	public static void main(String[] args) {
		
		//Construimos los objetos
		
		libro elquijote = new libro (1231,"El quijote","01/01/1605");
		libro elhobbit = new libro (5432,"El hobbit","21/09/1937");
		libro larata = new libro (5433, "la rata", "05/06/1999");
		
		revista hobby = new revista (1111,"Hobby consolas","01/01/2021",199);
		revista micromania = new revista (2312,"Micromania","04/01/2020",65);
		revista cosmopolitan = new revista (5613,"Cosmopolitan","03/01/2019",98);
		
		//Construimos el ArrayList
		
		ArrayList <publicacion> listado = new ArrayList <publicacion>();
		
		//Metemos articulos en el arraylist
		
		listado.add(elquijote);
		listado.add(elhobbit);
		listado.add(larata);
		
		listado.add(hobby);
		listado.add(micromania);
		listado.add(cosmopolitan);
		
		//Mostramos la informacion 
		for (publicacion publicacion : listado) {
			System.out.println (publicacion.toString());
		}
		
		//Vamos a prestar el hobbit
		elhobbit.prestar();

		//Ahora vamos a motrar la informacion de el hobbit
		System.out.println (" ");
		System.out.println(elhobbit.toString());
		
		//Ahora vamos a devolver el hobbit
		elhobbit.retornar();
		
		//Volvemos a mostrar la informacion
		System.out.println (" ");
		System.out.println(elhobbit.toString());
		
		//Vamos a dejar algunos libros y mostramos toda la informacion
		elquijote.prestar();
		larata.prestar();
		System.out.println (" ");
		for (publicacion publicacion : listado) {
			System.out.println (publicacion.toString());
		}
	}

}
