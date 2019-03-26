import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GuiWindow3
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("Second GUI Program"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel eastPanel = new JPanel(); 
        eastPanel.setBackground(Color.red); 
         JPanel westPanel = new JPanel(); 
        westPanel.setBackground(Color.red);
         JPanel northPanel = new JPanel(); 
        northPanel.setBackground(Color.blue);
         JPanel southPanel = new JPanel(); 
        southPanel.setBackground(Color.blue);
         JPanel centralPanel = new JPanel(); // defaults to White 
        // add to the panels and arrange them we create a pane object 
        // whihc will manage the frame. Up to five panel's per pane. 
        // Organized as North, east, south, west and central. 
        // using the layout manager. 
        Container pane = theGui.getContentPane(); 
        pane.add(northPanel,BorderLayout.NORTH); 
        pane.add(southPanel,BorderLayout.SOUTH); 
        pane.add(eastPanel,BorderLayout.EAST); 
        pane.add(westPanel,BorderLayout.WEST); 
        pane.add(centralPanel,BorderLayout.CENTER); 
        theGui.setVisible(true); 
    }
}