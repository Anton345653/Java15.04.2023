package lesson7.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box() {
        this.fruits = new ArrayList<T>();
    }

    public Box(T... f) {
        this.fruits = (ArrayList<T>) Arrays.asList(f);
    }

    public void add(T fruit) {
        this.fruits.add(fruit);
    }

    public float getWeight() {
        return fruits.get(0).getWeight() * fruits.size();
    }

    public boolean compare(Box<? extends Fruit> box) {
        return this.getWeight() == box.getWeight();
    }

    public void move(Box<T> box) {
        this.fruits.addAll(box.fruits);
        box.fruits.clear();
    }

}
