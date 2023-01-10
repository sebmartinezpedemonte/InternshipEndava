package singleton;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Singleton {

    private static Singleton instance;
    private static String time;
    private String fileName = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            //time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM//dd HH:mm:ss:nn"));
        }
        return instance;
    }

    public void writeSomeText(String text) throws IOException {
        if(fileName == null) {
            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("yyyyMMddhhmmssnn");
            String strDate = dateFormat.format(date);
            fileName = strDate;
        }
        Files.write(Paths.get(fileName),
                (text + System.lineSeparator()).getBytes(),
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND);
    }
}
