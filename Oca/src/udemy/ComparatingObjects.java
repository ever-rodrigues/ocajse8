package udemy;

public class ComparatingObjects {

    String obj1 = new String("AAA");
    String obj2= new String("AAA");

    String obj3=obj1;

    {
        System.out.println(obj1==obj2);
        System.out.println(obj3==obj1);
    }

    public static void main(String[] args) {
        ComparatingObjects comparatingObjects= new ComparatingObjects();
    }
}
