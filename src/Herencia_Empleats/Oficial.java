package Herencia_Empleats;

public class Oficial extends Operari {
	
	public Oficial (String nom) {
		super (nom);
	}

	//To string
		@Override
		public String toString() {
			return super.toString() +  " oficial";
		}
}
