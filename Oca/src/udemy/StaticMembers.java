package udemy;
public class StaticMembers {
    public static final String T_A="A";
    public void test(){
        System.out.println("A");
    }
    static StaticMembers staticInstance= new StaticMembers();
    public static void greetAll(){
        staticInstance.test();//Work because you are accessing a non static memmber, with Instance!
        //StaticMembers.test();//NOT WORK!!!! Because you are trying to acces an non-Static member!
    }

    public static void main(String[] args) {
        double a=100;
        Integer ab=100;
        System.out.println(java.lang.Math.pow(3,4));
        String.valueOf(1);
        Integer.valueOf("100");
        Float z = (float) 100;
        Float.valueOf("100");
        Double.valueOf("100");
        short c=ab.shortValue();
        System.out.println(c);

    }

}
