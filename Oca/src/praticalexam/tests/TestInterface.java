package praticalexam.tests;

abstract class TestInterface implements Apple {

    public void growApple(String anApple){
        System.out.println("Apple");
    }
    @Override
    public void grow(){
        System.out.println("AAA");
    }

    @Override
    public void growApple(){
        System.out.println("BBB");
    }
}
