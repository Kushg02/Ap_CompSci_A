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
		    	     testMagPie2(); 
		    	 }
		  else 
		     if (tester.equals("3")) {
		        testMagPie3(); 
		      }
		        else 
		           if (tester.equals("4")) 
		             { 
		                 testMagPie4(); 
		              }
		           else System.out.println("Sorry you did not follow directions, try again"); 
		           
		
	}
	private static void  testMagPie2() {
	   Magpie2 maggie = new Magpie2();
	   System.out.println("We should see --- Tell me more about your pets");
	   System.out.println(maggie.getResponse("I Like cat Mittens" )) ; 
	   System.out.println("We should see --- He sounds like a good teacher");
	   System.out.println(maggie.getResponse("Mr. Lewin loves computer science" )) ; 
	   System.out.println("We should see --- Say something, please");
	   System.out.println(maggie.getResponse("" )) ; 
	   System.out.println("Magpie2 Done"); 
         } 
        private static void  testMagPie3() {
           Magpie3 maggie = new Magpie3();
	   System.out.println("We should see --- Tell me more about your pets");
	   System.out.println(maggie.getResponse("I Like cat Mittens" )) ; 
	   System.out.println("We should see --- He sounds like a good teacher");
	   System.out.println(maggie.getResponse("Mr. Lewin loves computer science" )) ; 
	   System.out.println("We should see --- Say something, please");
	   System.out.println(maggie.getResponse("" )) ; 
	   System.out.println("Magpie3 Done"); 
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
