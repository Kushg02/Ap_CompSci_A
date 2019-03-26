
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String args[])
    {
        NewsFeed feed = new NewsFeed();
        
        MessagePost one = new MessagePost("Bill Maher", "Show starts at 9am");
        EventPost two = new EventPost("Ms. Emmington", "Mista Vista", "Black Box Theater");
        PhotoPost three = new PhotoPost("Coen Brothers", "KBPoster.jpg", "Kill Bill IV");
        feed.addPost(one);
        feed.addPost(two);
        feed.addPost(three);
        one.like();
        three.addComment("nice");
        feed.show();
    }
}
