package Polimorfismo_1;

public abstract class mascotas {
	
	//Definimos variables
	protected String nombre;
	protected int edad;
	protected String estado;
	protected String fechaNacimiento;
	
	//Constructor
	public mascotas (String nombre, int edad, String estado, String fechaNacimiento) {
		
		this.nombre=nombre;
		
		this.edad=edad;
		
		this.estado=estado;
		
		this.fechaNacimiento=fechaNacimiento;
	}
	
	//Funcion de mostrar los datos
	public abstract void muestra(); 
		//Mostrar datos de las mascotas, estas heredaran los artributos de la clase
		//Padre
	
	
	//Funcion de hablar
	public abstract void habla();
	
	
	//Funcion de mostrar el compleaños
	public String cumpleanios (String cumpleanios){
		String cumple = cumpleanios;
		return cumple;
	}
	
	//Funcion de morir
	public String morir (String muerte) {
		String morir=muerte;
		return morir;
	}

}
