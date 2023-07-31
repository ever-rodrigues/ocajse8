package praticalexam;

public class SwitchQuestions {

//    A switch statement must have a body and it can be empty

    //ONLY CB-SIS-E CAN USED:
    // Character - Byte - Short - Integer - String - ENUM


    //An unlabeled block of code inside a switch block causes a compiler ERROR!!!!
//    int i = 0;
//    switch(i){
//        System.out.println(0);
//    }

    //NEEDS TO HAVE CASE: OR SOMETHING lABELED (case)

    public static void main(String[] args) {
        int i=0;
        switch (i){
            case 1:
            System.out.println("A");
            break;
            case 0:
                System.out.println("");
        }


        //SOMENTE SE USA STRING NO SWITCH SE ELA FOR FINAL!!!!!!!!!!!!
        final String s="A";
        switch (s){
            case s:{
                System.out.println("String to use in Case must be final!!!!!!!!!");
            }
        }
    }



    //A constant is required FOR CASE VALUE eg:
    //case: (new Integer(0)) -> ERROR!!! NOT COMPILE!!!!
}
