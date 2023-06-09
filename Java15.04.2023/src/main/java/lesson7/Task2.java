package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Integer[] array = {1, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));
        List<Integer> list = transformToArrayList(array);
        System.out.println(list);
    }

    public static <T> List<T> transformToArrayList(T[] a) {
        List<T> list = Arrays.asList(a);
        return list;
    }
}
