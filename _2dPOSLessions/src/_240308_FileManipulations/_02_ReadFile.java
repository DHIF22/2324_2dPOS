package _240308_FileManipulations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class _02_ReadFile {
    public static void main(String[] args) {
        String fileName = "demo.sc";

        Path file = Paths.get(
                System.getProperty("user.dir"),
                "res",
                fileName);

        System.out.println(file);

        try {
            // this works for small files
            List<String> lines = Files.readAllLines(file);
            for(String line : lines){
                System.out.println(line);
            }
            System.out.println(lines.get(1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
