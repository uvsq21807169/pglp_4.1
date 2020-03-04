package uvsq.pglp_4_1;
import java.util.ArrayList;

public final class Personnels {

	private String nom;
	private String prenom;
	private String fonction;
	private java.time.LocalDateTime date_naissance;
	private ArrayList<Integer> num_tel;
	
	public static class Builder{
		private String nom;
		private String prenom;
		private String fonction = "fonction";
		private java.time.LocalDateTime date_naissance;
		private ArrayList<Integer> num_tel;
		
		public Builder(String nom, String prenom,java.time.LocalDateTime date_naissance ) {
			this.nom = nom;
			this.prenom = prenom;
			this.date_naissance = date_naissance;
		}
		
		public void add_tel(int tel) {
			this.num_tel.add(tel);
		}
		
		public Personnels build() {
			return new Personnels(this);
		}
	}
	public Personnels(Builder builder) {
		
	}

}
