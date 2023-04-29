package lesson1.dz2;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] a=new int[8];
        int j=0;
        for (int i=0;i<a.length;i++) {
            a[i]=j;
            j+=3;
        }
        System.out.println(Arrays.toString(a));
    }
}
