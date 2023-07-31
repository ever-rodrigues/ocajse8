package udemy.InTFR;

public class Main extends Abs implements myInt{

    @Override
    public String getSomeValue() {
        return null;
    }

    @Override
    public void defaultMethod() {
       myInt.addSomevalue();
    }

    public static void main(String[] args) {
        Main main= new Main();
        System.out.println(main instanceof myInt);
        System.out.println(main instanceof Abs);

        Integer i = new Integer(3);
        Short s = new Short("3");
//        System.out.println(i==s);
    }
}
