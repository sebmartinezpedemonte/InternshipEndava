package minichallenge1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileWriter {

    private static FileWriter instancia;
    private static String time;

    private FileWriter() {
    }

    public static FileWriter getInstance() {
        if (instancia == null) {
            instancia = new FileWriter();
            time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM//dd HH:mm:ss:nn"));
        }
        return instancia;
    }

    public void writeSomeText(String texto) {
        System.out.println(texto + " " + time);
    }
}
