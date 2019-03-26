import java.util.*;

/**
 * The Deck class represents a shuffled deck of cards.
 * It provides several operations including
 *      initialize, shuffle, deal, and check if empty.
 */
public class Deck {

    /**
     * cards contains all the cards in the deck.
     */
    private List<Card> cards;

    /**
     * size is the number of not-yet-dealt cards.
     * Cards are dealt from the top (highest index) down.
     * The next card to be dealt is at size - 1.
     */
    private int size;


    /**
     * Creates a new <code>Deck</code> instance.<BR>
     * It pairs each element of ranks with each element of suits,
     * and produces one of the corresponding card.
     * @param ranks is an array containing all of the card ranks.
     * @param suits is an array containing all of the card suits.
     * @param values is an array containing all of the card point values.
     */
    public Deck(String[] ranks, String[] suits, int[] values) {
        cards = new ArrayList<Card>();
        for (int j = 0; j < ranks.length; j++) {
            for (String suitString : suits) {
                cards.add(new Card(ranks[j], suitString, values[j]));
            }
        }
        size = cards.size();
        shuffle();
    }

   public static void perfectShuffle(int[] values) {
        int shuffled[] = new int[values.length];
        int halfStack = ((values.length) + 1) / (2);
        int[] half1 = new int[halfStack];
        int[] half2 = new int[((values.length) / 2)];
        
        int currPos = 0; 
        int k = 0;
        for (k = 0; k<halfStack ;k++){
            shuffled[currPos] = values[k];
            currPos += 2;
        }
        currPos = 1;
        for (; k < values.length; k++){
            shuffled[currPos] = values[k];
            currPos += 2;
        }       
        
        for ( k=0; k<values.length; k++){
          values[k] = shuffled[k];
        }
        
    }

    public static void selectionShuffle(int[] values) {
        Random random = new Random(); 
        for(int j = values.length-1; j>0; j--){
            int x = (int)(Math.random() * (1+j));
            //set the random value from 0 to the value of j to determine the position
            int curr = values[x]; 
            //saves current value of x
            values[x] = values[j];
            values[j] = curr; 
        }
    }
    /**
     * Determines if this deck is empty (no undealt cards).
     * @return true if this deck is empty, false otherwise.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Accesses the number of undealt cards in this deck.
     * @return the number of undealt cards in this deck.
     */
    public int size() {
        return size;
    }

    /**
     * Randomly permute the given collection of cards
     * and reset the size to represent the entire deck.
     */
    public void shuffle() {
        for( int k = size - 1; k >= 0; k-- ) {
                int j = (int)(Math.random() * k);
                Card curr = cards.get(j);
                cards.set(j, cards.get(k));
                cards.set(k, curr);
        }
    }

    /**
     * Deals a card from this deck.
     * @return the card just dealt, or null if all the cards have been
     *         previously dealt.
     */
    public Card deal() {
        if (isEmpty()) {
            return null;
        }
        size--;
        Card c = cards.get(size);
        return c;
    }

    /**
     * Generates and returns a string representation of this deck.
     * @return a string representation of this deck.
     */
    @Override
    public String toString() {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--) {
            rtn = rtn + cards.get(k);
            if (k != 0) {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.size() - 1; k >= size; k--) {
            rtn = rtn + cards.get(k);
            if (k != size) {
                rtn = rtn + ", ";
            }
            if ((k - cards.size()) % 2 == 0) {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
