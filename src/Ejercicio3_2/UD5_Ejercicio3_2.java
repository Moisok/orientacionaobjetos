package Ejercicio3_2;

public class UD5_Ejercicio3_2 {
	
public static void main(String[] args) {
		
		Persona Manuel = new Persona ("Manuelo","Cervantes",54,54577809);
		
		Persona Alfonso = new Persona ("Alfonso","Garcia",21,578963254);

		System.out.println (" ");
		System.out.println ("Nombre: " + Manuel.getnombre());
		System.out.println ("Apellido: " + Manuel.getapellido());
		System.out.println ("Edad: " + Manuel.getedad());
		System.out.println ("DNI: " + Manuel.getdni());
		
		Manuel.setnombre("Alberto");
		Manuel.setapellido("Cañizares");
		Manuel.setedad(89);
		Manuel.setdni(787965545);
		
		System.out.println (" ");
		System.out.println ("Nombre: " + Manuel.getnombre());
		System.out.println ("Apellido: " + Manuel.getapellido());
		System.out.println ("Edad: " + Manuel.getedad());
		System.out.println ("DNI: " + Manuel.getdni());
		
		
		
		System.out.println (" ");
		System.out.println ("Nombre: " + Alfonso.getnombre());
		System.out.println ("Apellido: " + Alfonso.getapellido());
		System.out.println ("Edad: " + Alfonso.getedad());
		System.out.println ("DNI: " + Alfonso.getdni());
		
		Alfonso.setnombre("Manuelillo");
		Alfonso.setapellido("Carrasco");
		Alfonso.setedad(34);
		Alfonso.setdni(44456984);
		
		System.out.println (" ");
		System.out.println ("Nombre: " + Alfonso.getnombre());
		System.out.println ("Apellido: " + Alfonso.getapellido());
		System.out.println ("Edad: " + Alfonso.getedad());
		System.out.println ("DNI: " + Alfonso.getdni());

	}

}


