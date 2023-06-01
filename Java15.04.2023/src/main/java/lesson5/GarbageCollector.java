package lesson5;

public class GarbageCollector {
    public static void main(String[] args) throws InterruptedException {
        Person person1;
        Person person2;
        Person person3;
        for (int i = 0; i < 10000000; i++) {
            Thread.sleep(10);
            person1 = new Person(new String("Ivan"), new String("Popov"));
            person2 = new Person("Egor", "Petrov");
            person3 = new Person("Olga", "Ivanova");
            person1 = person2;
            person2 = person3;
            person3 = null;
        }
    }
}

