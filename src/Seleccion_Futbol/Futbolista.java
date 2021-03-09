package Seleccion_Futbol;

//Clase hijo futbolista

public class Futbolista extends SeleccionFutbol {

	//Artributos propios
	
	private int dorsal;
	
	private String demarcacion;

	
	//Constructor
	
	public Futbolista(int id, String nombre, String apellidos, int edad, int dorsal, String demarcacion) {
		
		super(id, nombre, apellidos, edad);
		
		this.dorsal=dorsal;
		
		this.demarcacion=demarcacion;
		
	}
	
	//Metodos propios
	
	public void entrevista() {
		System.out.println (nombre + " da una entrevista");
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
			System.out.println (nombre + " esta entrenando");
		}
		
		@Override
		public void jugarPartido() {
			System.out.println (nombre + " juega el partido");
		}
		
		@Override
		public void informacion() {
		System.out.println("id: " + id);	
		System.out.println("nombre: " + nombre);	
		System.out.println("apellidos: " + apellidos);	
		System.out.println("edad: " + edad);	
		System.out.println("dorsal: " + dorsal);	
		System.out.println("demarcacion: " + demarcacion);
		System.out.println(" ");
		}
	
	
}
