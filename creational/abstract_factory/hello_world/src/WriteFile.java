import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile implements Write{
    @Override
    public void exec() {
        BufferedWriter out = null;
        try {
            var fstream = new FileWriter("output.txt", true);
            out = new BufferedWriter(fstream);
            out.write("Hello World!");
            out.close();
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
