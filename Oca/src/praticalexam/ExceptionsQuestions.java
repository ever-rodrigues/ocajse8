package praticalexam;

public class ExceptionsQuestions {

    //A catch for a SUBCLASS exception should occur before a catch of SUPERCLASS!
//    Ex:
//    try {
//        throw new IOException();
//    } catch (Exception e) {
//        System.out.println("Exception");
//    }
//      catch (IOException e) {
//          System.out.println("IOException");
//    }

    //Veja que no codigo acima a SuperClasse esta na frente da SubClasse, e isso esta ERRADO!!!


    //CUIDADO COM O CLASSRUNTIMEEXCEPTION
    //QUANDO TENTAR CONVERTER UMA SUPERCLASS EM UMA SUBCLASS!
    //OU SEJA VOCE NAO PODE FAZER UM PAI A PARTIR DO FILHO! E SIM UM FILHO A PARTIR DO PAI
    //EX SuperClass a = new SubClass b;
    //SubClass c = new SuperClass ; ERRADO!!!!!!


    //After the exception is handled and the try block expired, local variables are lost in the try block


    //EXCEPTION HANDLING!!!
    //DIT-AO

    //➤ Division by zero
    //➤ Invalid parameters
    //➤ Thread interruption
    //➤ Arithmetic overflow
    //➤ Out of range array indexes.


    //Exception handling is not used for asynchronous events like:
    //MDN
    //Mouse clicks
    //Disk I/O
    //Network Message Arrivals



//    Checked Exceptions:
//      a) Are thrown by errors inside the code
//      c) Caused by the Throwable class and all user-defined subclasses of Throwable
//      d) IOException and all its subclasses.

    //Exception class and all user-defined subclasses of Throwable must explicitly
    // specify in a try catch block or throws clause


    //IndexOutOfBoundsException is thrown to indicate that an
    // index of some sort (e.g. array String or Vector) is out of range.

    //➤ ArrayIndexOutOfBoundsException is thrown to indicates that array
    // has been accessed with a illegal index. For example:

    //StackOverFlowException
    //A recursive method call to itself, which doesn't stop, will eventually cause a StackOveflowException.

    //A recursive call that never ends, results in the top of the stack keep colliding with the
    // bottom of the stack keep which results in a StackOveflowException.


    //SuperClass must have the Height Exception Class

//    Throwable
//        ↑
//        extends
//        ↑
//    Exception
//        ↑
//        extends
//        ↑
//    IOException
//        ↑
//        extends
//        ↑
//    FileNotFoundException


    //Subclass constructors can only throw the original exception
    // and/or a superclass of the original Exception (in this case Exception and/or Throwable).


//    TEERIIII-CAN
//      ➤ Throwable (checked exception) - must be wrapped in a try catch block or throws clause
//      ➤ Exception (checked exception) extends Throwable - must be wrapped in a try catch block or throws clause
//      ➤ Error (unchecked exception) extends Throwable - thrown by Java virtual machine JVM
//      ➤ RuntimeException (unchecked exception) extends Exception - thrown by Java virtual machine JVM
//      ➤ IllegalArgumentsException (unchecked exception) extends RuntimeException - thrown by JVM e.g. parameter passed to methods not valid
//      ➤ IndexOutOfBoundsException (unchecked exception) extends RuntimeException - thrown by JVM e.g. Array String Vector
//      ➤ IllegalStateException (unchecked exception) extends RuntimeException - thrown by JVM e.g. a method called at an illegal time
//      ➤ IOException (checked exception) extends Exception - must be wrapped in a try catch block or throws clause
//      ➤ ClassCastException (unchecked exception) extends RuntimeException - thrown by JVM e.g. Object x = new Integer(0); (String) x
//      ➤ ArithmeticException (unchecked exception) extends RuntimeException - thrown by JVM e.g. 1/0
//      ➤ NullPointerException (unchecked exception) extends RuntimeException - thrown by JVM e.g. String s; s.isEmpty();




//    ERROR EXCEPTIONS

//    • StackOverflowError
//    • ExceptionInInitializerError
//    • AssertionError
//    • NoClassDefFoundError
//    • OutOfMemoryError


    //When exceptions are thrown in a static initialization block they must be wrapped
    // in a try catch block otherwise it causes a compiler error.
        //SOLUTION TO NOT COMPILE ERROR! USE TRY CATCH!!!
//    public class B extends Exception {
//        static {
//            try {
//                throw new Exception();
//            }catch (Exception e) {}
//        } }

}
