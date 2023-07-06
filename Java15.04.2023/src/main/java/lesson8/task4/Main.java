package lesson8.task4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Igor", 25));
        personList.add(new Person("Anton", 27));
        personList.add(new Person("Oleg", 56));
        personList.add(new Person("Andrey", 30));
        personList.add(new Person("Ilya", 17));

        Comparator<Person> comparatorByName = (o1, o2) -> {
            if (o1.getName().length() > o2.getName().length()) {
                return -1;
            } else if (o1.getName().length() < o2.getName().length()) {
                return 1;
            } else return 0;

        };
        Comparator<Person> comparatorByAge = (o1, o2) -> {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else if (o1.getAge() < o2.getAge()) {
                return -1;
            } else {
                return 0;
            }
        };
        Collections.sort(personList, comparatorByAge);
        System.out.println("Sort by age");
        personList.forEach(System.out::println);


        Collections.sort(personList, comparatorByName);
        System.out.println("Sort by name");
        personList.forEach(System.out::println);
    }
}
