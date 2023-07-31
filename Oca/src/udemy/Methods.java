package udemy;

public class Methods extends ClassToBeExtended{

    public final void GetAllValues() throws RuntimeException{
    }
        //THE ORDER CANNOT BE CHANGED!!! CANOT COMPILE!!!
    //    public void final NotCompile(){
    //    }

    public final int getAllValues(int a){
        return a;
    }
    @Override
    public void noFinalInMethod(){
        System.out.println("No Final Override");
    }
//CANNOT EXTEND FINAL METHOD -> ERROR
//    @Override
//    public final void testString(){
//        System.out.println("Teste");
//    }


}
