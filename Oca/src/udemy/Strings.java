package udemy;

public class Strings {
    public static void main(String[] args) {
        System.out.println(3+8+"AAA");  //11AAA
        System.out.println("AAAA"+3+8);//AAAA38
        System.out.println("John"+ null);//Johnnull
        System.out.println(null+"John");//nullJohn

        String name="John Wayne";
        System.out.println(name.length());//10
        System.out.println(name.charAt(6));//a
        System.out.println(name.indexOf("W"));//5
        System.out.println(name.indexOf("n",5));//8
        System.out.println(name.substring(3));//n Wayne
        //When you are passing two values, the end value will not be included!!! PAY ATTENTION ON THAT!
        System.out.println(name.substring(3,9)); //n Wayn
//        System.out.println(name.substring(9,3));//NOT WORK!!! StringIndexOutOfBoundsExceptions
        System.out.println(name.substring(3,10));// WORK!!!
//        Inside Class String and method substring (The endIndex is == length)
//        if (endIndex > value.length) {
//            throw new StringIndexOutOfBoundsException(endIndex);
//        }
//        System.out.println(name.substring(3,11));//NOT WORK!!! StringIndexOutOfBoundsExceptions Because (EndVale > length)

        System.out.println(name.contains("j")); //False because the method contains is case sensitive
        String str="   asd   ";
    }
}
