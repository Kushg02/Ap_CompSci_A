import java.util.*;
/**
 * Write a description of class WedgeTailEagle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hawk extends Animal
{
// Characteristics shared by all hawkes (class variables).
    
    // The age at which a hawk can start to breed.
    private static final int BREEDING_AGE = 200;
    // The age to which a hawk can live.
    private static final int MAX_AGE = 1000;
    // The likelihood of a hawk breeding.
    private static final double BREEDING_PROBABILITY = 0.003;
    // The maximum number of births.
    private static final int MAX_LITTER_SIZE = 2;
    // The food value of a single fox. In effect, this is the
    // number of steps a hawk can go before it has to eat again.
    private static final int fox_FOOD_VALUE = 150;
    // A shared random number generator to control breeding.
    private static final Random rand = Randomizer.getRandom();
     
    // The hawk's food level, which is increased by eating foxs.
    private int foodLevel;

    /**
     * Create a hawk. A hawk can be created as a new born (age zero
     * and not hungry) or with a random age and food level.
     * 
     * @param randomAge If true, the hawk will have random age and hunger level.
     * @param field The field currently occupied.
     * @param location The location within the field.
     */
    public Hawk(boolean randomAge, Field field, Location location)
    {
        super(randomAge, field, location); 
        if(randomAge) {
            setAge(rand.nextInt(MAX_AGE));
            foodLevel = rand.nextInt(fox_FOOD_VALUE);
        }
        else {
            // leave age at 0
            foodLevel = rand.nextInt(fox_FOOD_VALUE);
        }
    }
    
    /**
     * This is what the hawk does most of the time: it hunts for
     * foxs. In the process, it might breed, die of hunger,
     * or die of old age.
     * @param field The field currently occupied.
     * @param newFoxes A list to return newly born hawkes.
     */
    public void act(List<Actor> newActors)
    {
        incrementAge();
        incrementHunger();
        if(isActive()) {
            giveBirth(newActors);            
            // Move towards a source of food if found.
            Location newLocation = findFood();
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
    
    /**
     * Make this hawk more hungry. This could result in the hawk's death.
     */
    private void incrementHunger()
    {
        foodLevel--;
        if(foodLevel <= 0) {
            setDead();
        }
    }
    
    /**
     * Look for foxs adjacent to the current location.
     * Only the first live fox is eaten.
     * @return Where food was found, or null if it wasn't.
     */
    private Location findFood()
    {
        Location foxLocation = null; 
        List<Location> adjacent = getField().adjacentLocations(getLocation());
        Iterator<Location> it = adjacent.iterator();
        while(it.hasNext()) {
            Location where = it.next();
            Object animal = getField().getObjectAt(where);
            if(animal instanceof Fox) {
                Fox fox = (Fox) animal;
                if(fox.isActive()) { 
                    fox.setDead();
                    foodLevel += fox_FOOD_VALUE;
                    foxLocation = where; 
                }
            }
        }
        return foxLocation;
    }

    public double getBreedingProbability(){
        return BREEDING_PROBABILITY;
    }
    
    public int getMaxLitterSize(){
        return MAX_LITTER_SIZE;
    }
    
    public int getBreedingAge(){
        return BREEDING_AGE;
    }
    
    public int getMaxAge(){
        return MAX_AGE;
    }
}
