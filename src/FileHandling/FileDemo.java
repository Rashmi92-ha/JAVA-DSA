package FileHandling;
import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) throws IOException{
        File f = new File("data.txt");
        f.createNewFile();
        System.out.println("File exits: " + f.exists());
        System.out.println("File Name: " + f.getName());
        System.out.println("File Size: " + f.length());
    }
}
