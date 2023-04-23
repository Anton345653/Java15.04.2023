package Lesson1.DZ1;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3};
        int[] B = new int[3];
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));
        System.arraycopy(A, 0, B, 0, A.length);
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

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
        byte a = 2;
        short b = 3;
        int c = 1;
        long i = 1234556;
        float e = 1.3f;
        double d = 1.2;
        char f = 'g';
        String g = "pull";
        boolean j = true;
    }

}
