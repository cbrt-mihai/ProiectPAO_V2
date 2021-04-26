package service;

import java.io.*;
import java.text.SimpleDateFormat;

public class Logger {
    private static Logger INSTANCE;

    public static Logger getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Logger();
        }

        return INSTANCE;
    }

    public void logThis(String path, String actiune) {
        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(path, true), "utf-8"))) {
            SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            writer.append(actiune + "," + formatter.format(System.currentTimeMillis()) + "\n");
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
