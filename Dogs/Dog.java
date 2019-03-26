
/**
 * Example of using inheritance 
 *
 * @author Lewin
 * @version 1.1
 */
public class Dog extends Animal 
{
    // instance variables - replace the example below with your own
    private String name; 
    private String type; 
    /**
     * Constructor for objects of class dog
     */
    public Dog(){ 
        name = "Default"; 
        type = "Small" ; 
    }
    public Dog(int size, String color, String name, String type)
    {
        // initialise instance variables
       super(4, size, color);  
       this.name = name;
       this.type = type; 
    }

    public void  bark (int sound)
    {
        // put your code here
        System.out.print(name + " has barked"); 
    }
    
    public String toString()
    { 
        return " this is a dog named " + name; 
     }
}