package lesson8.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class FunctionalInterface {
    public static void main(String[] args) {
        //Predicate
        Predicate<Integer> predicate = x -> x % 2 == 0;
        System.out.println(predicate.test(4));
        //Consumer
        Consumer<String> consumer = x -> System.out.println("Hello " + x + "!!!");
        consumer.accept("Anton");
        //Supplier
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        Supplier<Integer> supplier = () -> {
            int value = (int) (Math.random() * arrayList.size());
            return arrayList.get(value);
        };
        System.out.println(supplier.get());
        //Functional
        Function<String, Integer> function = x -> Integer.valueOf(x);
        System.out.println(function.apply("876"));
        //UnaryOperator
        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(5));

        MyFunctionalInterface<String> myFunctionalInterface = x -> System.out.println("Hello " + x);
        myFunctionalInterface.foo("Bob");
        //MyFunctionalInterface
        MyFunctionalInterface<String> myFunctionalInterface1 = new MyFunctionalInterface<String>() {
            @Override
            public void foo(String s) {
                System.out.println("Hello 2 " + s);
            }
        };
        myFunctionalInterface1.foo("Oleg");


    }
}
