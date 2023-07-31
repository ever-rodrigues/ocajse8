package praticalexam;

public class ElseIfQuestions {

    //Se o laco else-if for verdadeiro ele entra no bloco do else-if e depois para de
    // analisar o resto do bloco ! Ou seja se 1 else-if for verdadeiro ele nao le os outros else-if abaixo!!!!

    static String out ="";
    public static void main(String[] args) {
        int x=5,y=8;

        if(x++==5){
            out+="1";
        }if(x!=6){

        } else if (x>9) {
            out+="2";
        } else if (y<9) {
            out+="3";
        }else if(x==6){
            out+="4";
        }else {
            out+="5";
        }
        System.out.println(out); //13
    }

    //ELSE CANNOT HAVE A CONDITIONAL CLAUSE!!!!!!!!
    // else(a<b) {} -> DOSENT EXIST !!!!!!!
    //else{} -> THIS IS RIGHT!!!!
}
