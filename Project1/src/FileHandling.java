import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {


    public static void createAndWriting(String fileName, String Content) throws IOException {
        File file = new File("C://Users//Aliasghar//Documents//Simplilearn//Java//Final Project//Creating_Files//" + fileName + ".txt");

        if (file.createNewFile()) {
            System.out.println("File is created!");
        } else {
            System.out.println("File already exist!");
        }

        FileWriter writer = new FileWriter(file);
        writer.write(Content);
        writer.close();
    }

    public static void deleteFile(String fileName) throws IOException {
        File file = new File("C://Users//Aliasghar//Documents//Simplilearn//Java//Final Project//Creating_Files//" + fileName + ".txt");

        if (file.delete()) {
            System.out.println("File is deleted!");
        } else {
            System.out.println("Failed to delete!");
        }

    }
}