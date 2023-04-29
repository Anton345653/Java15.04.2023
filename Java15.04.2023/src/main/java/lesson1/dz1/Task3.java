package lesson1.dz1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(result(1, 2, 3, 4));
    }

    public static int result(int a, int b, int c, int d) {
        int h = a * (b + (c / d));
        return h;
    }
}

