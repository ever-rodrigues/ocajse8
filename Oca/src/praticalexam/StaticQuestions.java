package praticalexam;

public class StaticQuestions {

    //We must declare static variables in the class and not method.
    //eg
    static int i = 1; //IF FINAL USED THAN THE VALUE CANNOT BE CHANGED!!!  -> static final int i=10;

    public static void main(String[] args) {
        // static String a="!!"; WRONG LINE -> COMPILES ERROR!!!
        //STATIC METHOD CAN CHANGE VALUE OF STATIC VARIABLE!!!
        for (int j = 0; j < 10; j++) {
            System.out.println(i++);
        }
        System.out.println(i);
        for (int j = 0; j < 2; j++) {
            for (int k = 0; k < 2; k++) {
                System.out.print(" " + j);
                if(j== 1 && k== 1) break;
            }
        }


        //When exceptions are thrown in a static initialization block they must be wrapped
        // in a try catch block otherwise it causes a compiler error.


        //A static initialization block is called only once,
        // no matter how many instances of the class is created


        //An initialization block gets called every time the class is constructed
    }
}