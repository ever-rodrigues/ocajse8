package cap8.Coersao;

public class FatherTest {
    public static void main(String[] args) {
        Father father= new Father();
        System.out.println(father.whoIAm());

        Sun sun = new Sun();
        System.out.println(sun.whoIAm());
        System.out.println(sun.onlySun());

        Father sun2= new Sun();
        System.out.println(sun2.whoIAm());

        //COERSAO
        Sun sun3=(Sun) sun2;
        System.out.println(sun.whoIAm());
        System.out.println(sun3.onlySun());


        //VOCE NAO CONSEGUE FAZER COERSAO DE UM PAI PARA UM FILHO!!!!
        Sun father2= (Sun) father;
    }
}
