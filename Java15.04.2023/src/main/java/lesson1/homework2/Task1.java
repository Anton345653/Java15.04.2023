package lesson1.homework2;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {1, 1, 1, 0, 1, 0, 0,};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else if (a[i] == 1) {
                a[i] = 0;
            }

        }
        System.out.println(Arrays.toString(a));
    }
}
