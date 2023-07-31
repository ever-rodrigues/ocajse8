package udemy.Loops;

public class Test {
    public static void main(String[] args) {
        int[] myArray={1,2,3,4,5};
        for (final int i:myArray
             ) {
            System.out.println(i);
        }
        //COMPILATION FAIL BECAUSE WE ASSIGN A VALUE INTO FINAL VARIABLE< THAT CONNOT BE CHANGED!!!!
//        for(final int i=0; i<myArray.length; i++){
//            System.out.println(myArray[i]);
//        }
    }
}
