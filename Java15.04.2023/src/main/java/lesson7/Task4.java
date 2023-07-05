package lesson7;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Task4 {
    private static String[] wordsArray = new String[]{
            null, " ", "One", "Two", "Tree", "Word", "Four", "Ten", "Word", "People", "Cat", "Dog", "City", "Earth", "Word", "Sun", "Apple", "Banana", "Dark", "Green", "Apple", "Word", "Yellow", "Family", "Two", "Street", "Four", "Computer", "Four", "Word", "Dark", "Word", "Dog", "Green", "Dog", "City", "Pen"
    };
    private static Set<String> unique = new HashSet<>(Arrays.asList(wordsArray));
    private static Set<String> countWord = new HashSet<>();

    public static void counterWord(String[] a) {
        for (int i = 0; i < wordsArray.length; i++) {
            if (countWord.contains(wordsArray[i]))
                continue;
            int count = 1;
            for (int j = i + 1; j < wordsArray.length; j++) {
                if (wordsArray[i] == wordsArray[j]) {
                    count++;
                }
            }
            System.out.println(wordsArray[i] + " количество повторений: " + count);
            countWord.add(wordsArray[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println(unique);
        counterWord(wordsArray);

    }

}
