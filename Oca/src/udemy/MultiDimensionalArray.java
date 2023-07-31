package udemy;

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        //Array Of Arrays
        String[][] arrayString = new String[][]{
                {"a","b"},
                {"c","d"},
                {"cd","ds","sds","ds"}
        };
        for(int i=0;i<arrayString.length;i++){
            for (int j=0;j<arrayString[i].length;j++){
                System.out.printf("a(%s,%s)=%s \n",i,j,arrayString[i][j]);
            }
        }
    }
}
