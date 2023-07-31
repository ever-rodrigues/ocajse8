package praticalexam.initializations;

import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.String;

public class Main {
    static {
        System.out.println("Main static block!");
    }
    {
        System.out.println("Initialization block");
    }
    public static void main(String[] args) {
        System.out.println("Main");
          A a = new B();
//          A onlyA = new A();
//        B onlyB = new B();



    }
    // PRIMEIRO ELE IMPRIME Blocos static{}
    //Depois por classe ele imprime
    // Bloco de inicialização -> Somente e alcancado quanto se tem uma instanciacao do Objeto!
    // Contrutor


}
