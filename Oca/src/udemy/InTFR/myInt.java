package udemy.InTFR;

public interface myInt {

    public String a="";

    public static String A="dsd";

    final String ADS="dsds";


    public String getSomeValue();

    static void addSomevalue(){
        System.out.println("method Static on Interface");
    }

    default void defaultMethod(){
        System.out.println("Defaulty method inside Interface");
    }

    }

