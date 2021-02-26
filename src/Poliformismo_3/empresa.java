package Poliformismo_3;

import java.util.ArrayList;

public class empresa {
	
	//Artributos
	private final String nombre;
	
	private final String cif;
	
	int telefono;
	
	String direccion;
	
	int empleados;

	ArrayList<empleado> trabajadores = new ArrayList <empleado>();
	
	//Constructor
	public empresa (String nombre, String cif, int telefono, String direccion, int empleados) {
		
		this.nombre=nombre;
		
		this.cif=cif;
		
		this.telefono=telefono;
		
		this.direccion=direccion;
		
		this.empleados=empleados;
	}
	
	
	//Metodos 
	//Aniadir empleado
	public void aniadirEmpleado (empleado emp) {
		trabajadores.add(emp);
	}
	
	//Eliminar empleado
	public void eliminarEmpleado (empleado emp) {
		trabajadores.remove(emp);
	}
	
	//Mostrar todos los empleados
	public void mostrarEmpleados() {
		for (empleado empleado : trabajadores) {
			System.out.println (empleado.toString());
		}
	}
	
	//Calcular salarios brutos
	public void sumaBrutos () {
		double brutos = 0;
		for (empleado empleado : trabajadores) {
			brutos += empleado.getSueldo();
		}
		System.out.println ("La suma de todos los brutos es de: " + brutos);
		System.out.println ("La suma de todos los brutos anuales es de: " + brutos*12);
	}
	
	//Calcular todos los netos
	public void sumaNetos () {
		double netos = 0;
		for (empleado empleado : trabajadores) {
			netos += empleado.calcular_sal();
		}
		System.out.println ("La suma de todos los netos es de: " + netos);
		System.out.println ("La suma de todos los netos anuales es de: " + netos*12);
	}

	
	
	
}
