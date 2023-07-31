package praticalexam.abstractC;

public class Main extends AbstractCalc {

    public static void main(String[] args) {

        //Abstract class cannot be instantiable
        //Abstract class can have methods and static methods!
        //Abstract method CANNOT HAVE A BODY!!!!! -> Equal Interface!
        AbstractCalc.print();
        AbstractCalc.getString();


    }

    @Override
    void abastractMethod() {

    }



}
