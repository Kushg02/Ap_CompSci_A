// Example 15.2

// File: SleepyThread.java

public class SleepyThread extends Thread{
    
   private int sleepInterval;

   public SleepyThread(int number, int sleepMax){
      super ("Thread " + number);      
      sleepInterval = (int) (Math.random() * sleepMax);
   }
   
   public void run(){
   	  // The thread identifies itself
      System.out.println(getName() + " sleep interval: " + sleepInterval);
                   
      // The thread sleeps
      try{
         sleep(sleepInterval);   // In Milliseconds                         
      }catch(InterruptedException e){
         System.out.println(e.toString());
      }
      
      // The thread wakes up
      System.out.println(getName() + " waking up");        
   } 
}