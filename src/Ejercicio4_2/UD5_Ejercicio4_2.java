package Ejercicio4_2;

public class UD5_Ejercicio4_2 {
	
public static void main(String[] args) {
		
		Persona Manuel = new Persona ("Manuelo","Cervantes",68,54577809);
		
		Persona Alfonso = new Persona ("Alfonso","Garcia",16,578963254);

		Manuel.imprime();
		
		Alfonso.imprime();
		
		/*Mayor de edad o no*/
		
		if (Manuel.esMayorEdad()) {
			System.out.println (Manuel.getnombre() + " es mayor de edad");
		}
		
		else {
			System.out.println (Manuel.getnombre() + " no es mayor de edad");
		}
		
		
		if (Alfonso.esMayorEdad()) {
			System.out.println (Alfonso.getnombre() + " es mayor de edad");
		}
		
		else {
			System.out.println (Alfonso.getnombre() + " no es mayor de edad");
		}
		
		System.out.println (" ");
		
		/*Jubilado o no*/
		
		if (Manuel.esJubilado()) {
			System.out.println (Manuel.getnombre() + " esta jubilado");
		}
		
		else {
			System.out.println (Manuel.getnombre() + " no es jubilado");
		}
		
		
		if (Alfonso.esJubilado()) {
			System.out.println (Alfonso.getnombre() + " esta jubilado");
		}
		
		else {
			System.out.println (Alfonso.getnombre() + " no es jubilado");
	
		}
		
		/*Diferencia de edades*/
		
		System.out.println ("La difenrencia de edad entre " + Manuel.getnombre() + " y " + Alfonso.getnombre() + " es de "+ Alfonso.diferenciaEdad(Manuel) + " años");
		

	
	}

}





