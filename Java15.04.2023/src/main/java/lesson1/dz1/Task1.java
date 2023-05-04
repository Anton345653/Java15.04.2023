package lesson1.dz1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = new int[3];
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.arraycopy(a, 0, b, 0, a.length);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        String color = "green";
        switch (color) {
            case "yellow":
                System.out.println("color is yellow");
                break;
            case "black":
                System.out.println("color is black");
                break;
            case "green":
                System.out.println("color is green");
                break;
            default:
                System.out.println("something wrong");
        }
        byte p = 2;
        short y = 3;
        int c = 1;
        long i = 1234556;
        float e = 1.3f;
        double d = 1.2;
        char f = 'g';
        String g = "pull";
        boolean j = true;
    }

}
