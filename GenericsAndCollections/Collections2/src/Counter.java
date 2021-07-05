import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Collections;

public class Counter<E> {
    private HashMap<E,Integer> counts = new HashMap<>();

    public Counter(E[] things){
        for(E tmp : things)  {
            if(counts.containsKey(tmp)) {
                counts.put(tmp, counts.get(tmp) + 1);
            }
            else {
                counts.put(tmp,1);
            }
        }
/* TODO
Loop through the elements of "things" and use the HashMap "counts"
to store the elements of things as keys, and the number of times they
appear in the array as values. Check the instructions. */ }


    public Integer getCount(E element) {
        return (Integer) counts.get(element);
    }



    public int getSize(){
        return this.counts.size();
    }

    public E mostFrequent() {
        Map.Entry<E, Integer> maxEntry = null;
        for (Map.Entry<E, Integer> entry : counts.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue())
                maxEntry = entry;
        }
        return maxEntry.getKey();
    }

}
