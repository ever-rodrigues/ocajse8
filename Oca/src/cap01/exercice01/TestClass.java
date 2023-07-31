package cap01.exercice01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class TestClass {
    public static void main(String[] args) throws IOException {

        final String defaultFormatter="yyyyMMdd";
        Files.createDirectories(Paths.get("logs"));
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(defaultFormatter);
        String date= now.format(formatter);
        System.out.println(date);
        String logFileName = "logs\\testlog-" + date+ ".txt";

        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger ocaLogger = Logger.getLogger("OCAJ Logger");
        ocaLogger.setLevel(Level.ALL);
        ocaLogger.addHandler(myFileHandler);
        ocaLogger.info("\n This is a logger information message");
        myFileHandler.close();
    }
}
