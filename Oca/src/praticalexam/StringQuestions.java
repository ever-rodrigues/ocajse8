package praticalexam;

public class StringQuestions {
    //• length()
    //
    //• concat(String str)
    //
    //• substring(int beginIndex)
    //
    //• substring(int beginIndex, int endIndex)
    //
    //• trim()
    //
    //• replace(char oldChar, char newChar)

    //• charAt()

    //      for(int i = 0; i < 1000; i++) {
    //          s = " " + i ;
        //   }
    //Strings, however, are immutable (not changeable),
    // so every String concatenation operation results in a new String object.
    //1000 Strings will be created if Garbage Collector dosent act on them !!!


    public static void main(String[] args) {
        String a = "asdsv";
        a.trim();

        a.substring(2,4); //(start 2 , end 4-2); -> ds  -> PASSO VALOR
        System.out.println(a.substring(4,4));//-> Imprime vazio porque start = 4, end =-1 , menor que start
        System.out.println(a.replace("a","c")); // csdsv -> STRING

        System.out.println(a.indexOf("s"));//1

        System.out.println(a.replaceFirst("s","c")); //-> acdsv

        String[] result = a.split("sd"); //-> {"a","sv"} -> Ele tira a string passada! e Splita o resto
        for (String b:result //-> {"a","sv"}
             ) {
            System.out.println(b);
        }

        System.out.println(a);//asdsv

        String h1= a.replace("s","x");
        System.out.println(h1);
    }

}
