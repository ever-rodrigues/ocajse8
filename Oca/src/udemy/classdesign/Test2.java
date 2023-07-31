package udemy.classdesign;

public interface Test2 {
    public default String defaultMethod(){
        System.out.println("Default2");
        return "Default Method Test2 in Interface Class";
    }
}
