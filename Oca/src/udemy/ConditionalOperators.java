package udemy;

public class ConditionalOperators {
    boolean a=true;
    boolean b=false;
    boolean c=true;
    int x=5;
    int y=10;
    int z = 15;
    {
        if(a&&b){
            System.out.println("ONLY ONE IS TRUE");
        } else if (a&&c) {
            System.out.println("ALL TRUE");

        }
    }

    {
        if((x<y) | (++z<10)){
        System.out.println("We are IN!");
        }
        System.out.println(z);
    }

    public static void main(String[] args) {
        ConditionalOperators conditionalOperators= new ConditionalOperators();

    }
}
