
/**
 * Write a description of class Heater here.
 *
 * @author (Kush)
 * @version (1/10/2019 8:28am)
 */
public class Heater
{
    // instance variables - replace the example below with your own
    private int x;
    private double temperature;
    private double increment;
    private double max;
    private double min;

    /**
     * Constructor for objects of class Heater
     */
    public Heater(double nMin, double nMax)
    {
        temperature = 15.0;
        increment = 5.0;
        max = nMax;
        min = nMin;
    }
    public double getTemp()
    {
        return temperature;
    }
    public double getIncrement()
    {
        return increment;
    }    
    public boolean warmer()
    {
        if((temperature+increment) <= max)
        {
            temperature += increment;
            return true;
        }
        return false;
    }
    public boolean cooler()
    {
        if((temperature-increment) >= min)
        {
            temperature -= increment;
            return true;
        }
        return false;
    }
    public void setIncrement(double sIncrement)
    {
            increment = sIncrement;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
