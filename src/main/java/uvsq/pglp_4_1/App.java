package uvsq.pglp_4_1;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        Personnels person1 = new Personnels
        		.Builder("ismail 1", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("directeur")
        		.build();
        Personnels person2 = new Personnels
        		.Builder("ismail 2", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("gerant")
        		.build();
        Personnels person3 = new Personnels
        		.Builder("ismail 3", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("rh")
        		.build();
        Personnels person4 = new Personnels
        		.Builder("ismail 4", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("dev 1")
        		.build();
        Personnels person5 = new Personnels
        		.Builder("ismail 5", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("dev 2")
        		.build();
        Personnels person6 = new Personnels
        		.Builder("ismail 6", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("dev 3")
        		.build();
        
        CompositePersonnels g1 = new CompositePersonnels(1);
        g1.add(person1);
        g1.add(person2);
        g1.add(person3);
        CompositePersonnels g2 = new CompositePersonnels(2);
        g2.add(person4);
        g2.add(person5);
        g2.add(person6);
        CompositePersonnels g3 = new CompositePersonnels(3);
        g3.add(g1);
        g3.add(g2);
        
        
        AfficheParGroupe collection  = new AfficheParGroupe(g3);
        
        for(Iterator<AfficheParGroupe> i = collection.getIterator() ; i.hasNext(); ) {
        	((GroupePersonnes) i.next()).print();
        }

    }
}
