package udemy.Hier;

import udemy.S;

public class Sub extends Super{

    public void printValue(){
        System.out.println("Print Sub value");
    }

    public void printValue2(){
        System.out.println("Print from Sub method Value 2 ");
    }



    public static void main(String[] args){
        try {
            System.out.println("AAA");
            throw new RuntimeException();
        }catch (Exception e ){
        System.out.println("A");
        }
        Sub sub = new Sub();
        sub.printValue();
        sub.printValue2();
        sub.printValue3();

        System.out.println(sub instanceof Super);
//
//        Super mySup=new Sub();
//        mySup.printValue();
//        mySup.printValue2();
//
//
//
//        mySup.protName="Defining new Prot Name value from Sub";
//        mySup.name="Defining new Name value from Sub ";
//        mySup.defName= "Defining new Default Name from Sub";
//
//

    }

}
