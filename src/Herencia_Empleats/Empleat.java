package Herencia_Empleats;

public class Empleat {

		private String nom;
		
		//Constructor
		public Empleat (String nom) {
			this.nom=nom;
		}
		
		//Getter y setter
		public String getNom( ) {
			return nom;
		}
		
		public String setNom(String nom) {
			this.nom=nom;
			return nom;
		}

		
		//Metode to string
		@Override
		public String toString() {
			return "Empleat: " + nom;
		}
		
		
		
	}


