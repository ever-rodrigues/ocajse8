package praticalexam.interfaces;

public interface InterfaceA {
    public default void run(){
        System.out.println("Run from A");
    }

    public static void print() {
        System.out.println("Printing from Static method from Interface A");
    }

    public static void main(String[] args) {
        System.out.println("Main method inside interface!!!");
    }
}
