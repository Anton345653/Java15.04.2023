package lesson7.task5;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Oleg", "123");
        phoneBook.add("Ivan", "768");
        phoneBook.add("Egor", "111");
        phoneBook.get("Ivan");
    }
}
