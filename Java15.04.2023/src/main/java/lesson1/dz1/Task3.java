package lesson1.dz1;

public class Task3 {
    public static void main(String[] args) {
        System.out.println(result(1, 2, 3, 4));
    }

    public static int result(int a, int b, int c, int d) {
        int h = a * (b + (c / d));
        // смотри, если ты возвращаешь результат от выражения, ничего с ним не делая,
        // то можно написать всё в одну строку не создавая переменную
        // return a * (b + (c / d));
        return h;
    }
}

