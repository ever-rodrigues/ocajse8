package udemy;

public class SwitchStatements {
    public void test(int a ) {
        switch (a) {
            case 0:
                System.out.println("Hello");
            default:
                System.out.println("Into default values");
            case 1:
                System.out.println("Good morning");
            case 2:
                System.out.println("Welcome");
            case 3:
                System.out.println("Have a Nice Day!");
        }
    }

        public void test2(int b){
            switch (b){
                case 0: case 1:case 2:
                System.out.println("Hello my friend");
//                default:
//                    System.out.println("Its defaulty my friend");
                case 3: case 4:case 5:
                System.out.println("OWWWW");
            }
        }

    public static void main(String[] args) {
        SwitchStatements switchStatements= new SwitchStatements();
//        switchStatements.test(10);
        switchStatements.test2(4);
    }
}
