package praticalexam;

public class StringBuilderQuestions {

    //append(String aStr):
    //The characters of the String argument are appended into the character sequence (StringBuilder object).

    // insert(int startIndex, Object obj):
    //Inserts the string obj into this character sequence (StringBuilder object) at startIndex.

    //replace(int startIndex, int endIndex, String str):
    //Replaces the characters in a substring of this sequence with characters in the specified String.
    // The substring begins at the specified startIndex and extends to the character at endIndex end - 1

    //reverse():
    //Causes this character sequence to be replaced by the reverse of the sequence.

    //delete(int startIndex, int endIndex):
    //Removes the characters in a substring of this sequence.
    // The substring begins at the specified start and extends
    // to the character at index end - 1 or to the end of the sequence if no such character exists.


    //ensureCapacity(300) - Ensures that the capacity is at least equal to the specified minimum of 300.

//    All references to objects and Strings are passed to methods by value.
//    Pass by Value: The method parameter values are copied to another variable
//    and then the copied object is passed, that's why it's called pass by value.

    //The program will not delete anything as end index (i.e. 4-1) 3 is less than the starting next 4.
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        // sb.delete(start,end) -> Calcula mas nao inclui o end
        System.out.println(sb.delete(4,4 )); //Hello
        System.out.println(sb.delete(2,4 )); //Heo
        System.out.println(sb.delete(2,5 )); //He

        sb.insert(1,"a");//Hae
        sb.append("To");
        System.out.println(sb);//HaeTo
        sb.delete(1,4);//start =1 , end 4-1=3; // Ho
        System.out.println(sb);
        sb.reverse();//-> oH
        System.out.println(sb);
        System.out.println(sb.length());//2
        sb.setLength(4);//4
        System.out.println(sb);//oHnullnull
        System.out.println(sb.length());//4
        sb.delete(2,4);//->oH
        System.out.println(sb);
        System.out.println(sb.charAt(1));//H
        System.out.println(sb.capacity());//->21 -> O total de caracteres que pode ser armazenados sem alocar mais memoria
        System.out.println(sb.append("Akxvs"));//oHAkxvs
        sb.replace(0,2,"Z");// -> "oA" -> "Z"; -> ZAKxvs
        System.out.println(sb);

//    The java.lang.StringBuilder is not thread safe.
//    That means StringBuilder methods are not synchronized



    }
}
