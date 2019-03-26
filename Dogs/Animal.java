
/**
 * Used to explain inheritance 
 *
 * @author Lewin
 * @version 1.0
 */
public class Animal
{
    // instance variables - replace the example below with your own
    private int legs;
    private String color; 
    private int size;  // in pounds. 

    /**
     * Constructor for objects of class Animal
     */
    public Animal(){ 
        legs = 4; 
        size = 1; 
        color = "brown"; 
    }     
    public Animal(int legs, int size, String color)
    { 
        this.legs = legs; 
        this.size = size; 
        this.color = color; 
    } 
    public void run(int speed)
    {
        System.out.println("This animal is running at " + speed); 
    }
    public int getsize(){ 
        return size;
    }
    public int getLegs(){ 
            return legs;
    }
    public void bark(int sound){
        System.out.println("animal Barks");
    }
}
