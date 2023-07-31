package praticalexam.Exams;

import com.sun.org.apache.xpath.internal.objects.XNumber;
import com.sun.xml.internal.bind.v2.TODO;

public class FirstExamPractice {


    private String name;
    private boolean pass;
    //Becarefull with one line statements..
    //ERROR 1
    // TODO: 27/07/2023
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
            System.out.println(i);
//        System.out.println("Value of i"+i);  ERRO! I ITs outside the FOR!!!!!!!!!!!!



        //ERROR 2
        // TODO: 27/07/2023
        try {
            Double number = Double.valueOf("120D");
        }catch (NumberFormatException e){
            System.out.println(e);
        }
//        System.out.println(number); ERROR!!! number its outside Try block!!!!!!!!!

        // TODO: 27/07/2023
        //ONLY CB-SIS-E CAN USED:
        // Character - Byte - Short - Integer - String - ENUM
        String s="A";

        switch (s){
            case "B":
                System.out.println("B");
            default:
                System.out.println("Default");
            case "A":
                System.out.println("A");
        }



        //// TODO: 27/07/2023
        //Only Interfaces can have Default methods

        // TODO: 27/07/2023
        //Interface only implements default methods!!!


        // TODO: 27/07/2023
        //PAY ATTENTION , String when you dont pass a value, but contruct the object the default value is null
        //and for boolean is false!!!
        FirstExamPractice first=new FirstExamPractice();
        System.out.println(first.name);//null
        System.out.println(first.pass);//false
        
        
        // TODO: 27/07/2023
        Integer nI= Integer.valueOf("12.3");
        System.out.println(nI);//NUMBER FORMAT EXCEPTIONS
        //YOU NEED TO PASS A STRING WITH CORRECT FORMAT!!!


        // TODO: 27/07/2023
        //A constructor do not have a return type!!!!
        //If has that will be a METHOD!! Not Constructor!!!!!!!!!

        // TODO: 27/07/2023
        //Default constructor contains super()!!! :call

        // TODO: 27/07/2023
        //String Builder dosent have a concat METHOD!!!
        //String Builder has a append Method!!!!


        // TODO: 27/07/2023
        //PAY ATTENTION WITH SEMI-COLLON!!!!!!!!!!!!!!!!!!!
        //TRICK!!!!!!


    }
}
