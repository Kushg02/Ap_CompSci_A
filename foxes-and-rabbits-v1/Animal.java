import java.util.*;
/**
 * Write a description of class Animal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Animal implements Actor
{
    // -- class variables shared by all animals
    
    // -- field variables
    
    // The animal's age.
    private int age;
    // Whether the animal is alive or not.
    private boolean alive;
    // The animal's position.
    private Location location;
    // The field occupied.
    private Field field;
    
    //yes
    private static final Random rand = Randomizer.getRandom();

    /**
     * Constructor for objects of class Animal
     */
    public Animal(boolean randomAge, Field field, Location location)
    {
        age = 0;
        alive = true;
        this.field = field;
        setLocation(location);
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(){
        age++;
    }
    public void setAge(int y){
        age = y;
    }
    
    public boolean isActive()
    {
        return alive;
    }
        
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    public Location getLocation()
    {
        return location;
    }
    
    public Field getField()
    {
        return field;
    }
    
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
    
    abstract public int getBreedingAge();
    
    abstract public int getMaxAge();
    
    abstract public double getBreedingProbability();
    
    abstract public int getMaxLitterSize();
    
    
    protected void incrementAge()
    {
        setAge();
        if(getAge() > getMaxAge()) {
            setDead();
        }
    }
    
    protected int breed()
    {
        int births = 0;
        if(canBreed() && rand.nextDouble() <= getBreedingProbability()) {
            births = rand.nextInt(getMaxLitterSize()) + 1;
        }
        return births;
    }
    
    protected boolean canBreed()
    {
        return age >= getBreedingAge();
    }
    
    protected void giveBirth(List<Actor> newActors)
    {
        // New animals are born into adjacent locations.
        // Get a list of adjacent free locations.
        List<Location> free = getField().getFreeAdjacentLocations(getLocation());
        int births = breed();
        for(int b = 0; b < births && free.size() > 0; b++) {
            Location loc = free.remove(0);
            if(this instanceof Fox){
                Animal young = new Fox(false, getField(), loc);
                newActors.add(young);}
            else if(this instanceof Rabbit){
                Animal young = new Rabbit(false, getField(), loc);
                newActors.add(young);}
            else if(this instanceof Hawk){
                Animal young = new Hawk(false, getField(), loc);
                newActors.add(young);}
        }
    }
}
