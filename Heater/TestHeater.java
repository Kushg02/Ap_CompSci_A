/**
 *  Verifies the Heat Class works properly 
 *
 * @author Lewin
 * @version 1.0
 */
public class TestHeater
{
    public static void  main(String[] args){
        // Create the class object 
        Heater h1 = new Heater(0, 30); 
        // Check to see if they properly set the default temp
        // and that getTemp works 
        if (h1.getTemp() != 15.0)   System.out.println("temperature not initialized correctly " + h1.getTemp() ) ;

        h1.setIncrement(10); 
        h1.warmer(); 
        // If setIncrement worked & warmer worked the temp should be 25 which is below max 
        // Expect the else to be taken 
        if (h1.getTemp() != 25)   System.out.println("warmer did not work correctly should be 25 and is " + h1.getTemp() ) ;
        else 
        {
            System.out.println("Increment is OK "); 
            // See if you can increment past the max which is 30 
            // it should so it true then the program is wrong  
            if (h1.warmer())   System.out.println(" Temp can not be increased by  " +h1.getIncrement() +" already " + h1.getTemp() ) ; 
            else  
            { 
                System.out.println("Warmer is OK "); 
                h1.cooler(); 
                h1.cooler(); 
                // check to see if cooler works temp should not be allowed to go past 
                // zero.   If it passes the code is good to go. 
                if (h1.cooler())   System.out.println(" Temp can not be decreased by  "+ h1.getIncrement() +" already " + h1.getTemp() ) ;
                else  
                {
                    System.out.println("Cooler is OK" ); 
                    System.out.println(" Code passes"); 
                }
            }

        }
    }
}