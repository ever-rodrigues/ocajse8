package praticalexam;

public class HieritanceQuestions {

    //All variables inside Interface must be PUBLIC STATIC FINAL

    //Interface Methods cannot be defined as FINAL, STRICTFP or NATIVE

    //Interface Constants dont have to declare explicity as PUBLIC, STATIC FINAL
    //Ex int theBar=42; E O MESMO QUE : public static final theBar=42;


    //Interfaces can include inheritane methods
    //These Concrete methos are Called DEFAULTY ! They must include a Body and CANNOT be marked as STATIC.
    //DEFAULTY METHODS MUST BE IMPLEMENTED!!!!
    //To do Metodo em uma Interface e Abstrato por implicity

    //EX:
    //interface A{
        // defaulty int m1();
        // public defaulty void m2(){
    // ;
    // }
    //}


    //DEFAULT MUST HAVE A BODY!!!


    //STATIC IS NOT ALLOWED WITH ABSTRACT METHOD!!!

    //METHOD STATICS MUST TO HAVE A BODY! IMPLEMENTATION!!!

    //The keyword FINAL is not ALLOWED in INTERFACES!!!

    //USE FINAL TO INDICATE THAT METHOD CANNOT BE OVERRIDDEN BY SUBCLASS!!!!

    //INTERFACE CANNOT BE DECLARED AS PRIVATE OR PROTECTED!!!!

    //ENUM CANNOT BE DECLARED AS PRIVATE OR PROTECTED!!!
    //YOU CANNOT DECLARE A ENUM IN A METHOD OF ANY KIND ( static method, class method, main method)!!!


    //At Java 8 its possible to INHERIT CONCRETE Method from Interfaces! EXAMPLE:
//    interface A{
//          default public void m(){
//              System.out.println("Interface A: m()");
//          }



      //POLYMORPHISM doesn't apply to static methods.

}