package Ejercicio_Agenda;

public class contactoPersona extends contacto {

	//Artributos propios
	private String cumpleaños;

	public contactoPersona(String nombre, int telefono, String cumpleaños) {
		super(nombre, telefono);
		this.cumpleaños=cumpleaños;
	}
	
	//To string
	@Override
	public String toString() {
		return "contactoPersona [cumpleaños=" + cumpleaños + ", getNombre()=" + getNombre() + ", getTelefono()="
				+ getTelefono() + "]";
	}
	
	
}
