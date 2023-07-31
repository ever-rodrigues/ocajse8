package udemy.Objs;

public class Test {
    int value;

    Test(int value){
        this.value=value;
    }
    static void increaseValue(int value, Test test){
        value++;
        test.value++;
    }
    public static void main(String[] args) {
        int value =0;
        Test test = new Test(0);
        Test.increaseValue(value,test);
        System.out.println(value+" "+ test.value);
    }
}
