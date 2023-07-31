package praticalexam.tests;

public class A extends Concrete{

    public static void sing(){
        System.out.println("Fa");
    }
    private int value=100;

    public int getValue(){
        printCLass();
        return value;

    }
    private String valueA="Private value";
    public void printCLass(){
        System.out.println("Inside A");
    }

    public static void main(String[] args) {
        Concrete a= new A();
        //SuperClass sp = new SubClass;
        //SubClass sb = new SuperClass!!! WRONG!!! COMPILE ERROR!!!
        //Subclass sb = SuperClass !!!ERROR!!!
        a.sing();

        A b = new A();
        b.sing();

    }
}
