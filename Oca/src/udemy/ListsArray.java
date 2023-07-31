package udemy;

import java.util.Arrays;
import java.util.List;

public class ListsArray {


    public static void main(String[] args) {
        String[]  names= new String[]{ "A","B","C"};
        List<String> myList = Arrays.asList(names);
        myList.set(2,"Ever");

        System.out.println(myList); //[A,B,Ever]
        System.out.println(Arrays.toString(names)); //[A,B,Ever]

    }

}
