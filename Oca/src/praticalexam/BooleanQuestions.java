package praticalexam;

public class BooleanQuestions {
    public static void main(String[] args) {
        boolean a= false;
        boolean b = false;
        boolean c =false;

        boolean d= (a=true)||(b=true)&&(c=true);
        System.out.println(a+""+b+""+c); // True False False
        //Lembre-se que a recebera True, e sendo true , depois com o operador OR, nada devera ser processado, ou seja
        //As variaveis b e c nao sofrerao mudanca de false para true . Apenas se manterao False
        //Printando True false false
    }

}
