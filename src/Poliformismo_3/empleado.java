package Poliformismo_3;

public class empleado {
	
	//Artributos
	
	private final String nombre_emp;
	
	private final String dni;
	
	private int edad;
	
	private String direccion_emp;
	
	private int telefono_emp;
	
	private double sueldo;
	
	//Constructor
	
	public empleado (String nombre_emp, String dni, double sueldo) {
		this.nombre_emp=nombre_emp;
		this.dni=dni;
		this.sueldo=sueldo;
	}
	
	//Getters y setters
	

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDni() {
		return dni;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setDireccion_emp(String direccion_emp) {
		this.direccion_emp = direccion_emp;
	}

	public void setTelefono_emp(int telefono_emp) {
		this.telefono_emp = telefono_emp;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	//Mostrar datos de empleado por pantalla
	
	@Override
	public String toString() {
		return  "Nombre: " + nombre_emp +
				" Dni: " + dni + 
				" Edad: " + edad + 
				" Direccion: " + direccion_emp + 
				" Telefono: " + telefono_emp + 
				" Sueldo: " + sueldo;
	}
	
	//Calcular salario
	public double calcular_sal() {
		double anual = sueldo * 12;
		double neto = 0;
		if (anual < 12000) {
			neto=sueldo-(anual*0.20);
		}
		if (anual > 12000 && anual < 25000) {
			neto=sueldo-(anual*0.30);
		}
		if (anual > 25000) {
			neto=sueldo-(anual*0.40);
		}
		return neto;
		
	}

}
