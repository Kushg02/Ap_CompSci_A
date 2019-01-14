/**
 * tests the  clockdisplay for seconds 
 *
 * @author  Lewin
 * @version 1.0 
 */
public class Clocktestsec
{
    public static void main(String[] args) { 
        // tests if a basic clock works 
        // basic hour roll over 
        ClockDisplay clock = new ClockDisplay(13,30,00);
        for (int i = 0 ; i < 120 ; i++) { 
            clock.timeTick(); }
            
        System.out.println( " correct time should be 1:32:00 pm---> " + clock.getTime()); 
         // over over at noon 
        ClockDisplay clock2 = new ClockDisplay(11,59,59);
        for (int i = 0 ; i < 61 ; i++) { 
            clock2.timeTick(); }
            
        System.out.println( " correct time should be 12:01:00 pm---> " + clock2.getTime());
          // over over at noon 
        ClockDisplay clock3 = new ClockDisplay(23,59,59);
        for (int i = 0 ; i < 61 ; i++) { 
            clock3.timeTick(); }
            
        System.out.println( " correct time should be 12:01:00 am---> " + clock3.getTime());
    }
}