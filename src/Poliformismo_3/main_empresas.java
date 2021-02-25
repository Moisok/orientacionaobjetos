//Programa para gestionar empresa creado por MOises Sepulveda Segarra

package Poliformismo_3;

public class main_empresas {

	public static void main(String[] args) {
		
		//Creamos objeto tipo empresa
		empresa comp = new empresa ("Compu","6544335F",8765678,"Calle conejillos", 7);
		
		//Creamos objetos tipo empleados
		empleado pepito = new empleado ("Pepito","5467876-T",900);
		empleado menganito = new empleado ("Menganito","56577876-O",1000);
		empleado margarita = new empleado ("Margarita","5555478-T",1900);
		empleado juanito = new empleado ("Juanito","67896534-G",2800);
		
		//les asignamos direccion ,telefono y edad a los empleados
		pepito.setDireccion_emp("Calle piruleta");
		pepito.setEdad(18);
		pepito.setTelefono_emp(888888888);
		
		menganito.setDireccion_emp("Calle caramelos");
		menganito.setEdad(33);
		menganito.setTelefono_emp(587458965);
		
		margarita.setDireccion_emp("Calle falsa123");
		margarita.setEdad(33);
		margarita.setTelefono_emp(878954123);
		
		juanito.setDireccion_emp("Calle molinos");
		juanito.setEdad(44);
		juanito.setTelefono_emp(878954213);
		
		//Insertamos empleados en la empresa
		comp.aniadirEmpleado(juanito);
		comp.aniadirEmpleado(pepito);
		comp.aniadirEmpleado(menganito);
		comp.aniadirEmpleado(margarita);
		
		//Mostramos empleados
		comp.mostrarEmpleados();
		
		//eliminar empleados
		comp.eliminarEmpleado(margarita);
		
		//Volver a mostrar
		System.out.println (" ");
		comp.mostrarEmpleados();
		
		//Calcular neto de pepito
		System.out.println (" ");
		System.out.println ("El juego neto anual de juanito es de: " + juanito.calcular_sal());
		
		//Mostrar suma todos los brutos
		System.out.println (" ");
		comp.sumaBrutos();
		
		//Mostrar suma todos los netos 
		System.out.println (" ");
		comp.sumaNetos();
	
	}
}
