package cap8;

import java.io.IOException;

public class TesterLogger {
    public static void main(String[] args) throws IOException {
       new TesterLogger();
    }

    public TesterLogger() throws IOException{
        YbareLogger logger= new YbareLogger();
        UserLoggin userLoggin= new UserLoggin();
        BuyService buyService= new BuyService();
        logger.appendToLog(userLoggin);
        logger.appendToLog(buyService);
        buyService.connect();
        userLoggin.connect();
        logger.appendToLog(userLoggin);
        logger.appendToLog(buyService);
        logger.close();

    }
}

