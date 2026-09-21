package FileHandling;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderDemo {
    public static void main(String[] args) throws IOException{
        BufferedReader fr = new BufferedReader(
                new FileReader("note.txt"));
        String line = fr.readLine();
        while (line != null){
            System.out.println(line);
            line = fr.readLine();
        }
        fr.close();
    }
}
