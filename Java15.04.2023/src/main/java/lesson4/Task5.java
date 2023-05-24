package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[\\w-.]+@[A-Za-z\\d-]+\\.[A-Za-z]{2,3}");
        Matcher matcher = pattern.matcher("google@gmail.ru");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
