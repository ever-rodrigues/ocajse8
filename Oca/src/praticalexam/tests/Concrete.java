package praticalexam.tests;

public class Concrete extends TestInterface{



    public static void sing(){
        System.out.println("La!");
    }
    public void printCLass(){
        System.out.println("Inside Concrete");
    }
    Concrete(){
        System.out.println("InsideConstructor Of Super Class");
    }
    @Override
    public void growApple() {

    }

    @Override
    public void grow() {

    }
}
