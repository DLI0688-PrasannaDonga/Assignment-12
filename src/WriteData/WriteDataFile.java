package WriteData;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class WriteDataFile {
    public static void main(String[] args) {
        Path path= Paths.get("src/WriteData/text1.txt");
        List<String> data= Arrays.asList("He hello every one here","dvhf");
        try{
            Files.write(path,data, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
            System.out.println("Done!");

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
