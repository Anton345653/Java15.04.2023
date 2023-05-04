package lesson2.homework3;

public class Employee {
    String name;
    String position;
    String email;
    int numberPhone;
    int salary;
    int age;

    public Employee(String name, String position, String email, int numberPhone, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }

    public void information() {
        System.out.println("Имя: " + name);
        System.out.println("Должность: " + position);
        System.out.println("Эл. почта: " + email);
        System.out.println("Телефон: " + numberPhone);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}


