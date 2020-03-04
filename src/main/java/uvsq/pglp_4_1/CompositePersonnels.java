package uvsq.pglp_4_1;

import java.util.ArrayList;

public class CompositePersonnels implements GroupePersonnes {

	int id;
	private ArrayList<GroupePersonnes> personnes = new ArrayList<GroupePersonnes>();
	
	public CompositePersonnels(int id) {
		this.id = id;
	}
	
	public void print() {
			System.out.println(id);
			for(GroupePersonnes g : personnes) {
				g.print();
			}
	}
	
	public void add(GroupePersonnes groupe) {
		personnes.add(groupe);
	}

}
