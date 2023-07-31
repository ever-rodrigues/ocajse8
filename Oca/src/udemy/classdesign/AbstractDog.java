package udemy.classdesign;

public class AbstractDog extends AbstractMammal implements Test,Test2{

    @Override
    public void speak(){
        System.out.println("Speaking....");
    }

    @Override
    public void walks(){
        System.out.println("Walking...");
    }

    public static void main(String[] args) {
        AbstractDog dog = new AbstractDog();
        dog.speak();
        dog.walks();
        Test.testeA();
        dog.defaultMethod();


    }

    @Override
    public String defaultMethod(){
        System.out.println("Overriden method!!");
        return "Overriden";
    }

    public String getDefaultFromTest2(){
        return Test2.super.defaultMethod();
    }
    @Override
    public void testing() {

    }

    @Override
    public String getValues() {
        return null;
    }
}
