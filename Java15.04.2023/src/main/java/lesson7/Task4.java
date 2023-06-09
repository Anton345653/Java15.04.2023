package lesson7;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    private static String[] wordsArray = new String[]{
            null, " ", "One", "Two", "Tree", "Word", "Four", "Ten", "Word", "People", "Cat", "Dog", "City", "Earth", "Word", "Sun", "Apple", "Banana", "Dark", "Green", "Apple", "Word", "Yellow", "Family", "Two", "Street", "Four", "Computer", "Four", "Word", "Dark", "Word", "Dog", "Green", "Dog", "City", "Pen"
    };
    private static Set<String> unique = new HashSet<>(Arrays.asList(wordsArray));

    public static void counterWord(String[] a) {
        int counter = 0;
        for (String s : a) {
            if (!unique.add(s)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        System.out.println(unique);
        counterWord(wordsArray);

    }

}
