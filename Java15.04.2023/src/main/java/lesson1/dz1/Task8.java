package lesson1.dz1;

public class Task8 {
    public static void main(String[] args) {
        leapYear(400);
    }

    public static void leapYear(int a) {
        if (a % 400 == 0) {
            System.out.println(a + " год является високосным");
        } else if (a % 4 == 0 && a % 100 != 0) {
            System.out.println(a + " год является високосным");
        } else {
            System.out.println(a + " год не является високосным");
        }
    }
}
