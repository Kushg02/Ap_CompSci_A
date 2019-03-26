
/**
 * Write a description of class overload here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Overload
{
    private int nums;
    private String name; 

  public Overload()
  { 
      nums = 10 ; 
      name = "lewin"; 
    } 
  public int setnums(int newnum )
     { 
         nums = newnum + 2; 
         return nums; 
        } 
   public int setnums(String name) 
    { 
       if ( this.name.equals(name) ) 
           nums --; 
       else nums ++;
       return nums; 
    } 
   public double nums(int newnum)
      { 
          nums = newnum + 2; 
          return (double) nums; 
        } 
    }     
