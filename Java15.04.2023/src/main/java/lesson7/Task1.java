package lesson7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        String[] strings = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(strings));
        changeElement(strings);
        System.out.println(Arrays.toString(strings));
    }

    public static void changeElement(String[] a) {
        String n = a[0];
        a[0] = a[1];
        a[1] = n;
    }
}
