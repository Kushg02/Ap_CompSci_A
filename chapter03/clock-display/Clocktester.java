/**
 * tests the  clockdisplay in exercise 3.38 
 *
 * @author  Lewin
 * @version 1.0 
 */
public class Clocktester
{
    public static void main(String[] args) { 
        // tests if a basic clock works 
        // basic hour roll over 
        ClockDisplay clock = new ClockDisplay(13,30);
        for (int i = 0 ; i < 40 ; i++) { 
            clock.timeTick(); }
            
        System.out.println( " correct time should be 2:10 pm---> " + clock.getTime()); 
         // over over at noon 
        ClockDisplay clock2 = new ClockDisplay(11,30);
        for (int i = 0 ; i < 40 ; i++) { 
            clock2.timeTick(); }
            
        System.out.println( " correct time should be 12:10 pm---> " + clock2.getTime());
          // over over at noon 
        ClockDisplay clock3 = new ClockDisplay(23,30);
        for (int i = 0 ; i < 40 ; i++) { 
            clock3.timeTick(); }
            
        System.out.println( " correct time should be 12:10 am---> " + clock3.getTime());
    }
}