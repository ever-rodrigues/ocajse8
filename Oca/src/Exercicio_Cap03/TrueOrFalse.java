package Exercicio_Cap03;

public class TrueOrFalse {
    public static void main(String[] args) {
        boolean value1=true;
        boolean value2 = false;

        System.out.println(!(value1 & !value2));
        //false;
        System.out.println(!(value1 | !value2));
        //false;
        System.out.println(!(value1 ^ !value2));
        //
    }
}


//        AND
//        false & false = false
//        false & true  = false
//        true  & false = false
//        true  & true  = true
//
//        OR
//        false | false = false
//        false | true  = true
//        true  | false = true
//        true  | true  = true
//
//        XOR
//        false ^ false = false
//        false ^ true  = true
//        true  ^ false = true
//        true  ^ true  = false

//Ou exclusivo ou disjunção exclusiva é uma operação lógica
// entre dois operandos que resulta em um valor lógico verdadeiro se e somente se os dois operandos forem diferentes