package praticalexam.initializations;

public class B extends A{
    static{
        System.out.println("Static method B!");
    }
    B(){
        System.out.println("Contructor of B!");
    }
    {
        System.out.println("Initialization block of B!");
    }
}
