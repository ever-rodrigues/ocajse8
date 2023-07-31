package udemy.javaapi;

import udemy.S;

public class SB {

    public static void main(String[] args) {
        StringBuilder myBuilder = new StringBuilder();


        myBuilder.append("sadsd");
       StringBuilder myBuilder2 = myBuilder.append(myBuilder);
        System.out.println(myBuilder2);
        myBuilder=myBuilder.insert(2,4);
        System.out.println(myBuilder);

        //Replace needs (start, end , value)
        myBuilder2.replace(1,35,"");



        String myName = "abs";
        String yourSame= "abs";
        System.out.println(myName);
        System.out.println(yourSame);
        System.out.println(myName.equals(yourSame));
        System.out.println(myName.contains(yourSame));

        String myStr= new String("dsds");
        String myStr2= new String("dsds");
        System.out.println(myStr.equals(myStr2));
        System.out.println(myStr.contains(myStr2));
        String aStr= myStr2.replace("dsds","a");
        System.out.println(aStr);
        String aStr2=aStr.replaceAll("a","adsdsdvcx");
        System.out.println(aStr2);


        String c="A B C";
        String[] d= c.split("//s");
        for (String value:d
             ) {
            System.out.println(value);
        }


        String joinString = new String().join(".","ever","com");
        System.out.println(joinString);

        String formStr = String.format("The %s %.2f exam", "ITS MY FIRST",2.0);
        System.out.println(formStr);


        String s="Whizlabs";
        String[] sArray = s.split("\\S");
        System.out.println(sArray.length);
        for (String i :sArray
                ) {
            System.out.println(i);
        }

        String comparison = String.format("%3$d>%d",1,7,8,3,2);
        System.out.println(comparison);
    }
}
