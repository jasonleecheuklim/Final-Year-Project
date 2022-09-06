package Q3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Cal2 extends Cal {
    private PrintWriter out;
    public Cal2() {
        try {
            FileWriter outputFile = new FileWriter("log.txt");
            out = new PrintWriter(outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void log(String message) {
        // Write text to file
        out.println(message);
        // write the text from buffer to the file
        out.flush();
        // close the file after use
        // out.close();
    }
}