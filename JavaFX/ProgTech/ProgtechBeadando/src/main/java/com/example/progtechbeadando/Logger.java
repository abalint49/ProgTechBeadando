package com.example.progtechbeadando;
import java.io.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;

public class Logger {

    static public void Log(String tipe, String comment) throws IOException {
        File file = new File("log.txt");
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        Date date = new Date();

        String log = date + "; " + tipe + "; " + comment;

        printWriter.println(log);

        printWriter.close();
    }

}
