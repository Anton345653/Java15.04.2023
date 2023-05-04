package lesson1.homework1;

public class Task7 {
    public static void main(String[] args) {
        printName("Bob");
    }

    public static void printName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Имя не задано");
        } else {
            System.out.println("Привет, " + name);
        }
    }
}
