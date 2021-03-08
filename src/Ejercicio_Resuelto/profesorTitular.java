package Ejercicio_Resuelto;

//Clase profesor titular que hereda los artributos de profesor
public class profesorTitular extends profesor {

	private String asignatura;
	
	private String departamento;
	
	private boolean directiva;
	
	//Creamos constructor
	
	public profesorTitular(String nombre, String apellidos, int edad, String centro, String curso,
			String asignatura, String departamento, boolean directiva) {
			super(nombre, apellidos, edad, centro, curso);
			
			this.asignatura=asignatura;
			
			this.departamento=departamento;
			
			this.directiva=directiva;
	}

	//Generamos getters y setter
	
	public String getAsignatura() {
		return asignatura;
	}

	public String getDepartamento() {
		return departamento;
	}

	public boolean isDirectiva() {
		return directiva;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setDirectiva(boolean directiva) {
		this.directiva = directiva;
	}
	
	//Metodos heredados
		@Override
		public String informacion() {
			String info ="Nombre: " + nombre + " apellidos: " + apellidos +
			" edad: " + edad + " centro: " + centro + " curso: " + curso + " asignatura: " + 
			asignatura + " departamento: " + departamento + " ¿es de la directiva?: " + directiva;		
			return info;
		}
}
