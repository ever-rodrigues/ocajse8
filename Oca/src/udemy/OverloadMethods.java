package udemy;

public class OverloadMethods {
    public void printValue(int a){
        System.out.println("Integer as parameter!");
    }
    public void printValue(float a){
        System.out.println("Float as parameter!");
    }

    public void printValue(Double a){
        System.out.println("Double as parameter!");
    }

    public static void main(String[] args) {
        OverloadMethods overloadMethods= new OverloadMethods();
        overloadMethods.printValue(10); //Integer as parameter!
        overloadMethods.printValue(10f);//Float as parameter!
        overloadMethods.printValue(10.0);//Double as parameter!

        //Java will look to the next primitive proximally of source type!
        //As short -> he will look to next , int , after that long..etc
        short c=40;
        overloadMethods.printValue(c);//Integer as parameter!
    }
}
