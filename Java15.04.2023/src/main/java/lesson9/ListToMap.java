package lesson9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("book");
        list.add("book from people");
        list.add("cookable");
        list.add("cook");
        list.add("goodbye");
        list.add("pencil");
        Map<String, String> map = list.stream().collect(Collectors.
                groupingBy(a -> a.substring(0, 1), Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparingInt(String::length)),
                        optional -> optional.filter(o -> o.length() <= 10).orElse(null))));
        System.out.println(map);
    }
}
