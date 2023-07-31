package udemy.HierOutside;

import udemy.Hier.Sub;
import udemy.Hier.Super;
import udemy.S;

public class SubOutside extends Super {


    public static void main(String[] args) {
    SubOutside sbs= new SubOutside();
    sbs.printValue();
    sbs.name="AAA";
    sbs.protName="BBB";
    sbs.printValue3();
    sbs.getvalue4();

    Super su= new Super();
    su.name="BBB";
    su.printValue3();



    }
}
