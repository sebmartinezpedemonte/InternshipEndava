package Factory;

public class FileOperationFactory extends OperationFactory{

    @Override
    public void showOperation(int a, int b) {
        FileOperation operation = new FileOperation();
        operation.showResult(a, b, result);
    }
}
