package Factory;

public abstract class OperationFactory {
    protected int result;
    public void Operate(int a , int b){
        result = a + b;
        showOperation(a, b);
    }

    public abstract void showOperation(int a, int b);


}
