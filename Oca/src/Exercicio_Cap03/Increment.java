package Exercicio_Cap03;

public class Increment {
    public static void main(String[] args) {
        int j=0;
        int i=0;
        if(i++==++j){
            //i=0 j=1
            System.out.println("True:"+"i="+i +"j="+j);
        }else{
            System.out.println("False:"+"i="+i +"j="+j);
        }
        // x++ = x=x+1;

//++x = x=x+1;
        int x=100;
//Pos -Incremento
//Ele so guarda na variavel o valor depois ... ou seja...
//Para x++
//Primeiro x=100 ;
//Depois ele incrementa : x=100+1;
//Se voce usar dois prints...
        System.out.println("X= "+ x++);
        System.out.println("X= "+ x);


//Pre-Incremento
//Ele incrementa logo de cara a variavel
    }
}

