
import java.util.Scanner;

public class Pruebita {

public static void main(String[] args){
  
  Scanner teclado = new Scanner(System.in);
  
  int opcion = 0;
  
  System.out.println("Menu de prueba");
  
  while (opcion < 4) {
	  
  System.out.println("Elige opcion");
  System.out.println("Opcion 1");
  System.out.println("Opcion 2");
  System.out.println("Opcion 3");
  System.out.println("Opcion 4 (Salir)");
  
  opcion = teclado.nextInt();
  
  if (opcion > 4){
    System.err.println("No existe opcion");
  }
  else {
  switch (opcion) {
    
    case 1: 
      
      System.out.println ("Has elegido la opcion 1");
      break;
      
    case 2:  

      System.out.println ("Has elegido la opcion 2");
      break;
      
    case 3:
      
      System.out.println ("Has elegido la opcion 3");  
      break;
    
    case 4:
      
      System.out.println ("Has salido del programa");
      break;
      
        }
      }
    }
  }
}
  
