
/**
 * Write a description of class Birthnames here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.text.*;
import java.io.*; // for File
import java.util.*; // for Scanner
public class Birthnames
{
    public static void year(int year) throws FileNotFoundException{
       String maxFname  = "";
       int maxFnum = 0;
       String maxMname  = "";
       int maxMnum = 0;
       
       int totalFbaby = 0;
       int totalMbaby = 0;
       
       double percentF = 0.0;
       double percentM = 0.0;
       
       String fileName = "names/yob"+year+".txt";
       Scanner input = new Scanner(new File(fileName));
        while(input.hasNextLine()){
           String line = input.nextLine();
           List<String> list = Arrays.asList(line.split(","));
           
           if(list.get(1).equals("F")){
               if(Integer.parseInt(list.get(2)) > maxFnum){
                   maxFname = list.get(0);
                   maxFnum = Integer.parseInt(list.get(2));
               }
               totalFbaby += Integer.parseInt(list.get(2));
           } 
           else if(list.get(1).equals("M")){
               if(Integer.parseInt(list.get(2)) > maxMnum){
                   maxMname = list.get(0);
                   maxMnum = Integer.parseInt(list.get(2));
               }
               totalMbaby += Integer.parseInt(list.get(2));
           }
           else{
               System.out.print("DATA ERROR");
           }
       }
       //DecimalFormat df = new DecimalFormat("0.##");
       
       double Fpercent = (double)maxFnum / (double)totalFbaby;
       Fpercent = (double) Math.round(Fpercent * 10000) / 100.0;
       
       double Mpercent = (double)maxMnum / (double)totalMbaby;
       Mpercent = (double) Math.round(Mpercent * 10000) / 100.0;
       
       System.out.print(year + " " + maxFname + " Total " + maxFnum + " percent is " + Fpercent);
       System.out.print(" " + maxMname + " Total " + maxMnum  + " percent is " + Mpercent);
    }
    public static void main(String[] args) throws FileNotFoundException {
        for(int i = 1988; i<1993; i++){
            year(i);
            System.out.println();
        }
    }
}
