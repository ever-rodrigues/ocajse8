package praticalexam;

public class InstanceVariablesQuestions {

    //Instance variables cannot be ABSTRACT, SYNCRONIZED, STRICTFP, NATIVE, STATIC

    private String a;
    public String b;
    String c="A";
    protected String d;
    final String e="1";

    transient String f="";
    volatile String g="g";

    //Local Variables can be FINAL
    //Local Variables cannot be Private, Defaulty, Protected , Public, Transient , Volatile , Static
    public void a(){
        int a;

    }



    private int theInt=0;
    int getId(){
        return theInt;
    }
//    This method returns a copy of theInt
//    as it is a primitive type. A copy of the contents of this primitive type named 'theInt' is returned.




}
