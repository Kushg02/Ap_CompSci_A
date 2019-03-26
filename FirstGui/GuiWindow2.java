import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GuiWindow2
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("Second GUI Program"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // create a new panel inside a frame. 
        JPanel panel = new JPanel(); 
        panel.setBackground(Color.pink); 
        Container pane = theGui.getContentPane(); 
        pane.add(panel); 
        theGui.setVisible(true); 
    }
}