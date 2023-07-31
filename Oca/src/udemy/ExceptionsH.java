package udemy;

import java.io.*;

public class ExceptionsH {
    public void readFile(File filename){
        try {
            FileInputStream file = new FileInputStream(filename);
            byte x = (byte) file.read();
            System.out.println(x);
        }catch (IOException io){
            System.out.println(io.getMessage());
        }
    }

    public void printFourthElement(int[] myArray){
        try {
            System.out.println(myArray[3]);
        }catch (IndexOutOfBoundsException id){
            System.out.println("There is no " + id.getMessage() +" element in this Array");
        }
    }

    public void printValue(int value){
        try{
            if(value>100){
                throw new MyExcepetion();
            }
        }catch (MyExcepetion e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
       ExceptionsH a= new ExceptionsH();
       a.printValue(10);
       int[] myArray = new int[0];
        System.out.println(myArray.length);

    }


}

