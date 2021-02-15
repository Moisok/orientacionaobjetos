package Ejercicio_Herencia2;

 class Planetas extends Astros {
	
	//Artributos de planetas
	
	private double distancia_sol;
	
	private double orbita_sol;
	
	private boolean tiene_satelites;
	
	//Constructor Super
	
	public Planetas () {
		super();
	}
	
	public Planetas(String nombre, double radio_ecuatorial, int rotacion_eje, int masa, double temp_media, double gravedad, double distancia_sol, double orbita_sol, boolean tiene_satelites) {
		
		super(nombre, radio_ecuatorial, rotacion_eje, masa, temp_media, gravedad);
		
		this.distancia_sol=distancia_sol;
		
		this.orbita_sol=orbita_sol;
		
		this.tiene_satelites=tiene_satelites;
	}

	
	//Getters y Setter
	public double getDistancia_sol() {
		return distancia_sol;
	}

	public double getOrbita_sol() {
		return orbita_sol;
	}

	public boolean isTiene_satelites() {
		return tiene_satelites;
	}

	public void setDistancia_sol(double distancia_sol) {
		this.distancia_sol = distancia_sol;
	}

	public void setOrbita_sol(double orbita_sol) {
		this.orbita_sol = orbita_sol;
	}

	public void setTiene_satelites(boolean tiene_satelites) {
		this.tiene_satelites = tiene_satelites;
	}

	@Override
	public String toString() {
		return "Planetas [distancia_sol=" + distancia_sol + ", orbita_sol=" + orbita_sol + ", tiene_satelites="
				+ tiene_satelites + ", nombre=" + nombre + ", radio_ecuatorial=" + radio_ecuatorial + ", rotacion_eje="
				+ rotacion_eje + ", masa=" + masa + ", temp_media=" + temp_media + ", gravedad=" + gravedad + "]";
	}
	
	

	//To String
	
	

}


