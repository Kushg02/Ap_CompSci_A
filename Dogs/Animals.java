import java.util.ArrayList; 
public class Animals 
{
  public static void main(String Args[]) { 
      
      ArrayList<Animal> animals = new ArrayList<>(); 
      animals.add(new Dog(2,"Brown","Fuffy","Rat Terrier")); 
      for (Animal newanimal: animals ) { 
      newanimal.bark(5);  
      System.out.println(newanimal.toString());
      }
}
}
