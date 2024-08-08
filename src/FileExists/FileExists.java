package FileExists;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExists {

    public static boolean check(Path path){
        if(Files.exists(path)){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Path path = Paths.get("src/FileExists/file.txt");
        boolean checks=check(path);
        System.out.println(checks);

    }
}
