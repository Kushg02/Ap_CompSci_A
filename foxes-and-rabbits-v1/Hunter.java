import java.util.*;
public class Hunter implements Actor
{
      // The hunter's field.
    private Field field;
    // Whether the hunter is alive or not.
    private boolean alive;
    // The hunter's position in the field.
    private Location location;
    private static final Random rand = Randomizer.getRandom();
    
    /**
     * Create a hunter. 
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Hunter(Field field, Location newLocation)
    {
        this.field = field;
        setLocation(newLocation);
        alive = true;
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
    
    public void act(List<Actor> newActors)
    {
        if(isActive()) {   
            // Move towards a source of food if found.
            Location newLocation = findTarget();
            if(newLocation == null) { 
                // No food found - try to move to a free location.
                newLocation = getField().freeAdjacentLocation(getLocation());
            }
            // See if it was possible to move.
            if(newLocation != null) {
                setLocation(newLocation);
            }
            else {
                // Overcrowding.
                setDead();
            }
        }
    }
    
    private Location findTarget()
    {
        Location foxLocation = null; 
        List<Location> adjacent = getField().adjacentLocations(getLocation());
        Iterator<Location> it = adjacent.iterator();
        while(it.hasNext()) {
            Location where = it.next();
            Object animal = getField().getObjectAt(where);
            if(rand.nextBoolean() && animal instanceof Animal){
                Animal theAnimal = (Animal) animal;
                if(theAnimal instanceof Animal && theAnimal.isActive()) { 
                    if(theAnimal instanceof Hawk)
                        System.out.println("Animal Killed: " + theAnimal);
                    theAnimal.setDead();
                    foxLocation = where; 
                }
            }
        }
        return foxLocation;
    }
    
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }
}
