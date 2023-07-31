package udemy;

public class StringPollClass {
    public static void main(String[] args) {

        String a="aaa";
        String b="aaa";
        System.out.println(a.equals(b)); //true
        System.out.println(a==b); //true


        //STRING BUILDS EVALUEATE THE HEAP MEMORY!!!
        StringBuilder c=new StringBuilder("ccc");
        StringBuilder d=new StringBuilder("ccc");
        System.out.println(c.equals(d));//false
        System.out.println(c==d);//false

    }
}
