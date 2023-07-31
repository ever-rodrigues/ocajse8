package praticalexam.hie;

import udemy.Hier.Sub;
import udemy.S;

public class SubClass extends SuperClass {
    public static void printValue(){
        System.out.println("SUB");
    }

    protected void defaultPrint(){
        System.out.println("Default print on SubClass!");
    }

    protected void methodOnlyOneSub(){
        System.out.println("This method is only for Sub!!!!");
    }

    public static void main(String[] args) {

//        printValue();
//        SuperClass.printValue();


        SuperClass localSuperClass= new SuperClass();
        //Instanciando o objeto, metodos privados ou statics nao sao vistos pelo objeto !!!!
        // Metodos privados so sao vistos pela propria Classe!!!!
        System.out.println("_________SUPER -> NEW SUPER________________________");
        localSuperClass.defaultPrint();
        localSuperClass.printValue();
        SuperClass.printValue();
        printValue();

        System.out.println("_________SUPER -> NEW SUB________________________");
        SuperClass subClass = new SubClass();
        subClass.defaultPrint();
        subClass.printValue();
        printValue();
        //subClass.methodOnlyOneSub(); //YOU DONT HAVE THIS METHOD ON SUPER!!!!!!!!!! -> COMPILE ERROR!!!!!!!!!

        System.out.println("_________SUB -> NEW SUB________________________");
        SubClass onlySub= new SubClass();
        onlySub.defaultPrint();
        onlySub.printValue();
        printValue();
        onlySub.methodOnlyOneSub();





    }

    //private
    //default-> sem nada -> Somente mesmo pacote
    //protected -> Mesmo pacote ou subclasse que extende fora do pacote
    //public -> Todos podem acessar
}
