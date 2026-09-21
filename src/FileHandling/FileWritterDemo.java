package FileHandling;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritterDemo {
    public static void main(String[] args) throws IOException{
        FileWriter fw = new FileWriter("note.txt");
        fw.write("Hello, Java.\n");
        fw.write("I am learning file handling.\n");
        fw.write("Today is Day 10 of my learning.");
        fw.close();

        System.out.println("Data written Successfully");
    }
}
