package udemy;

public class UnaryOperators {

    public int returnValue(int a){
        return ++a;
        //Return number +1;
    }

    public int returnOldValue(int a){
        return a++;
    }

    public static void main(String[] args) {

        int c=5;
        int d=c++;

        System.out.println(c); //6
        System.out.println(d); //5

        int e=6;
        int f=++e;

        System.out.println(e); //7
        System.out.println(f); //7

        int aa=5;
        aa=aa++;
        System.out.println(aa); //5



    }
}
