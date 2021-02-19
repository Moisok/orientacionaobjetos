package Polimorfismo_1;

public abstract class aves extends mascotas {
	
	//Definimos las variables
	
	protected String pico;
	
	protected boolean vuela;

	//Hacemos el constructor
	public aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
		
		super(nombre, edad, estado, fechaNacimiento);
	
		this.pico=pico;
		
		this.vuela=vuela;
	}

	//Creamos getters y setter
	public String getPico() {
		return pico;
	}

	public boolean isVuela() {
		return vuela;
	}

	public void setPico(String pico) {
		this.pico = pico;
	}

	public void setVuela(boolean vuela) {
		this.vuela = vuela;
	}
	
	//Creamos metodo obligatorio que es volar
	public abstract void volar ();
	
	//Importamos los metodos
	@Override
	public abstract void muestra();
	
	@Override
	public abstract void habla();
	
}
