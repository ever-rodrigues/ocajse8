package cap09;

public class testException extends  Exception{

    public testException(){
        super();
    }

    public testException(String message){
        super(message);
    }
}

// Classes que herdam Exception , devem ter no Nome Exception.
//Exemplos : SQLException , NumberFormatException... etc


// Classes que herdam Errorx , devem ter no Nome Error.
//Exemplos : VirtualMachineError , OutOfMemoryError... etc
