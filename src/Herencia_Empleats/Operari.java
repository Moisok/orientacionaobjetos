package Herencia_Empleats;

public class Operari extends Empleat {
	
	public Operari (String nom) {
		super (nom);
	}

	//To String
	@Override
	public String toString() {
		return super.toString() + " operari";
	}
}
