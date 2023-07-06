package lesson8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }
        addToBegin(arrayList); //быстрее LinkedList
        addToBegin(linkedList);

        addToEnd(arrayList);  //быстрее LinkedList
        addToEnd(linkedList);

        addToMiddle(arrayList); //быстрее ArrayList
        addToMiddle(linkedList);

        get(arrayList);       //быстрее ArrayList
        get(linkedList);

    }

    public static void addToBegin(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(0, 5);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void addToEnd(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(5);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void addToMiddle(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list.add(list.size() / 2, 5);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    public static void get(List list) {
        long start = System.currentTimeMillis();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            list.get(random.nextInt(list.size()));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }

}


