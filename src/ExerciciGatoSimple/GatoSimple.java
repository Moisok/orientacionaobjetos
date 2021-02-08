package ExerciciGatoSimple;

public class GatoSimple {
	
/***Artributos***/
	
	private String nombre;
	
	private String color;
	
	private String raza;
	
	private int edad;
	
	private String sexo;
	
	private float kilos;
	
	private String cadena;
	
/***Contructor***/	
	
	public GatoSimple (String nombre, String color, String raza, int edad, String sexo, float kilos) {
		
		this.nombre=nombre;
		
		this.color=color;
		
		this.raza=raza;
		
		this.edad=edad;
		
		this.sexo=sexo;
		
		this.kilos=kilos;
	}
	
/***Getters***/
	
	public String getNombre() {
		return nombre;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getRaza() {
		return raza;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public float getKilos() {
		return kilos;
	}
	
/***Setters***/
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public void setRaza(String raza) {
		this.raza = raza;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setKilos(float kilos) {
		this.kilos = kilos;
	}

/***Metodos***/
	
	/*Comer*/
	
	void come (String comida) {
		
		if (comida.equals("pescado") | comida.equals("carne") | comida.equals("pienso") | comida.equals("lata")){
			System.out.println (nombre + " esta comiendo " + comida);
		}
		
		else {
			System.out.println ("a " +  nombre + " no le gusta " + comida);
		}
	}
	
	/*Pelear*/
	
	void pelea (GatoSimple contrincante) {
		
		if (contrincante.sexo == "macho" & this.sexo == "macho") {
			System.out.println (contrincante.nombre + " y " + this.nombre + " estan peleando");
		}
		
		else {
			System.out.println ("a " + this.nombre + " no le interesa pelear con " + contrincante.nombre);
		}
		
		
	}
	
	/*Maullar*/
	void maullar () {
		System.out.println (nombre + " esta maullando");
	}
	
	/*ronronear*/
	void ronronear () {
		System.out.println (nombre + " esta ronroneando por que esta comodo");
		
	}
	
	/*Datos del gato*/
	
	public String toString() {
	String cadena =
	"-------------------------------------------------";
	cadena += "\nNombre: " + this.nombre;
	cadena += "\nColor: " + this.color;
	cadena += "\nRaza: " + this.raza;
	cadena += "\nEdad: " + this.edad;
	cadena += "\nSexo: " + this.sexo;
	cadena += "\nPeso: " + this.kilos;
	cadena += "\n-------------------------------------------------";
	return cadena;
	}
	

}
