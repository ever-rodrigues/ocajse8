package udemy.Hier;

public class Super {
    public String name= "From Super name";
    protected String protName = "Its a protected Name ";

    String defName= "Default Super name";

    private String prName =" Private Super Name";

    protected void printValue(){
        System.out.println("From Super method - Protected on Super!");
    }

    //Private Package
    void printValue2(){
        System.out.println("From Super method  Using private protected acces");
    }

    public void printValue3(){
        System.out.println("From Super Public Method !");
    }
    private String printValue4(){
       return "Printing Super Private Method!!!";
    }

    protected void getvalue4(){
        System.out.println(printValue4());
    }
}
