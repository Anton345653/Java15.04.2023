package lesson8;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        TreeMap<String, String> treeMap = new TreeMap<>((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return o1.length() - o2.length();
            } else {
                return o1.compareTo(o2);
            }
        });
        treeMap.put("35", "one");
        treeMap.put("755", "three");
        treeMap.put("2559", "sevenr");
        treeMap.put("2555", "sevenw");
        treeMap.put("25553", "sevenwu");
        for (Map.Entry<String, String> e : treeMap.entrySet()) {
            System.out.println(e.getKey());
        }
    }
}

