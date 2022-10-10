package java8.lambda;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {

        // Consumer<String> consumer = greeting -> System.out.println(greeting);
        /* Consumer is a lambda expression that allows us to pass one parameter alone as argument */
        /* Inside this arrow we can do something with the argument we are passing */
        /* This method is void, it doesn't return anything */

        Consumer<Date> consumer = date -> {
            SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(d.format(date));
        };
        consumer.accept(new Date());

        BiConsumer<String, Integer> biConsumer = (name, age) -> {
            System.out.println(name + " is " + age + " years old.");
        };
        biConsumer.accept("Rafa", 26);
    }
}
