package _240308_FileManipulations;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class _03_ReadFilesLarge {
    public static void main(String[] args) {
        String fileName = "co2.csv";
        Path file = Paths.get(System.getProperty("user.dir"), "res", fileName);

        boolean isFirstLine = true;
        if(Files.exists(file)){
            try {
                BufferedReader bufferedReader = Files.newBufferedReader(file);
                String line = "";
                while( (line = bufferedReader.readLine()) != null){
                    if(isFirstLine) {
                        System.out.println(line);
                        isFirstLine = false;
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
