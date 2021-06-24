import java.io.*;
import java.util.Arrays;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris.data");

        String[] tmp = d.getColNames();
        System.out.println(Arrays.toString(tmp));
        System.out.println(d.getNumRows());
    }

    public Database readCSV(String filename) {
        String contents = "";
        try (InputStream in = new BufferedInputStream(new FileInputStream(filename))){
            byte[] buffer = new byte[1024];
            int lengthRead = in.read();
            while(lengthRead != -1) {
                contents += (char) lengthRead;
                lengthRead = in.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        return new Database(contents);
    }
}
