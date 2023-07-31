package udemy;
import java.util.*;

public class MainMethod {

    public static void main(String[] args) {


        //Public access modifier
        //static because this method belongs to the class not the instance of class
        //void because is without return type
        //main because is the name
        //input parameters ( array of Strings)


        //You can also declare a string of args...
//        public static void main(String args...){

        //You can also use:
//        static public void main(String args[]){
//
//        }

        Random myRandom= new Random();
        System.out.println(myRandom.nextInt(100));



        //Explicit import
        //import java.util.Random;

        //Implicit import
        //import java.util.*;
        //With this import the bub-folders will not be imported , carefully!!!!!


        //YOU can use a fully qualified name of the class
        java.util.Random myRandom1= new java.util.Random();
        System.out.println( myRandom1.nextInt(30));
    }


    //THIS DOSENT EXIST!!!
    //import java.util.*.*;
    //NOT WILL COMPILE



    //CONFLICTS , If you have same name of Class , dosent metter the package into the same file , the code will not compile
    //EXAMPLE::::

    //import java.util.Date;
    //import java.sql.Date;
    //DOES NOT COMPILE!!! SAME NAME IMPORTING, THE COMPILER DOSENT KNOW THE CLASS YOU WHANT TO USE INTO YOUR CODE!!!!


    //PACKAGE
    //The package must be in the first line!!!


}
