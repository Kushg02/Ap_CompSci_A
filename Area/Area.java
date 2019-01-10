
/**
 * Write a description of class Area here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Area
{
    // instance variables - replace the example below with your own
    private int x;
    private int length;
    private int width;

    /**
     * Constructor for objects of class Area
     */
    public Area(int len, int wid)
    {
        length = len;
        width = wid;
    }
    public int getLength()
    {
        return length;
    }
    public int getWidth()
    {
        return width;
    }
    public void setLength(int len)
    {
        length = len;
    }
    public void setWidth(int wid)
    {
        width = wid;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showArea()
    {
        // put your code here
        System.out.println(length*width);
    }
}
