package udemy;

public class OrderOfInicialization {
    private String name="Chip";

    public OrderOfInicialization(){
        this.name="Teddy";
        System.out.println("Inside constructor:");
    }

    //the code between two brackets {...} is caleed CODEBLOCK


    {
        System.out.println("Inside the Initializer block...");
    }

    public static void main(String[] args) {
        OrderOfInicialization orderOfInicialization = new OrderOfInicialization();
        System.out.println(orderOfInicialization.name);
    }


    //THE ORDER OF INITIALIZATION IS:

    //FIRST THE INSIDE INITIALIZER BLOCK
    //SECOND THE CONSTRUCTOR IS EXECUTED
    //THIRD THE NAME

}
