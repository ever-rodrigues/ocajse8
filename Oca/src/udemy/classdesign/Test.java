package udemy.classdesign;

public interface Test {
    public void testing();

   public static final int VALUE_MAX=1000;

    public String getValues();
//    public final String getNewValues(); NOT ALLOWED!!! USE FINAL IN INTERFACE

    public static String testeA(){
        System.out.println("Running from Interface");
        return "ok";
    }

    public default String defaultMethod(){
        System.out.println("AAAAAAAA");
        return "Default Method in Interface Class";
    }

    public static String privStatMeth(){
        return "Private Static Method";
    }

    public default String getFromPrivate(){
        return privStatMeth();
    }


}
