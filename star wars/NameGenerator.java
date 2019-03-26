
/**
 * Write a description of class NameGenerator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NameGenerator
{
    // instance variables - replace the example below with your own
    private String SWfirstName;
    private String SWlastName;
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        SWfirstName = "";
        SWlastName = "";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String generateStarWarsName(String firstName, String lastName, String maidenName, String cityName)
    {
        SWfirstName = firstName.substring(0,2) +  (lastName.substring(0,3));
        SWlastName = (cityName.substring(0,3)) +  (maidenName.substring(0,2));
        return SWfirstName + " " + SWlastName;
    }
    public static void main(String args[]){
        NameGenerator app = new NameGenerator();
        System.out.println(app.generateStarWarsName("Kush", "garg", "rastogi", "Bedford"));
    }
}
