package udemy;

import java.util.ArrayList;

public class ArraysInGeneral {
    public static void main(String[] args) {
        int[] myArray = new int[6];
        myArray[0]=109;

        int myArray2[]=new int[10];

        int myArray3[]= {10,12,12};
        int[] myArray4= {10,12,12};


        //The size of array only will be defined on right side of sentense: BELLOW WRONG DECLARATION!!!
        //int[3] WRONG= new int[];


        int[] myNumbers, myIntValues; //OK
       // int myNumbers2[], myIntValues;//NOT OK

        System.out.println(myArray3==myArray4);
        System.out.println(myArray3.equals(myArray4));
        for (int item:myArray4
             ) {
            System.out.println(item);
        }

        System.out.println(myArray3.length);
    }
}
