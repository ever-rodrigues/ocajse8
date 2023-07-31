package praticalexam;

import java.util.AbstractList;
import java.util.ArrayList;

public class ForQuestions {

    public static void main(String[] args) {
        //WILL COMPILE ->USING FINAL !!!!

        String[] s = {"H","i"};
        for (final String arg : s) {
            System.out.print(arg);
        }


        String[] b = {"H","i"};
        for ( String arg : b) {
            System.out.println(arg);
        }

        int i;
        for ( i = 0; i < 2; i++) {
            System.out.println(i);
        }

    }

}
