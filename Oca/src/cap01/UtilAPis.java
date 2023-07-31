package cap01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;

public class UtilAPis {

    public static void main(String[] args) {
        String testing = "Testing String tokenizer";

        StringTokenizer tk = new StringTokenizer(testing);
        int contTokens = tk.countTokens();
        System.out.println(contTokens);
//PART OF PATH
        try{
            Files.walk(Paths.get("/home/ever-rodrigues/Projects/ocajse8/Oca"))
                    .forEach(f->{
                        if(f.getFileName().toString().endsWith(".txt")){
                            System.out.println(f.getFileName());
                        }
                    });
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
