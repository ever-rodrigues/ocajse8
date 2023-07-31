package praticalexam.hie;

public class ClassCastExc {

    public static void main(String[] args) {
        SuperClass superClass= new SuperClass();
        SuperClass subClass = (SubClass) superClass;  //THROW EXCEPTION!!!!!!! CLASSCASTEXCETION
        SubClass subClass2 = (SubClass) superClass; //THROW EXCEPTION!!!!!!!   CLASSCASTEXCETION
        //NAOOO PODE CONVERTER SUPER CLASS EM SUBCLASSE!!!!!!!!!!!
        //ERRO ESTA EM (SubClass) superClass!
    }
}
