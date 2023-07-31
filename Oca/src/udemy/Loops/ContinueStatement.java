package udemy.Loops;

public class ContinueStatement {
    public static void loopWithContinue(){
        int i,j;
        whiz:for( i=1;i<4;i++){
            j=1;
            while(j<4){
                j++;
                if(j%2==0){
                    continue;
                }
                System.out.println("Inner");
            }
            System.out.println("Odd");
        }
    }

    public static void loopWithContinuename(){
        int i,j;
        whiz:for( i=1;i<4;i++){
            j=1;
            System.out.println(j);
            while(j<4){
                j++;
                if(j%2==0){
                    continue whiz;
                }
                System.out.println("Inner");
            }
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        ContinueStatement.loopWithContinue();
//        System.out.println("____________________");
//        ContinueStatement.loopWithContinuename();
    }
}
