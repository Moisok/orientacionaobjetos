package Seleccion_Futbol;

//Clase hijo masajista que hereda los artributos de la clase SeleccionFutbol

public class Masajista extends SeleccionFutbol {
	
	//Artributos propios
	
	private String titulacion;
	
	private int aniosExperiencia;
	
	//Constructor
	
	public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int aniosExperiencia) {
		
		super(id, nombre, apellidos, edad);
		
		this.titulacion=titulacion;
		
		this.aniosExperiencia=aniosExperiencia;
	}
	
	//Metodos propios
	
	public void darMasaje() {
		System.out.println (nombre + " da un masaje");
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
		System.out.println (nombre + " da asistencia al entrenamiento");
	}
	
	@Override
	public void jugarPartido() {
		System.out.println (nombre + " da asistencia al partido ");
	}
	
	@Override
	public void informacion() {
	System.out.println("id: " + id);	
	System.out.println("nombre: " + nombre);	
	System.out.println("apellidos: " + apellidos);	
	System.out.println("edad: " + edad);	
	System.out.println("titulacion: " + titulacion);	
	System.out.println("experiencia (años): " + aniosExperiencia);	
	System.out.println(" ");
	}

	

}
