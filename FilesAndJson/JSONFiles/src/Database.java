import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import java.math.*;

public class Database {
    private JsonObject db;
    /* TODO 
Declare a member variable that can 
be EASILY set from the constructor. */

    public Database(JsonObject data){
        this.db = data;
        /* TODO 
set the memebr variable declared above.*/
    }

    public JsonObject getRestaurant(String name){
        JsonArray rest = (JsonArray) this.db.get("restaurants");
        int id = 0;
        for(int i=0; i < rest.toArray().length; i++){
            JsonObject test = (JsonObject) rest.get(i);
            if(test.get("name").equals(name))
                id = i;
        }

        JsonObject restStuff = (JsonObject) rest.get(id);
        return restStuff;
    }

    public double getAvgReviews(String name){
        JsonObject rest = getRestaurant(name);
        JsonArray reviews = (JsonArray) rest.get("reviews");
        double rating = 0;
        for(int i=0; i < reviews.toArray().length; i++){
            JsonObject test = (JsonObject) reviews.get(i);
            BigDecimal  tmp = (BigDecimal) test.get("rating");
            rating += tmp.doubleValue();
        }
        return rating/reviews.size();
    }
}
