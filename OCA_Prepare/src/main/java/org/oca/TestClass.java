package org.oca;

import java.io.*;
import java.lang.*;
import java.net.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.logging.*;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class TestClass {
    public static void main(String[] args) throws IOException {
        Files.createDirectories(Paths.get("logs"));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyyMMdd_hhmm");
        LocalDateTime now = LocalDateTime.now();
        String date = now.format(df);
        String logFileName="logs\\testlog-"+date+".txt";
        FileHandler myFileHandler = new FileHandler(logFileName);
        myFileHandler.setFormatter(new SimpleFormatter());
        Logger ocajLogger = Logger.getLogger("OCAJ Logger");
        ocajLogger.setLevel(Level.ALL);
        ocajLogger.addHandler(myFileHandler);
        ocajLogger.info("\n This is a logged information message:");
        myFileHandler.close();
    }
}