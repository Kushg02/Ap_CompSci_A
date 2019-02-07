import java.util.ArrayList;
import java.util.Random;
/**
 * A class to hold details of audio files.
 * This version can play the files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    public void listMatching(String searchString){
        boolean empty = true;
        for(String filename : files) {
            if(filename.contains(searchString)){
                //A match.
                empty = false;
                System.out.println(filename);
        }
        if(empty == true)
            System.out.println("No File names matched the search string!");
        else
            System.out.println("All Results");
        }
    }
    public void playArtist(String searchString){
        boolean empty = true;
        for(String filename : files) {
            if(filename.contains(searchString)){
                empty = false;
                player.playSample(filename);
                System.out.println("Playing Artist " + filename);
        }
        if(empty == true)
            System.out.println("No Artist matched the search string!");
        }
    }
    /*public void listAllFiles(){
        for(String filename : files){
            System.out.println(filename);
        }
    } */
    public void listAllFiles(){
        int index = 0;
        while(index < files.size()){
            String filename = files.get(index);
            System.out.println(filename);
            index++;
        }
    }
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        String filename = files.get(index);
        player.startPlaying(filename);
    }
    
    public void playShort(int index){
        String filename = "";
        if(index >= 0 && index < files.size()) {
            filename = files.get(index);
        }
       player.playSample(filename);
    }
    public void shuffle(){
        ArrayList<Integer> playedIndex = new ArrayList<>();
        Random random = new Random();
        int r = random.nextInt(files.size());
        for (int i = 0; i < files.size(); i++) {
        while(playedIndex.contains(r)){
             r = random.nextInt(files.size());
        }
        player.playSample(files.get(r));
        System.out.print(files.get(r));
        playedIndex.add(r);
        }
        System.out.println();
    }
    public void random(){
        Random random = new Random();
        int r = random.nextInt(files.size());
        player.playSample(files.get(r));
        System.out.println();
        System.out.print(files.get(r));
    }
        /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
}
