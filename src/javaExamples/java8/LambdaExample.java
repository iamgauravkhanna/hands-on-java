package javaExamples.java8;

public class LambdaExample {

     interface MathOperation{
        int operation(int a, int b);
    }

    int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }

    public static void main(String args[]){

        LambdaExample lambdaExample = new LambdaExample();

        // with type declaration
        MathOperation mathOperation1 = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation mathOperation2 = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation mathOperation3 = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation mathOperation4 = (int a, int b) -> a / b;

        System.out.println(lambdaExample.operate(5,5,mathOperation1));
        System.out.println(lambdaExample.operate(5,5,mathOperation2));
        System.out.println(lambdaExample.operate(5,5,mathOperation3));
        System.out.println(lambdaExample.operate(5,5,mathOperation4));
    }
}
