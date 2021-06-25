import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class OnlineRecipeDatabase {

    String baseUrl = "http://www.recipepuppy.com/api/?";

    public JsonObject getRecipesByIngredients(String ingredients) throws Exception
    {
        String var = "";
        try {
            URL url = new URL(baseUrl + "i=" + ingredients);
            Scanner urlScanner = new Scanner(url.openStream());
            while(urlScanner.hasNextLine()) {
                var += urlScanner.nextLine();
            }
            urlScanner.close();
            }catch(MalformedURLException e) {
                System.out.println("oops " + e.getMessage()) ;
            }catch(IOException e) {
            System.out.println("Could not read webpage " + e.toString());
        }
        JsonObject content = (JsonObject) Jsoner.deserialize(var,new JsonObject());
        return content;
    }
/* TODO 
You have to use the url to retrieve the contents of the website. 
This will be a String, but in JSON format. */



    public JsonObject getRecipesByDish(String dish) throws Exception {
        //Getting the things ready to connect to the web
        String var = "";
        try {
            URL url = new URL(baseUrl + "q=" + dish);
            Scanner urlScanner = new Scanner(url.openStream());
            while (urlScanner.hasNextLine()) {
                var += urlScanner.nextLine();
            }
            urlScanner.close();
        } catch (MalformedURLException e) {
            System.out.println("oops " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Could not read webpage " + e.toString());
        }
        JsonObject content = (JsonObject) Jsoner.deserialize(var,new JsonObject());
        return content;
    }



    public String formatRecipeAsString(JsonObject doc){


        /* TODO
This should return a String with each recipe in three lines:
Title:the title of the recipe
Link:the link to the recipe
Ingredients:The ingredients of teh recipe.*/

        String results = "";
        JsonArray recp = (JsonArray) doc.get("results");
        for(int i =0; i <recp.toArray().length; i++){
            results += "title:" + recp(i).get("title") +"\n" +
                    "link:" + recp(i).get("href") + "\n" +
                    "ingredients:" + recp(i).get("ingredients") +"\n";
        }
        return results;
    }

    public void saveRecipes(String text, String outfile){

        /* TODO
Given a String with some text in it, write that text to a file.
The name of the file is given in outfile */
        try (FileOutputStream fos = new FileOutputStream(outfile)){
            fos.write(text.getBytes());
        }catch(FileNotFoundException fnf){
            System.out.println("No file");
        }catch(IOException e){
            e.printStackTrace();
        }
    }

}
