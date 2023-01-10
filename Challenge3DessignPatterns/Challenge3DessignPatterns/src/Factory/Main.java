package Factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Do you want to print the operation in a file or through screen?");
        System.out.println("1 for file, 2 for screen");

        Scanner sc = new Scanner(System.in);
        String option = sc.nextLine();
        OperationFactory factory = null;
        if("1".equals(option)){
            factory = new FileOperationFactory();
        }else{
            factory = new ScreenOperationFactory();
        }

        factory.Operate(2,4);
    }
}
