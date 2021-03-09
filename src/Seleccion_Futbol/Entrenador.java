package Seleccion_Futbol;

//Clase entrenador "hijo" de la clase SeleccionFutbol

public class Entrenador extends SeleccionFutbol {
	
	//Atributos propios
	
	private int idFederacion;
	
	//Constructor
	
	public Entrenador(int id, String nombre, String apellidos, int edad, int idFederacion) {
		
		super(id, nombre, apellidos, edad);
		
		this.idFederacion=idFederacion;
		
	}
	
	//Metodos propios
	
	public void planificarEntrenamiento () {
		System.out.println (nombre + " planifica entrenamiento");
	}
	
	//Metodos heredados
	
			@Override
			public void concentrar() {
				System.out.println (nombre + " se esta concentrando");
			}
			
			@Override
			public void viajar() {
				System.out.println (nombre + " esta viajando");
			}
			
			@Override
			public void entrenar() {
				System.out.println (nombre + " dirige el entrenamiento");
			}
			
			@Override
			public void jugarPartido() {
				System.out.println (nombre + " dirige el partido");
			}
		
			@Override
			public void informacion() {
			System.out.println("id: " + id);	
			System.out.println("nombre: " + nombre);	
			System.out.println("apellidos: " + apellidos);	
			System.out.println("edad: " + edad);	
			System.out.println("id federacion: " + idFederacion);	
			System.out.println(" ");
			}
		

}
