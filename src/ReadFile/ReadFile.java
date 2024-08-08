package ReadFile;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadFile {
    public static void main(String[] args) {
        Path path= Paths.get("src/ReadFile/text.txt");
        try(Stream<String> l= Files.lines(path)){
            l.forEach(System.out::println);


        }catch (Exception e){
            System.out.println(e);
        }

    }
}