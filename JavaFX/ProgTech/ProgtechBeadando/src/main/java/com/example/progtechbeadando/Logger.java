package com.example.progtechbeadando;
import java.io.*;
import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

public class Logger {

    static public void Log(String tipe, String comment){
        try {
            File file = new File("log.txt");

            String log = "";

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine())
            {
                if (scanner.nextLine().toString() != "")
                log =  log + "\n" + scanner.nextLine().toString();
            }

            FileWriter fileWriter = new FileWriter(file);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            Date date = new Date();

            log = log + "\n" + date + "; " + tipe + "; " + comment;

            printWriter.println(log);

            printWriter.close();
        }
        catch (Exception e){}
    }

}
