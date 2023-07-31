package praticalexam.interfaces;

public class Main implements InterfaceA,InterfaceB{
    public static void main(String[] args) {

        Main main = new Main();
        main.run();
        InterfaceA.print();
    }

    @Override
    public void run() {
        System.out.printf("Run from Concrete Class!");
    }

    //AQUI AS DUAS INTERFACES IMPLEMENTAM O MESMO METODO DEFAUTL!! SE MAIN NAO TIVESSE IMPLEMENTADO E DANDO
    //OVERRIDE NO METODO RUN DARIA ERRO DE COMPILACAO!!!
    //VOCE NAO PODE TER DOIS METODOS IGUAIS EM INTERFACES E IMPLEMENTAR AS DUAS AO MESMO TEMPO!!!
    //PORQUE O COMPILADOR NAO SABERIA QUAL ESCOLHER!!!!!!!!!!!
}
