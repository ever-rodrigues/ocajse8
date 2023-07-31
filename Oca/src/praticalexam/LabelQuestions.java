package praticalexam;

public class LabelQuestions {

    public static void main(String[] args) {

        LABEL:
        for(int i=0;i<2;i++){
            System.out.println(i);
            break LABEL;
        }
        //QUEBRA DE DENTRO PRA FORA!!!!

    }
}
