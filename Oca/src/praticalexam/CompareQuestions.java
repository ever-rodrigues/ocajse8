package praticalexam;

public class CompareQuestions {


    public static void main(String[] args) {
        //Comparing Objects with ==

        Integer i = new Integer(3);
        Short s = new Short("3");
        System.out.println(i==i);
        //System.out.println(i==s) NOT OK ! Cannot compare Integer with Short with ==
        //Differents type and are UNRELATED!!!! ->COMPILED ERROR!!!


        //Possible solution is casting Short to Integer
        //   Integer a= Integer.valueOf(s);
        //But as this are two objects, the result it will be false!

        Integer j = new Integer(3);
        Integer h = new Integer(3);
        System.out.println(j==h); //False -> There are two objects with same value but Memory head distinct

        int k=3;
        System.out.println(j==k);// TRUE // Object with same Type and has same value, they are equal
        //The j is unweapped to this primitive , so there you can compare the two values!


        //IN OBJECTS == compares ADDRESS MOMERY OF OBJECTS (THEY NEED TO BE SAME TYPE!) !!!
        //ALSO COMPILE ERROR IF THEY ARE DIFFERENT TYPE!

        Integer x=1;
        Integer y=1;
        System.out.println(x==y); //SAME VALUE -> TRUE
        //However, in order to save memory, two instances of the following wrapper objects created through boxing
        // (i.e. Integer i1 = 1) will always be equal when their primitive values are the same.


        Integer N = new Integer(1);
        Integer M= new Integer(1);
        System.out.println(N==M);//FALSE

        System.out.println(N.equals(M));//TRUE
    }
}
