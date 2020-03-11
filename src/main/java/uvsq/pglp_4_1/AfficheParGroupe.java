package uvsq.pglp_4_1;

import java.util.ArrayList;

public class AfficheParGroupe {
	
	ArrayList<GroupePersonnes> persApres;
	
	GroupePersonnes premier;

	public AfficheParGroupe(GroupePersonnes persAvant) {
		premier = persAvant;
		persApres = new  ArrayList<GroupePersonnes>();
	}
	
	
	
	private class GrpIterator implements Iterator{
		int index;
		
		public GrpIterator() {
			
			persApres.add(premier);
			
			int i =0;
			
			while(i < persApres.size()) {
				if(persApres.get(i) instanceof CompositePersonnels) {
					for(GroupePersonnes p : persApres.get(i).getPersonnes()) {
						persApres.add(p);
					}
				}
				i++;
			}
			
		}
		
		public boolean hasNext() {
			if(index < persApres.size())
				return true;
			return false;
		}

		public GroupePersonnes next() {
			index++;
			return persApres.get(index);
		}
	}
	
	public Iterator getIterator() {
		return new GrpIterator();
	}

}
