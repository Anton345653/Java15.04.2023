package lesson1.homework1;

public class Task8 {
    public static void main(String[] args) {
        isLeapYear(400);
    }

    public static void isLeapYear(int a) {
        if (a % 400 == 0) {
            System.out.println(a + " год является високосным");
        } else if (a % 4 == 0 && a % 100 != 0) {
            System.out.println(a + " год является високосным");
        } else {
            System.out.println(a + " год не является високосным");
        }
    }
}
