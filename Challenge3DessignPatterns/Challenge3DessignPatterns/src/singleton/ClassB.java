package singleton;

import java.io.IOException;

public class ClassB {
    public void useFileWriter(String text) throws IOException {
        Singleton b = Singleton.getInstance();
        b.writeSomeText(text);
    }
}
