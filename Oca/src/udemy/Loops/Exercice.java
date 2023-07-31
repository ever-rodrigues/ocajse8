package udemy.Loops;

public class Exercice {
    public static void main(String[] args) {
//        Exercice.forContinue();
        Exercice.loopNotInfine();
        Exercice.loopInfine();
    }

    public static void testBreak(){
        int i=0,j=0;
        while(i<2){
            wi:while(j<2){
            j++;
            }
            if(i+j==2){
                //break wi;//BREAK ITS NOT A BODY OF WI WHILE!!!
            }
            i++;
        }
        System.out.println(j);
    }

    public static void forContinue(){
        a:for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("inside");
                continue a;
            }
        }
    }

    public static void forErrorContinue(){
        for (int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.println("inside");
//                continue 1; //NOT ACCEPTABLE NUMBER AS ARGUMENT WITH CONTINUE!
            }
        }
    }


    public static void loopInfine(){
        for(int i=0;i<4;i++){
            while (true){
                System.out.println(i);
                continue;
            }
        }
    }

    public static void loopNotInfine(){
        for(int i=0;i<4;i++){
            while (true){
                System.out.println(i);
                break;
            }
        }
    }
}
