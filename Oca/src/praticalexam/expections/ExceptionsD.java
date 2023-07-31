package praticalexam.expections;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsD {
    public static void main(String[] args) {
        try {
           throw method1();
        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File Not Found Exception");
        }catch (IOException ioException){
            System.out.println("IO Exception");
        }
    }

    private static IOException method1() {
        return new IOException();
    }
}
