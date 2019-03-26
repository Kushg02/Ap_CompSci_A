import javax.swing.*; 
import java.awt.*; 
/**
 * Write a description of class GuiWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Benin
{
   // Page 47 of fundamentals of JAVA 
   
   public static JPanel njPanel(Color color){
      JPanel p = new JPanel();  
      p.setBackground(color);
      return p;
   }
    public static void main(String[] args) {
        JFrame  theGui = new JFrame(); 
        theGui.setTitle("Benin Flag"); 
        theGui.setSize(300,200); 
        theGui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        
        Container pane = theGui.getContentPane(); 
        pane.setLayout(new GridLayout(2,10)); 
        pane.add(njPanel(new Color(0,135,81))); 
        pane.add(njPanel(new Color(0,135,81)));  
        pane.add(njPanel(new Color(252,209,21))); 
        pane.add(njPanel(new Color(252,209,21)));  
        pane.add(njPanel(new Color(252,209,21))); 
        pane.add(njPanel(new Color(0,135,81))); 
        pane.add(njPanel(new Color(0,135,81)));  
        pane.add(njPanel(new Color(232,16,46))); 
        pane.add(njPanel(new Color(232,16,46)));  
        pane.add(njPanel(new Color(232,16,46))); 
        theGui.setVisible(true); 
    }
}