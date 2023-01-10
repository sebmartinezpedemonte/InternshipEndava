package Factory;

public class ScreenOperationFactory extends OperationFactory{


    @Override
    public void showOperation(int a, int b) {
        ScreenOperation operation = new ScreenOperation();
        operation.showResult(a, b, result);
    }
}
