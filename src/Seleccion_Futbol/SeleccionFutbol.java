package Seleccion_Futbol;

//Clase seleccion de futbol aqui implementamos la interface y sus metodos

public abstract class SeleccionFutbol implements integranteSeleccionFutbol {

	protected int id;
	
	protected String nombre;
	
	protected String apellidos;
	
	protected int edad;
	
	
	//Constructor
	
	public SeleccionFutbol (int id, String nombre, String apellidos, int edad) {
		
		this.id=id;
		
		this.nombre=nombre;
		
		this.apellidos=apellidos;
		
		this.edad=edad;
		
	}
	
	//Metodos heredados
	
	@Override
	public void concentrar() {
		
	}
	
	@Override
	public void viajar() {
		
	}
	
	@Override
	public void entrenar() {
		
	}
	
	@Override
	public void jugarPartido() {
		
	}
	
	@Override
	public void informacion() {
		
	}
	
	
	
}
