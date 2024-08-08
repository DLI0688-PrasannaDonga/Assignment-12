package DeleteFile;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile {
    public static void main(String[] args) {
        Path path= Paths.get("src/DeleteFile/delete.txt");
        try{
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("File created");

            }
            else{
                System.out.println("File arleady exists");
            }
            //file deleted
            Files.delete(path);
            System.out.println("File deleted");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
