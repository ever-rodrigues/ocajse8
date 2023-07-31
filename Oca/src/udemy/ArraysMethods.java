package udemy;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] myArray = new int[]{15,14,43};
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));

        System.out.println(Arrays.binarySearch(myArray,125));// -4 -> The element 125 that doesn't exist,
        //if existed it will be inserted on 4 place of array ( index 3)

        int[] unsortedArray = new int[]{454,15,65,14};
        System.out.println(Arrays.toString(unsortedArray));//[14,15,65,454]
        System.out.println(Arrays.binarySearch(unsortedArray,14));//0

    }
}
