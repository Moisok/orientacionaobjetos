package Ejercicio_Agenda;

public class contactoEmpresa extends contacto {
	
	private String web;

	public contactoEmpresa(String nombre, int telefono, String web) {
		
		super(nombre, telefono);
		
		this.web=web;
	}

	//To String
	@Override
	public String toString() {
		return "contactoEmpresa [web=" + web + ", getNombre()=" + getNombre() + ", getTelefono()=" + getTelefono()
				+ "]";
	}
	
	
	
	

}
