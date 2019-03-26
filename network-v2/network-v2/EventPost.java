import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed. 
 * The main part of the post consists of a (possibly multi-line)
 * text message. Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.2
 */
public class EventPost extends Post
{
    private String eventType;  // an arbitrarily long, multi-line message
    private String location;
    public EventPost(String author, String event, String location)
    {
        super(author);
        eventType = event;
        this.location = location;
    }
    public void printShortSummary(){
        System.out.println("Event post from " + getUserName());
    }
    public void display()
    {
        super.display();
        System.out.println("Event : " + eventType);
        System.out.println("Location : " + location);
    }
    /**
     * Return the text of this post.
     * 
     * @return The post's message text.
     */
    public String getEvent()
    {
        return eventType;
    }
    public String getLocation()
    {
        return location;
    }
}
