package lesson2.dz4;

public class Animal {
    void run (int distance) {
        System.out.println("Животное бежит");
        System.out.println();
    }

    void jump (int height) {
        System.out.println("Животное прыгает");
    }

    void swim () {
        System.out.println("Животное плывет");
    }

    public int limit() {
        return (int) ((Math.random() * 401));
    }


}
