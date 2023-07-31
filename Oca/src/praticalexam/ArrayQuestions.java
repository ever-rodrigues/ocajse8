
package praticalexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayQuestions {

    //You cannot add the size of array in DECLARATION!
    //    int[3] i ;

    //THE CORRECT IS:
    int[] i = new int[3];

    //AbstractList is the immediate concrete superclass of ArrayList.
    // Both AbstractList and ArrayList are located in the 'java.util' class library of the core Java API

    //int[][] b , int b[][], int[]b[] -> OK TO CREATE ARRAY
    //int c[][] = new int[1][];
    //int c[][] = new int[2][3];


    //Convert int[][] into an array on int[] a -> COMPILE ERROR!!!


    //PAY ATTENTION, YOU CAN CREATE ARRAY AT THIS WAY!!!!!!!!!!!!!


    public static void main(String... args) {
        List<String> list = new ArrayList<String>(2);
        System.out.println(list.size());

        int[] a = new int[2];
        System.out.println(a.length);

        String abc= "abc";
        System.out.println(abc.length());


        int i = 4;
        int iA[][][] = new int[6][1][1];
        System.out.println(iA.length);
        System.out.println(iA[0].length);

//        System.out.println(iA[0].length);
//        System.out.println(iA[0][0].length);


        int [] ar1[]=new int[3][1];
        System.out.println(ar1.length);
        System.out.println(ar1[0].length);


        System.out.println("______________Arrays.sort()______________");
        String[][] k= {{"c","d","k" },{"d"}};
        Arrays.sort(k[0]);
        for(String c:k[0]){
            System.out.println(c);
        }

        int w=1_0000;

        System.out.println("__________FOR COM SOUT__________");
        for(int x=10,y=6;x<y; System.out.println(x--)){
            System.out.println(x);
        }
    }

}
