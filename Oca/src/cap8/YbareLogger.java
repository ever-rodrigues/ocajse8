package cap8;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class YbareLogger {
    private BufferedWriter bufferedWriter;

    public YbareLogger() throws IOException{
        bufferedWriter= new BufferedWriter(new FileWriter("ybareLooger.txt"));
    }

    public void appendToLog(Logger logger) throws IOException{
        bufferedWriter.write("History: " + logger.getInformation());
        bufferedWriter.newLine();
        bufferedWriter.write("Event: "+ logger.getLoggedEvent());
    }

    public void close() throws IOException{
        bufferedWriter.flush();
        bufferedWriter.close();
    }
}

