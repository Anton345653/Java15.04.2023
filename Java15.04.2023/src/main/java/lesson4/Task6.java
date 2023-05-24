package lesson4;

import java.util.Formatter;

public class Task6 {
    public static void main(String[] args) {
        double w = 234.45667;
        StringBuilder stringBuilder = new StringBuilder();
        Formatter formatter = new Formatter(stringBuilder);
        formatter.format("$%.3f", w);
        System.out.println(stringBuilder.toString());
    }
}
