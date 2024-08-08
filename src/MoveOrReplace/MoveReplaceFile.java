package MoveOrReplace;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveReplaceFile {
    public static void main(String[] args) {
        Path path1 = Paths.get("src/CopyFile/text2.txt");
        Path path2 = Paths.get("src/MoveOrReplace/target.txt");
        try {
            if (!Files.exists(path2)) {
                Files.createFile(path2);
                System.out.println("File created successfully");

            }else{
                System.out.println("File already exists");
            }
            Files.move(path1,path2, StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
