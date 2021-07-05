import java.util.ArrayList;

public class Task {
    public static void main(String[] args){
        Deck d = new Deck();
        // Draw some random cards:
        System.out.println(d.dealCard());
        System.out.println(d.dealCard());

        ArrayList<Card> hand = new ArrayList<>();
        hand.add(d.dealCard());
        hand.add(d.dealCard());
        hand.add(d.dealCard());

        System.out.println("Hand is:"+hand);
        System.out.println("Cards add:"+addCards(hand));


        for(Card tmp : d)
            System.out.println(tmp);

    }

    public static int addCards(ArrayList<Card> hand){
        int sum = 0;
        for(Card tmp: hand) {
            if (!(isNumeric(tmp.getValue().toString()))) {
                if (tmp.getValue().toString().equals("Ace"))
                    sum += 1;
                else if (tmp.getValue().toString().equals("Jack"))
                    sum += 11;
                else if (tmp.getValue().toString().equals("Queen"))
                    sum += 12;
                else if (tmp.getValue().toString().equals("King"))
                    sum += 13;
            } else
                sum += Integer.parseInt(tmp.getValue().toString());
        }
        return sum;
 /* TODO 
This should compute the sum of values of the cards in an ArrayList of cards.*/
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    } // end isNumeric

}