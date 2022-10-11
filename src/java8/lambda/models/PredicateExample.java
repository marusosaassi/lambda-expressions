package java8.lambda.models;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> test = num -> num > 10;
        // Predicate return is always boolean, so there is no need to specify the return type
        boolean r = test.test(11);
        System.out.println("r = " + r);

        Predicate<String> t2 = role -> role.equals("ROLE_ADMIN");
        System.out.println(t2.test("ROLE_ADMIN"));

        //BiPredicate<String, String> t3 = (a,b) -> a.equals(b);
        BiPredicate<String, String> t3 = String::equals;
        System.out.println(t3.test("ROLE_ADMIN", "ROLE_TESTER"));

        BiPredicate<Integer, Integer> t4 = (i,j) -> j > i;
        boolean r2 = t4.test(1,2);
        System.out.println(r2);

        User a = new User();
        User b = new User();
        a.setName("Natalia");
        b.setName("Felix");

        BiPredicate<User, User> f5 = (ua, ub) -> ua.getName().equals(ub.getName());
        System.out.println(f5.test(a,b));
    }
}
