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
        System.out.println( "Hello World!" );
        
        Personnels person = new Personnels
        		.Builder("ismail", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("directeur")
        		.build();
    }
}
