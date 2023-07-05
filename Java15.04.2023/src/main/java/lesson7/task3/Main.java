package lesson7.task3;

public class Main {
    public static void main(String[] args) {
        Box oranges = new Box();
        for (int i = 0; i < 12; i++) {
            oranges.add(new Orange());
        }
        System.out.println(oranges.getWeight());
        Box oranges2 = new Box();
        for (int i = 0; i < 12; i++) {
            oranges2.add(new Orange());
        }
        System.out.println(oranges2.getWeight());
        oranges.putInOtherBox(oranges2);
        System.out.println(oranges.getWeight());
        System.out.println(oranges2.getWeight());
        Box apple = new Box();
        for (int i = 0; i < 12; i++) {
            apple.add(new Apple());
        }
        System.out.println(apple.compare(oranges2));
        apple.putInOtherBox(oranges2);
    }
}
