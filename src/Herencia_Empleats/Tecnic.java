package Herencia_Empleats;

public class Tecnic extends Operari{
	
	public Tecnic (String nom) {
		super (nom);
	}

	//To String
	@Override
	public String toString() {
		return super.toString()  + " tecnic";
	}
	
	

}
