package praticalexam.Exams;

import java.util.Arrays;

public class InnerClass {

    class c3{
    }

    class c4{
    }

    public static void main(String[] args) {

        class c5{
        }

        InnerClass i= new InnerClass();
        new InnerClass().new c3();
        new InnerClass().new c4();
        new c5();

    }
}
