package lesson1.dz2;

public class Task5 {
    public static void main(String[] args) {
        int[] a = {4, 6, 8, 1};
        int min = a[0];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            } else if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
