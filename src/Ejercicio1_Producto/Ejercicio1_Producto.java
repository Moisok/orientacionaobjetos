package Ejercicio1_Producto;


import java.util.Iterator;
import java.util.ArrayList;



public class Ejercicio1_Producto {

	public static void main (String[]args) {
		
		//1 Objetos 
		
		Producto leche = new Producto ("leche",5);
		
		Producto cacao = new Producto ("cacao",4);
		
		Producto arroz = new Producto ("arroz",2);
		
		Producto poleo = new Producto ("poleo",8);
		
		Producto magdalenas = new Producto ("magdalenas",12);
		
		//2 ArrayList
		
		
		ArrayList<Producto> prods = new ArrayList<Producto>();
		
<<<<<<< HEAD
		//3 Añadidos a la ArrayList
=======
		//3 Aï¿½adidos a la ArrayList
>>>>>>> e7f4081737960b97015764d3e16851ac0822b23c
		
		prods.add(leche);
		prods.add(cacao);
		prods.add(arroz);
		prods.add(poleo);
		prods.add(magdalenas);
		
		
		//4.1 Creamos un iterador
		
		Iterator<Producto> iterador_productos = prods.iterator();
		
		//4.2 visualizamos el iterador
        while(iterador_productos.hasNext()){
        		Producto datos =iterador_productos.next();
        		System.out.println ("Producto: " + datos.nombre + " Cantidad:" + datos.cantidad);
        }
		
        
        //5 Eliminar 2 elementos del arrayList
        System.out.println (" ");
        prods.remove(leche);
        prods.remove(cacao);
        
        
        
       //6 y 7 Insertar Producto en medio de la lista y visualizar de nuevo el contenido
        prods.add(2,leche);
        Iterator<Producto> iterador_productos2 = prods.iterator();
        while(iterador_productos2.hasNext()){
    		Producto datos2 =iterador_productos2.next();
    		System.out.println ("Producto: " + datos2.nombre + " Cantidad:" + datos2.cantidad);
    }
        
        //8 Eliminar todos los valores del ArrayList
        prods.clear();
        
		
		
		
		
		
	}
	
	
<<<<<<< HEAD
}
=======
}
>>>>>>> e7f4081737960b97015764d3e16851ac0822b23c
