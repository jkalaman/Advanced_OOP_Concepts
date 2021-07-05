import java.util.Iterator;

public class DeckIterator<E> implements Iterator<E> {
    Deck d;
    public DeckIterator(Deck d){
        this.d = d;
/* TODO
initialize the variable d */
    }

    @Override
    public boolean hasNext() {
        boolean next = false;
        if(d.size() > 0)
            next = true;
        return next;

       /* TODO
Return true if there are elements left in the Deck */
    }

    @Override
    public E next() {
        return (E) d.dealCard();
        /* TODO
Deal a card and return it. */
    }
}
