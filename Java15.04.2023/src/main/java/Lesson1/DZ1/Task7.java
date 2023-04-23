package Lesson1.DZ1;

public class Task7 {
    public static void main(String[] args) {
        fuu("Bob");
    }

    public static void fuu(String name) {
        if(name==null || name.isEmpty()){
            System.out.println("Имя не задано");
        } else {
            System.out.println("Привет, " + name);
        }
    }
}
