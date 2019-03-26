import java.util.*;
public interface Actor
{
    abstract public void act(List<Actor> newActors);
    abstract public boolean isActive();
}
