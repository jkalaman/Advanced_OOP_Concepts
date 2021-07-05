import java.util.Iterator;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Deck implements Iterable<Card>{
    private List<Card> deck;
    private String[] suits = {"Hearts","Clubs","Diamonds","Spades"};
    public Deck() {
        deck = new ArrayList<>();

        for (int i = 0; i < suits.length; i++)
        {
            Card tmp = new Card("Ace", suits[i]);
            deck.add(tmp);
            for (int j = 2; j < 11; j++)
            {
                tmp = new Card(j,suits[i]);
                deck.add(tmp);
            }
            String[] faces = {"Jack", "Queen", "King"};
            for(int k = 0; k < faces.length; k++){
                tmp = new Card(faces[k], suits[i]);
                deck.add(tmp);
            }
            Collections.shuffle(deck);
/* TODO 
This constructor initializes the deck variable with
all the cards of a deck, except a joker.
The suits array may help you.*/        }
    }

    public Card dealCard(){
        Card tmp = (Card) deck.remove(0);
        return tmp;
/* TODO
Code this. It is almost EXACTLY as the  method to draw one object
from the bag in the previous task. The difference is that this method
REMOVES the card from the deck */
    }

    public int size(){return deck.size();}
    @Override
    public Iterator<Card> iterator() {
        Iterator<Card> it = deck.iterator();
        return it;
       /* TODO 
Return a new DeckIterator with this instance in the constructor.*/
    }
}
