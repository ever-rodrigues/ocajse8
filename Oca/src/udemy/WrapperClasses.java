package udemy;

import java.sql.SQLOutput;

public class WrapperClasses {

    //each primitive has a WRAPPER CLASS
    //Most commom way to create an object from the primitive is using:

    //use static method valueOF();

    public static void main(String[] args) {
        int a=10;                                                  
        Integer test;                                              
        System.out.println(test= Integer.valueOf(a));              
        System.out.println(test);                                  
            WrapperClasses wrapperClasses=new WrapperClasses();    

    }

    Integer b=Integer.valueOf(100);
    {
        System.out.println("A"+ b);
    }


    //valueOf() can be used to convert a String into a Wrapper class

    Integer number = Integer.valueOf("12");

    //Wrapper classes come with some useful methods e.g

    int intNumber= Integer.parseInt("12");
}
