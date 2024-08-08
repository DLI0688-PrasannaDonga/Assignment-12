package ReadFileToString;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFileToString {
    public static void main(String[] args) {
        Path path= Paths.get("src/ReadFileToString/stringfile.txt");
        try{
            if(!Files.exists(path)){
                Files.createFile(path);
                System.out.println("File created");
            }else{

                System.out.println("File exists already");
            }
            String str=Files.readString(path);
            System.out.println(str);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
