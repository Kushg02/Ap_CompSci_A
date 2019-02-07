import java.util.ArrayList; 
/**
 * Used to test the action class in Chapter 4 
 *
 * @author (Lewin)
 * @version (1.0)
 */
public class AuctionTest
{
 public static void main(String[] args)
   { 
       Auction  testauction = new Auction(); 
       // add lots 
       testauction.enterLot("Bike"); 
       testauction.enterLot("Painting"); 
       testauction.enterLot("Gold Ring"); 
       testauction.enterLot("Guitar"); 
       // verify that the losts were added 
       System.out.println("***********");
       System.out.println("* Should show 4 lots  Bike, Painting, Gold Ring and Guitar"); 
       System.out.println("***********");
       testauction.showLots();
       
       // Create people to buy lots. 
       Person person1 = new Person("John Smith");
       Person person2 = new Person("Bill Voll"); 
       //testing 4.52  
       testauction.removeLot(2); 
       
       System.out.println("***********");
       System.out.println("* Should show 3 Bids with last one saying it already has a bid"); 
       System.out.println("***********");
       testauction.makeABid(1,person1, 30); 
       testauction.makeABid(1,person2, 50); 
       testauction.makeABid(4,person1, 300); 
       testauction.makeABid(4,person2, 200); 
       System.out.println("***********");
       System.out.println("* Bike with a bid of 50, No bid on Gold Ring, "); 
       System.out.println("* Guitar bid of 300 "); 
       System.out.println("***********");
       testauction.showLots();
       
        // test 4.49
        System.out.println("***********");
        System.out.println("*Unsold Losts ");
         System.out.println("*Should only be the gold ring ");
        System.out.println("***********");
       ArrayList<Lot> leftLots = testauction.getUnsold();
       for (Lot lot : leftLots) { 
           System.out.println(lot); 
        }
        // testing 4.48
       System.out.println("***********");
       System.out.println("*Lot Close, should see something like ");
       System.out.println("*Lot: 1 highest bid is 50 Bidder is Bill Voll ");
       System.out.println("*Lot:3 has no bidders ");
       System.out.println("*Lot: 4 highest bid is 300 Bidder is John Smith ");
        System.out.println("***********");
       testauction.close(); 
       
       
       
  }
}