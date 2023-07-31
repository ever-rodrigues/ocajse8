package praticalexam.expections;

import java.io.IOException;

public class ExceptionsA {

    public static void main(String[] args) {
        try {
            method();
        }finally {
            System.out.println("Exception from Number format Exception");
        }


    }
    public static IOException method(){
        try {
            return new IOException();
        }
        finally {
            System.out.println("Exception on Method ()");
        }
        }
}

