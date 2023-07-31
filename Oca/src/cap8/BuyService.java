package cap8;

public class BuyService implements Logger{
    private String buyMessage;
    private long createTimeStamp;

    public BuyService() {
        this.buyMessage = "Buy Process";
        this.createTimeStamp = System.currentTimeMillis();
    }


    @Override
    public String getInformation() {
        return "Buy action " +createTimeStamp;
    }

    @Override
    public String getLoggedEvent() {
        return buyMessage;
    }

    public void connect(){
        this.buyMessage="Connected at " + System.currentTimeMillis();
    }
}
