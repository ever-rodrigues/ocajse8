package cap02;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class IteratorFloar {
    public static void main(String[] args) {
        List<Float> arrayFloat = new ArrayList<>();
        arrayFloat.add(10.1f);
        arrayFloat.add(15.5f);
        arrayFloat.add(18f);
        arrayFloat.add(29.5f);
        arrayFloat.add(45.5f);

        for(Float a:arrayFloat){
            if(a>28){
                System.out.println(a);
            }
        };
    }
}
