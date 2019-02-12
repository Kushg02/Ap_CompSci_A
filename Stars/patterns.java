
public class patterns{
   
    public static void StarPyramid(){
        int max;
       for(int r=1; r<5; r++){
           max = 10-(2*r);
           
           if(r == 2){
              System.out.print(" ");
           }
           else if(r == 3){
              System.out.print("  ");
           }
           else if(r == 4){
              System.out.print("   "); 
           }
           
           for(int c=0; c<max; c++){                
               System.out.print("*");
           }
           
           System.out.print("\n");
       }
    }
    
    public static void StarBoom(){
       int max1, max2;
       for(int r=0; r<5; r++){
           max1 = r-1;
           max2 = 8-r;
           
           for(int s=0; s<max1; s++){
              System.out.print(" ");
           }
           
           for(int c=0; c<r; c++){                
               System.out.print("*");
           }
           System.out.print("\n");
       }
       
       for(int r=5; r<9; r++){
           max1 = 8-r;
           max2 = 9-r;
           
           for(int s=0; s<max1; s++){
              System.out.print(" ");
           }
           
           for(int c=0; c<max2; c++){                
               System.out.print("*");
           }
           System.out.print("\n");
       }
    }
    
    public static void main(String args[]){
        StarPyramid();
        StarBoom();
    }
}