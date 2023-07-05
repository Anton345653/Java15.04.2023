package lesson7.task3;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private List<Fruit> fruits = new ArrayList<>();

    public void add(Fruit fruit) {
        if (fruits.size() == 0) {
            fruits.add(fruit);
        } else {
            if (fruits.get(0) instanceof Apple && fruit instanceof Apple) {
                fruits.add(fruit);
            } else if (fruits.get(0) instanceof Orange && fruit instanceof Orange) {
                fruits.add(fruit);
            } else {
                throw new RuntimeException("Box consists of " + fruits.get(0).getClass().getSimpleName() + ". Try to add" + fruit.getClass().getSimpleName());
            }
        }
    }

    public float getWeight() {
        float count = 0;
        for (Fruit f : fruits) {
            count += f.getWeight();
        }
        return count;
    }

    public void putInOtherBox(Box other) {
        for (Fruit f : fruits) {
            other.add(f);
        }
        List<Fruit> empty = new ArrayList<>();
        fruits = empty;
    }

    public boolean compare(Box box) {
        return getWeight() == box.getWeight();
    }
}
