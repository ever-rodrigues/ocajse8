package praticalexam.abstractC;

abstract class AbstractCalc {
    final int a=100;

    public void test(){
        System.out.println("In test Method!!");
    }

    static {
        System.out.println("In Static body!");
    }

    static final public String getString(){
        return "String from getString method() from Abstract Class";
    }

    public static void print(){
        System.out.println("Printing from static method of Abstract Class!");
    }

    AbstractCalc(){
        System.out.println("Inside constructor of Abstract Class");
    }

    {
        System.out.println("Inside initializer Block!!");
    }

    abstract void abastractMethod();



}
