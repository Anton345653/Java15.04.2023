package lesson1.dz1;

public class Task7 {
    public static void main(String[] args) {
        fuu("Bob");
    }

    public static void fuu(String name) { // тогда уж foo :) старайся давать методам осмысленное название, например, printName(String name)
        if(name==null || name.isEmpty()){ // Есть волшебная комбинация клавиш в Идее ctrl + alt + l, она за тебя отступы поставит
            System.out.println("Имя не задано");
        } else {
            System.out.println("Привет, " + name);
        }
    }
}
