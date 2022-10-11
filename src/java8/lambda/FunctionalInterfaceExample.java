package java8.lambda;

import java8.lambda.arithmetic.Arithmetic;
import java8.lambda.arithmetic.Calculator;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        //Arithmetic addition = (a, b) -> a+b;
        Arithmetic addition = Double::sum;
        Arithmetic subtraction = (a,b) -> a-b;

        Calculator calculator = new Calculator();
        System.out.println(calculator.compute(10,5, addition));
        System.out.println(calculator.compute(10,5, subtraction));
        System.out.println(calculator.compute(10,5, (a,b) -> a * b));

        System.out.println(calculator.computeWithBiFunction(10,5, (a,b) -> a+b));
    }
}
