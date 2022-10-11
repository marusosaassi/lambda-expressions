package java8.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        //Function<String, String> f1 = param -> { return "Hello, " + param; };
        Function<String, String> f1 = param -> "Hello, " + param;

        String result = f1.apply("maru");
        System.out.println(result);

        //Function<String, String> f2 = param -> param.toUpperCase();
        Function<String, String> f2 = String::toUpperCase; //what we receive as argument is used to call some method
        System.out.println(f2.apply("rafael"));

        BiFunction<String, String, String> f3 = (a,b) -> a.toUpperCase().concat(b.toUpperCase());
        String r2 = f3.apply("maru", "rafael");
        System.out.println(r2);

        //BiFunction<String, String, Integer> f4 = (a,b) -> a.compareTo(b);
        BiFunction<String, String, Integer> f4 = String::compareTo;
        System.out.println(f4.apply("yuna", "tom"));

        BiFunction<String, String, String> f5 = String::concat;
        System.out.println(f5.apply("lia", "chris"));


    }
}
