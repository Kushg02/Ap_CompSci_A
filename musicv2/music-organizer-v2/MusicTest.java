/**
 * Write a description of class MusicTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MusicTest
{
    // instance variables - replace the example below with your own
  public static void main(String[] args)
  {
    // add
    MusicOrganizer music = new MusicOrganizer(); 
    music.addFile("..\\audio\\BlindLemonJefferson-OneDimeBlues.mp3");  
    music.addFile("..\\audio\\BigBillBroonzy-BabyPleaseDontGo1.mp3");
    music.addFile("..\\audio\\BlindBlake-EarlyMorningBlues.mp3");
    music.addFile("..\\audio\\BlindLemonJefferson-matchBoxBlues.mp3");
    music.addFile("..\\audio\\sicko-mode.mp3");
    
    //music.listAllFiles(); 
    //music.listMatching("test"); // should print out a file name or No file found
    music.playArtist("BlindLemonJefferson");
    System.out.println("^^^BlindLemonJeff Songs");
    music.shuffle();
    System.out.println("^^^Shuffled Songs");
    music.random();
    System.out.println("\n" + "^^^  Random Song");
   }
}