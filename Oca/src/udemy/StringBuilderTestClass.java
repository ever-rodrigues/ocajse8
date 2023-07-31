package udemy;
import java.lang.StringBuilder;
public class StringBuilderTestClass {


    public static void main(String[] args) {
        StringBuilder stringBuilder= new StringBuilder("John Wayne");
        System.out.println(stringBuilder.length());//10
        System.out.println(stringBuilder.indexOf("a"));//6
        System.out.println(stringBuilder.substring(5,10));//Wayne
        System.out.println(stringBuilder.append("asds"));//John Wayneasds
//        @Override
//        public StringBuilder append(String str) {
//            super.append(str);
//            return this;
//        }
        System.out.println(stringBuilder); //John Wayneasds
        System.out.println(stringBuilder.delete(5,15));//John
        stringBuilder.insert(5,"-");//John -
        stringBuilder.deleteCharAt(5);
//        @Override
//        public StringBuilder deleteCharAt(int index) {
//            super.deleteCharAt(index);
//            return this;
//        }
        StringBuilder st = new StringBuilder("abcdef");
        st.replace(1,3,"JOHN"); //aJOHNdef
        st.replace(5,10000,"Doe");//aJOHNDoe

        st.substring(2,6);
        //This doesn't change the st value, because not " return this;"
//        public String substring(int start, int end) {
//            if (start < 0)
//                throw new StringIndexOutOfBoundsException(start);
//            if (end > count)
//                throw new StringIndexOutOfBoundsException(end);
//            if (start > end)
//                throw new StringIndexOutOfBoundsException(end - start);
//            return new String(value, start, end - start);
//        }

        //If you want the new value, you must create a new String assign the st.substring value...

    }
}
