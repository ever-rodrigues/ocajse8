package udemy.classdesign;

public class InClass extends Item{
    public InClass(){
        System.out.println("Inside InClass Constructor");
    }
    static {
        System.out.println("Static Item ");
    }
    {
        System.out.println("Inside InClass Instance initializer");
    }
    public static void main(String[] args) {
        System.out.println("I am the main One");
        InClass inClass= new InClass();
        inClass.test();
        inClass.usingPrivateMethod();

    }

    public Long test(){
        Long n=Long.valueOf(super.test().toString());
        System.out.println(n);
        return n;
    }

    @Override
    public void usingPrivateMethod() {
        super.usingPrivateMethod();
    }
}
