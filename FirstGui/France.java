import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class France
{
   // Page 47 of fundamentals of JAVA 
    public static void main(String[] args) {
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("French Flag"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel1 = new JPanel(); 
        panel1.setBackground(new Color(0,36,149)); 
        JPanel panel2 = new JPanel(); 
        panel2.setBackground(Color.white); 
        JPanel panel3 = new JPanel(); 
        panel3.setBackground(new Color(237,41,57)); 
        
        Container pane = theGui.getContentPane(); 
        pane.setLayout(new GridLayout(1,3)); 
        pane.add(panel1); 
        pane.add(panel2); 
        pane.add(panel3); 
        theGui.setVisible(true); 
    }
}