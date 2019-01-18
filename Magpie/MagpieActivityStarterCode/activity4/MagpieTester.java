import java.util.Scanner;

/**
 * Tester to Magpie lab activites 2,3,4 
 * @author Lewin
 * @version 1.0
 */
public class MagpieTester
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		
		
		System.out.println ("Which Magpie do you want to test?  2, 3 or 4");
		
		Scanner in = new Scanner (System.in);
		String tester = in.nextLine();
		
		if (tester.equals("2"))  {
		    	     //testMagPie2(); 
		    	 }
		  else 
		     if (tester.equals("3")) {
		      ///  testMagPie3(); 
		      }
		        else 
		           if (tester.equals("4")) 
		             { 
		                 testMagPie4(); 
		              }
		           else System.out.println("Sorry you did not follow directions, try again"); 
		           
		
	}
        private static void  testMagPie4()  {
           Magpie4 maggie = new Magpie4();
           System.out.println("We should see --- Would you really be happy if you had cookies");
	   System.out.println(maggie.getResponse("I want cookies" )) ; 
	   System.out.println("We should see --- Why do you like me?");
	   System.out.println(maggie.getResponse("I like you" )) ; 
	   System.out.println("Magpie4 Done");
        }
}