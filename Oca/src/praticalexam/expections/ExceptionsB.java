package praticalexam.expections;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionsB {

    public static void main(String[] args) {

        try {
            method3();
        }catch (FileNotFoundException fne){
            System.out.println("File Not Found Exception");
        }catch (IOException ioe){
            System.out.printf("IO Exception");
        }catch (Exception e){
            System.out.println("Exception");
        }finally {
            System.out.println("Finally Always Run!!!");
        }
    }

    public static Exception method()throws Exception {
        throw new Exception();
    }

    public static IOException method2()throws IOException {
        throw new IOException();
    }

    public static FileNotFoundException method3()throws FileNotFoundException {
        throw new FileNotFoundException();
    }
}
