package udemy;

import java.util.ArrayList;

public class ForControl {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("Testing -> " + i);
        }
        ArrayList<String> myArray=new ArrayList<>();
        myArray.add("A");
        myArray.add("B");
        myArray.add("C");
        for (String elem:myArray
             ) {
            System.out.printf(elem);
            System.out.println();
        }


        for(int h=0,m=0;(h+m)<5;h++,m++){
            System.out.println(h+" -> "+m);
        }
    }
}
