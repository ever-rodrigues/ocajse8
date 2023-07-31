package udemy;

public class Primitives {
    public static void main(String[] args) {
        //WILL NOT COMPILE ->  float x = 2.5;
        float y=2.4f;

        //LONG Require l at end
       // long c = 23143432434343; //NOT COMPILE
        long a = 23143432L; //OK



    }

    //SUPPORTED DIGITAL FORMATS:

    //base 10( digits 0-9) "normal" numbers

    //octal (digits 0-7)  -> uses 0 as a prefix (e.g 017)

    //hexadecimal (Digits 0-9 and letters A-F /a-f) uses 0x or 0X as a prefix
        //format is case insensitive ( 0xFF , 0XFF...)

    //binary (digits 0 and 1 ) uses 0b, or 0B as prefix (ob10, 0B11, etc...)



    //For readability the use of underscore (_) is allowed!!!
    int aaa = 1_000_000;
    int bbb = 1_2;

    //BUT NOT IN THE BEGGINING!!!
  //  int cc=_11220_222; NOT COMPILING !!!!

}
