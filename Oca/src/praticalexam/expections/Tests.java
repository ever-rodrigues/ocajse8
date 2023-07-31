package praticalexam.expections;

public class Tests {
    static int x=10;
    public static void main(String[] args) {
        int x =100;
        //If the numbers here instead of floating-numbers was Interger -> Exception ArithmeticException will thrown
        double a=1,b=0,c=2;
        double mod1=a%b;
        System.out.println(mod1); //NaN
        double mod2=b%c;
        System.out.println(mod2);
        double result= mod1>mod2?mod1:mod2;
        System.out.println(result);

        //NUMEROS FLUTUANTES COMO DOUBLE OU FLOAT PODEM SER DIVIDIDOS POR 0 -> RETORNANDO NaN!!!!
        //Ou seja 0 de ponto flutuante nao e zero bem definido com 0 de Integer!!!



        int y=100;
        System.out.println(x);
        Long i= new Long(10);
        Double d = new Double(10);
        Float f = new Float(10);
        Float g = new Float(1.3);


    }
}
