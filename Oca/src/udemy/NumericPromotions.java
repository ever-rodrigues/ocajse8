package udemy;

public class NumericPromotions {
    public static void main(String[] args) {
        NumericPromotions numericPromotions= new NumericPromotions();
    }
    short a=18;

    float b=19;
    double c=25;

    short x=10;
    short y=11;
    int z=x+y;

    int aaaa=100;
    long bbb=1000;
    float zzz= aaaa+bbb;
    double ll=aaaa+bbb;
    float Llong=aaaa+bbb;


    double test = 10.234;
    int testInt= 10;


    {
        System.out.println(a*b/c);
        //A AND B are PROMOTED to Double, because double is the larger data type!
        System.out.println(x+y);
        System.out.println(zzz);
        System.out.println(ll);
        System.out.println(test+ testInt);
    }

}
