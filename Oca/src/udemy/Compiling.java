package udemy;

public class Compiling {
    public static void main(String[] args) {
        System.out.println("TEste");
    }

    //To compile into src folder:
    //javac udemy/Compiling.java

    //To execute
    //java udemy/Compiling

    //If you need to compile a lot of files use:
    //javac udemy/*.java


        //YOU CANNOT EXECUTE A LOT OF JAVA .class file at SAME TIME!!!!!
    //ERROR!!!!



    //If you use -d "folder" all files compiled it will be stored into "folder" name ;
    //Example:

    //javac -d compiled udemy/Compiling.java
    //For each package the system will create a folder, so it will be :
    //compiled/udemy/Compiling.class



    //Execute the code

//      java -cp compiled udemy.Compiling
//      java -classpath compiled udemy.Compiling
//      java --class-path compiled udemy.Compiling

    //-classpath .:/dir_a/classes_a/:/dir_b/classes_b/
}

