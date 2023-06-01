package lesson4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("<.+?>", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("<p>Hello <code>Everybody</code> nice to meet u \" +\n" +
                "            \"Hope to see u soon.</p>");
        List<String> list = new ArrayList<>();
        while (matcher.find()) {
            String i = matcher.group();
            list.add(i);
        }
        System.out.println(list);
        // pattern.matcher(s).results().map(mr->mr.group(1)).forEach(System.out::println);
    }
}
