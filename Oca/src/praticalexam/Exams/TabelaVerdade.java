package praticalexam.Exams;

public class TabelaVerdade {
    public static void main(String[] args) {
        System.out.println("__________&&___________");

        //USING &&
        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&true);
        System.out.println(false&&false);

        System.out.println("__________^______XOR ____EQUALS FALSE!!!_____");
        //USING
        System.out.println(true^true);
        System.out.println(true^false);
        System.out.println(false^true);
        System.out.println(false^false);

        System.out.println("__________||________OR________________");
        //USING
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||true);
        System.out.println(false||false);

        StringBuilder a= new StringBuilder("IZO"); //CAPACITY 19
        System.out.println(a.capacity());
        

    }
}
