package udemy.Loops;

public class BreakStatement {
    public static void main(String[] args) {
//            BreakStatement.loopWithBreak();
//            BreakStatement.loopWithBreakname();
            BreakStatement.loopWithoutBreak();
    }
    public static void loopWithBreak(){
        int i,j;
        whiz:for( i=1;i<4;i++){
            j=1;
            while(j<4){
                j++;
                if(j%2==0){
                    break;
                }
                System.out.println("Inner");
            }
            System.out.println("Odd");
        }
    }

    public static void loopWithBreakname() {
        int i, j;
        whiz:
        for (i = 1; i < 4; i++) {
            j = 1;
            while (j < 4) {
                j++;
                if (j % 2 == 0) {
                    break whiz;
                }
                System.out.println("Inner");
            }
            System.out.println("Odd");
        }
    }

        public static void loopWithoutBreak(){
            int i,j;
            whiz:for( i=1;i<4;i++){
                j=1;
                while(j<4){
                    j++;
                    if(j%2==0){
                    }
                    System.out.println("Inner");
                }
                System.out.println("Odd");
            }
}

}
