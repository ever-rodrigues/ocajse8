package praticalexam.initializations;

public class A {
   static{
       System.out.println("Static method A!");
   }
   A(){
       System.out.println("Contructor of A!");
   }
    {
        System.out.println("Initialization block of A!");
    }
}
