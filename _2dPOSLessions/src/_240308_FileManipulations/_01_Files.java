package _240308_FileManipulations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;

public class _01_Files {
    public static void main(String[] args) {
        // Some file magic at OS-side
        /*
        Use of class 'Files' is the primary entry class.
        The class 'Files' contains a huge API for files and directories.
        Please use the nio (new input output import)
         */
        String projectFolder = System.getProperty("user.dir");
        System.out.println("Path to Project: " + projectFolder);

        Path path = Paths.get(projectFolder);
        System.out.println("Folder Exists?: " + Files.exists(path));

        // new Path-Object with 'projectFolder'/res
        Path res = Paths.get(projectFolder, "res");
        System.out.println("res Folder Exists?: " + Files.exists(res));

        // create folder
        if(!Files.exists(res)){
            try {
                Files.createDirectory(res);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // delete folder
        /*
        try {
            Files.deleteIfExists(res);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
         */

        // create a file
        String fileName = "file_" + UUID.randomUUID().toString() + ".txt";
        System.out.println("FileName: " + fileName);
        Path file = Paths.get(res + "/" + fileName);
        System.out.println(file.toString());

        try {
            Files.createFile(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // delete file from filesystem
        //try {
        //    Files.delete(file);
        //} catch (IOException e) {
        //    throw new RuntimeException(e);
        //}

    }
}
