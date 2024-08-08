package CopyFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyAFile {
    public static void main(String[] args) {
        Path target= Paths.get("src/CopyFile/copy.txt");
        Path source=Paths.get("src/CopyFile/text2.txt");
        try {
            if (!Files.exists(target)){
                Files.createFile(target);
                System.out.println("File created");
            }else{
                System.out.println("File is already created");
            }

            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        }catch(Exception e){
            e.printStackTrace();

        }
    }
}
