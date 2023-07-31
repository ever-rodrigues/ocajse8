package praticalexam;

public class CompileQuestions {
    public static void main(String[] args) {
        System.out.println(1+2+"3");
        //What it will be printed?
        //-> 33


        //MODULUS COMPOUND!!!!
        int x=21;
        x%=4; //MODULO DE x%4 , ou SEJA x=X%4; RESTO DA DIVIDAO DE 21/4 = 5 com RESTO -> 1!!!
        x=x%4;  //SUBSTITUINDO PARA FACILITAR!!!
        System.out.println(x);


        //EQUALS WHILE(TRUE)!!!
//        for(;;){}

        //PAY ATTENTION THE METHOD PRINT NEEDS STRING ARGUMENT!!!
        //System.out.print(); //ERROR!!!!
        //System.out.print(""); OK
    }

    //OUTRA QUESTAO!
    public static void m(int m){
        String s;
        //System.out.println(s); Voce nao conseguira imprimir s sem antes atribuir um valor a mesma para inicializala!!!


    }


    //int e# = 2;   NOT COMPILE!!! ERROR!!!
    //int :a = 3;   NOT COMPILE!!! ERROR!!!
    //int -d;       NOT COMPILE!!! ERROR!!!
    //int .d;       NOT COMPILE!!! ERROR!!!


    // compiler errors with UNREACHABLE STATEMENTS!!!.
    //PAY ATTETION :
    //int x=1;
    //if (false){x=3;}
        //ERROR! THE CODE NEVER REACHS INSIDE IF!!!



    //THIS CODE NOT COMPILE BECAUSE VARIABLE I IS RE_DECLARED IN FOR LOOP!!!
//    int i = 0;
//    for (int i = 0; i < 2; i++) {
//    }
    //int i is declared above the for loop and then re-declared in the for loop which gives a compiler error.

    //SOLUTION :
//    int i = 0;
//    for (i = 0; i < 2; i++) {
//    }



}
