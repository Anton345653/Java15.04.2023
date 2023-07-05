package lesson7.task3;

public class Orange implements Fruit {
    private final float weight = 1.5f;

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
