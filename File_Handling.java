import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class File_Handling {
    public static void main(String[] args) {
        // Creating a new file
        /*
        File myfile = new File("File_Handling.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }
        */

        // Write to a file
        /*
        try {
            FileWriter fileWriter = new FileWriter("File_Handling.txt");
            fileWriter.write("This is our first file\nOkay now bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        // Reading a file
        /*
        File myFile = new File("File_Handling.txt");
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
         */

        // Deleting a file
        File myFile = new File("File_Handling.txt");
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }

    }
}
