package singleton;


import java.io.IOException;

public class ClassC {
    public void useFileWriter(String text) throws IOException {
       Singleton.getInstance().writeSomeText(text);
    }


}
