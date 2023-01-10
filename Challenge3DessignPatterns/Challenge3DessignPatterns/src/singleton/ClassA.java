package singleton;


import java.io.IOException;

public class ClassA {

    public void useFileWriter(String text) throws IOException {
        Singleton a = Singleton.getInstance();
        a.writeSomeText(text);


    }
}
