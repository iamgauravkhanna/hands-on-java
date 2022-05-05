package examples.java8;

public class LambdaExample {

    public static void main(String args[]) {

        LambdaExample lambdaExample = new LambdaExample();

        // with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {
            return a * b;
        };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println(operate(5, 1, addition));
        System.out.println(operate(5, 2, subtraction));
        System.out.println(operate(5, 3, multiplication));
        System.out.println(operate(5, 0, division));
    }


    interface MathOperation {
        int operation(int a, int b);
    }

    static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
