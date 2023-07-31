package udemy;

public class ObjectsInJava {

    //Object is instance of a class

    //Create a new object with word : new


    //CONSTRUCTOR
    public ObjectsInJava(){
        System.out.println("In Constructor....");

    }

    public void ObjectsInJava(){
        System.out.println("In Method inside Class...");
    }

    public static void main(String[] args) {
        ObjectsInJava obj = new ObjectsInJava();
        obj.ObjectsInJava();
    }

    //IS NOT A GOOD PRACTICE TO HAVE A METHOD NAME == CLASS NAME .
    //ONLY CONSTRUCTOR MUST HAVE A SAME NAME OF A CLASS


    //IF YOU DONT CREATE A CONSTRUCTOR , THE COMPILER WILL CREATE A DEFAULT ONE WITH NO ARGUMENTS


}
