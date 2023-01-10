package minichallenge1static;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class  FileWriter {

     private static FileWriter instancia;
     private static String time;
     public FileWriter(){
     }

     public static void writeSomeText(String texto){
          if(instancia == null){
               instancia = new FileWriter();
               time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM//dd HH:mm:ss:nn"));
          }
          System.out.println(texto + " " + time);
     }


}
