package udemy.classdesign;

public class ParentClass extends java.lang.Object{

    protected String name;
    String firstName;

    {
        System.out.println("New Instance of Parent Class");
    }

    public void test(){
        System.out.println("Inside Test method!");
    }
    public ParentClass(){
        System.out.println("Inside Constructor!");
    }
}
