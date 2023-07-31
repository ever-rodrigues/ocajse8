package cap02;

import java.util.Random;

public class SwitchCase {
    public static void main(String[] args) {
    String randomFish ;
        Random rand= new Random();
        int randomNumber = rand.nextInt(4);
        switch (randomNumber){
            case 1:
                randomFish="aaaa";
                break;
            case 2:
                randomFish="bbbb";
                break;
            case 3:
                randomFish="cccc";
                break;
            case 4:
                randomFish="dddd";
                break;
            default:
                randomFish="ANA";
                break;
        }

    }
}
