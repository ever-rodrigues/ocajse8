package praticalexam.expections;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionsC {
    public static void main(String[] args) {

        try{
            method();
        }catch (NullPointerException e){
            System.out.println("Exception");
        }
        try {
            method2();
        }catch (Exception f){
            System.out.println("FileNotFoundException");
        }
    }



    public static void method(){
        try{
            throw new NullPointerException();
        }finally {
            System.out.println("Finally without handling the Exception with CATCH BLOCK!!!");
        }
    }

    private static void method2() {
        try {
            throw new FileNotFoundException();
        }catch (FileNotFoundException f){
            System.out.println("File Not Found exception on method2 IN CATCH BLOCK");
        }
        finally {
            System.out.println("Finally of Method 2 FileNotFound Exception");
        }
    }

}
