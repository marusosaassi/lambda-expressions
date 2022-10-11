package java8.lambda;

import java8.lambda.models.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

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

        BiConsumer<String, Integer> biConsumer = (name, age) -> System.out.println(name + " is " + age + " years old.");
        biConsumer.accept("Rafa", 26);

        //Consumer<String> consumer2 = message -> System.out.println(message); // simplified;
        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("Hello world lambda");

        List<String> names = Arrays.asList("maru", "rafael", "damian", "vianey", "addy");
        names.forEach(consumer2);

        User user = new User();

        /*BiConsumer<User, String> assignName = (person, name) -> {
            person.setName(name);
        };*/
        //simplifying:
        BiConsumer<User, String> assignName = User::setName;

        assignName.accept(user, "Maru");
        System.out.println("Name of the user: " + user.getName());

        /*Supplier<String> provider = () -> {
            return "hello world";
        };*/

        Supplier<String> provider = () -> "hello world";
        System.out.println(provider.get());

        Supplier<User> createUser = User::new;
        User user2 = createUser.get();
        System.out.println(user2.getName());

     }
}
