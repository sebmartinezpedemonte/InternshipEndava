package Factory;

public class ScreenOperation implements Operation{


    @Override
    public void showResult(int a, int b, int result) {
        System.out.println("Screen: " + a + " + " +  b + " = " + result);
    }
}
