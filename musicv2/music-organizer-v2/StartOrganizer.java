
/**
 * StartOrganizer allows you to build calls to the
 *  Music Organiizer 
 * @author Lewin
 * @version 1.0 
 */
public class StartOrganizer
{
   
    public static void main(String args[])
    {
      MusicOrganizer  myMusic = new MusicOrganizer(); 
      String firstSong = "../audio/easy.mp3";
      myMusic.addFile(firstSong);
      myMusic.startPlaying(0);
    }

}
