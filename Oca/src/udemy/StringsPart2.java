package udemy;

public class StringsPart2 {
    public static void main(String[] args) {
        String name="John";
        int number=5;

        String newString = String.format("%s has %d",name,number);
        System.out.println(newString);
        System.out.printf("%s has %d",name,number);
    }
}
