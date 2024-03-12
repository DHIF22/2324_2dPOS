package _240312_DateTime;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _02_WriteFile {
    public static void main(String[] args) {
        String fileName = "output.md";

        Path path = Paths.get(System.getProperty("user.dir"), "res", fileName);

        String message = "Super song - Friday Im In Love";
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path.toString()));
            bufferedWriter.write(message);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
