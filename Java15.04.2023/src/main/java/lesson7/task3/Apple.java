package lesson7.task3;

public class Apple implements Fruit {
    private final float weight = 1.0f;

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
