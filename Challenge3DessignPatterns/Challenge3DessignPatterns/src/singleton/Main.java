package singleton;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        a.useFileWriter("Writing text to Class A");
        b.useFileWriter("Writing text to Class B");
        c.useFileWriter("Writing text to Class C");

    }
}
