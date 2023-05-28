package lesson4;

public class Food {
    public void prepare(Cookable c, String str) {
        c.cook(str);
    }

    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            void cook(String str) {
                System.out.println("готовь " + str);
            }
        }, "печеньки");
    }
}
