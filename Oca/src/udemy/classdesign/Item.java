package udemy.classdesign;

public class Item {
    private final double TAX;
    private final double price;

    public Item(){
        this.price=0.2;
        System.out.println("Inside Super Item Constructor");
    }

    {
        this.TAX=12.5;
        System.out.println("Inside Super Instance Initializers");
    }
    static {
        System.out.println("Static Super Item");
    }

    protected Object test(){
        return 10;
    }

    private String MyPrivateMethod(){
        return "AAA";
    }

    public void usingPrivateMethod(){
        String a= MyPrivateMethod();
        System.out.println(a);
    }
}
