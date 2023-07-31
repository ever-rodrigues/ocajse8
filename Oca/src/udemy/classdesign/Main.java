package udemy.classdesign;


import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Lambdas lambdas = (a,b) -> {
            if(a<b) {
                return a*b;
            }else{
                return 0;
            }
            };
        int returnOfValue= lambdas.printSomeValue(30,10);
        System.out.println(returnOfValue);

        Predicate<String> testString = (name)->{
            if(name.isEmpty()){
                return true;
            }else{
                return false;
            }
        };
        System.out.println(testString.test("A"));

        Predicate<Integer> testInt=(a)-> a%2==0;
        System.out.println(testInt.test(99));


      Predicate<String> testEquals= (name)-> name.length()==10;
        System.out.println(testEquals.test("EvertonRod"));
    }



}
