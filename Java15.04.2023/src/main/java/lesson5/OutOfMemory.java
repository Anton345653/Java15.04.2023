package lesson5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class OutOfMemory {
    public static void main(String[] args) throws InterruptedException {
        List<Person> personList = new ArrayList<>();
        List<Object[]> arrays = new LinkedList<>();
        List<String> strings = new LinkedList<>();
        for (int i = 0; i < 1000000; i++) {
            Thread.sleep(1);
            personList.add(new Person(new String("Ivanych"), new String("Ivanych")));
            personList.add(new Person(new String("Ivanych"), new String("Ivanych")));
            personList.add(new Person(new String("Ivanych"), new String("Ivanych")));
            personList.add(new Person(new String("Ivanych"), new String("Ivanych")));
            personList.add(new Person(new String("Ivanych"), new String("Ivanych")));
            //  arrays.add(new Object[100]);
            //  strings.add("Hello");
        }
    }
}
// -Xmx100m -XX:+HeapDumpOnOutOfMemoryError
//закоментил add,так как долго считает retained
//больше всех занимает ArrayList 41%;String 38,6%;Person 37,7%