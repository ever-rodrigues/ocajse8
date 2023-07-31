package udemy;

public class MyExcepetion extends Exception{

    @Override
    public String getMessage(){
        return "Nao aceita valor maior que permitido!";
    }
}
