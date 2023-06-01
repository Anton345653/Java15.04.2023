package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\w+", Pattern.CASE_INSENSITIVE);
        //это проверяет один или несколько раз.а как проверить полностью слово?
        Matcher matcher = pattern.matcher("java_first3");
        boolean matchFound = matcher.find();
        if (matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
