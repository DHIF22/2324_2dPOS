package _240405_ExceptionFinal_LinkedList;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _01_ExceptionFinal {
    public static void main(String[] args) {
        // read a file line by line
        Path path = Paths.get(System.getProperty("user.dir"), "res", "co2.csv");
        File file = new File(path.toString());
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) { // Filereader
            System.out.println("FILE NOT FOUND");
            System.out.println(e.getMessage());
            //throw new RuntimeException(e);
        } catch (IOException ioEx){ // bufferedReader.readLine()
            System.out.println(ioEx.getMessage());
        } finally {
            System.out.println("This will be reached every time!");
        }
    }
}
