package praticalexam;

public class InterfaceQuestions {

    //When interface has some variable it will be CONSTANT !!!
    //So when some Subclass trie to change the value of CONSTANT it will be COMPILE ERROR!!!
    interface A {
        int k = 10;
    }
    public class B implements A {
        public B(){
            //k=20; HERE ERROR IF YOU TRIE TO ASSIGN NEW VALUE TO K !!!
            System.out.println(k);
        }}

    //As Interface methods are implicitly public
}
