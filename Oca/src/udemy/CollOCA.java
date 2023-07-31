package udemy;

import udemy.classdesign.Mammal;
import udemy.classdesign.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;

public class CollOCA {
    List<String> myList = new ArrayList<>();
    Collection<String> names= new ArrayList<>();

    public static void main(String[] args) {
        CollOCA collOCA= new CollOCA();
        collOCA.myList.add("A");
        collOCA.names.add("Everton");
        String theEverName= "Everton";
        collOCA.names.removeIf((name)->name.equals(theEverName));//TRUE
        collOCA.names.add("New Name");
        collOCA.names.add("Second Name");
        collOCA.names.forEach(name-> System.out.println(name+""));

    }

}
