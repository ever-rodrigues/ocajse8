package praticalexam;

import udemy.HierOutside.SubOutside;

public class PrecedenceQuestions {
    public static void main(String[] args) {
        //Questao
        System.out.println(3+100/10*2-13 );
        //O Operador de Divisao / tem precedencia sobre o operador de multiplicacao ficando:
        // 3+10*2-13
        // 3+20-13
        // 10
    }
}
