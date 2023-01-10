package Factory;



    public class FileOperation implements Operation{


        @Override
        public void showResult(int a, int b, int result) {
            System.out.println("File: " + a + " + " +  b + " = " + result);
        }
    }


