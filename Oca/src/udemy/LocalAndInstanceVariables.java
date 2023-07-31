package udemy;

public class LocalAndInstanceVariables {
    public final String NAME_OF_ENVIRONMENT="MY NAME";
    private volatile String myPrivateVariable;
    private transient String transientTest;

    protected  String teste;
    public String myVariablePublic;

    public void testLocalVariable(int a, int b){
        IntanceVariable intanceVariable;
        intanceVariable=new IntanceVariable();
        intanceVariable.setName("A");
        //Always assign variable (Initialize) value before use it!!!
//        int c;
//        System.out.println(c);
        System.out.println(intanceVariable.getName());
    }

    public static void main(String[] args) {
        LocalAndInstanceVariables localAndInstanceVariables= new LocalAndInstanceVariables();
        localAndInstanceVariables.testLocalVariable(2,2);
        String[] names={"Everton","Paulo"};
        localAndInstanceVariables.printListOfNames("Hello", names);
    }

    public void printListOfNames(String greetings, String[] names){
        for(String name:names){
            System.out.println("OW:"+ greetings+"-> "+ name);
        }
    }

}
