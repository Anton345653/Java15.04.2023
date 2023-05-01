package lesson1.dz1;

public class Task4 {
    public static void main(String[] args) {
        System.out.println(fuu(2, 8));
    }

    public static boolean fuu(int a, int b) {
        int h = a + b;
        // можно написать проще: return h >= 10 && h <= 20;
        if (h >= 10 && h <= 20)
            return true;
        else
            return false;
    }
}
