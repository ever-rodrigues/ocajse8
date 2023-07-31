package cap8;

public class UserLoggin implements Logger{

    private String userMessage;
    private long createTimeStamp;

    public UserLoggin() {
        this.userMessage = "User Logged";
        this.createTimeStamp = System.currentTimeMillis();
    }


    @Override
    public String getInformation() {
        return "User Created" +createTimeStamp;
    }

    @Override
    public String getLoggedEvent() {
        return userMessage;
    }

    public void connect(){
        this.userMessage="Connected at " + System.currentTimeMillis();
    }


}
