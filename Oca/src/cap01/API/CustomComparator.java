package cap01.API;

import java.util.Comparator;

public class CustomComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer i1, Integer i2) {
        return i1<i2 ? 1:-1;
    }

    public CustomComparator() {
    }
}


