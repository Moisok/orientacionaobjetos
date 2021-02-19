package Herencia_Empleats;

public class Directiu extends Empleat {
	
	public Directiu (String nom) {
		super (nom);
	}
	
	//To string
	@Override
	public String toString() {
		return super.toString() + " Directiu";
	}
}
