
import java.util.*;
public class Maptester
{
    // instance variables - replace the example below with your own
    HashMap<String, String> responseMap;

    /**
     * Constructor for objects of class Maptester
     */
    public Maptester()
    {
        responseMap = new HashMap<>();
    }
    
    public void enterNumber(String name, String number)
    {
        responseMap.put(name, number);
    }
    public String lookupNumber(String name)
    {
        return responseMap.get(name);
    }
    //6.28 It replaces the original key with the newer value
    //6.29 It still creates the new entry bc different keys
    //6.30 Using the get method in the lookup function
    //6.31 Returns null
    //6.32 A for each loop 
    public static void main(String args[]){
        Maptester m = new Maptester();
        
        m.enterNumber("Steve", "916");
        System.out.println(m.lookupNumber("Steve"));
        m.enterNumber("Steve", "912");
        System.out.println(m.lookupNumber("Steve"));
        m.enterNumber("Steve", "916");
        
        m.enterNumber("Stove", "916");
        System.out.println(m.lookupNumber("Steve"));
        System.out.println(m.lookupNumber("Stove"));
        
        System.out.println(m.lookupNumber("Steve"));
        
        System.out.println(m.lookupNumber("car"));
        
        for(String currentKey : m.responseMap.keySet()){
            System.out.println(m.lookupNumber(currentKey));
        }
    }
}
