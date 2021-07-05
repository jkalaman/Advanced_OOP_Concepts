import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Bag<T> {
    ArrayList<T> objects;
    public Bag(){
        objects = new ArrayList<>();
    }
    public void add (T element)throws BagException {
        if (element == null) throw new BagException("Cannot add null to bag");
        objects.add(element);
    }
    /* TODO 
code the add method described. It should be public and not 
return anything. Just take in a parameter and  throw an 
exception. Read the documentation for this.*/

    public <T> T drawOne() throws BagException {

        Iterator it = objects.iterator();
        if(!it.hasNext()) throw new BagException("Bag is empty. Cannot draw anymore");
        Collections.shuffle(objects);
        T thing = (T) objects.remove(0);
        return thing;
    }
 /* TODO 
Code the drawOne method here. It should not take any
parameters. It should return a generic object. More on the
task description.*/

    public ArrayList<T> drawMany(int howMany) throws BagException {
        ArrayList<T> stuff = new ArrayList<>();
        while(howMany > 0){
            stuff.add(drawOne());
            howMany--;
        }
        return stuff;

    }

    public void add(T element,double prob) throws BagException{
        if(!(prob>= 0 && prob <=1)) throw new BagException("Probablity should be between 0 and 1");
        int tot = (int)Math.round(objects.size()*prob);
        for(int i=0;i<tot;i++){
            System.out.println("Adding "+i);
            objects.add(element);
        }
    }
}
