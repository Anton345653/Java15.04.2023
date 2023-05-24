package lesson4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        Pattern pattern=Pattern.compile("^[a-z]+_[a-z]+");
        Matcher matcher=pattern.matcher("first_java");
        boolean matchFound=matcher.find();
        if(matchFound){
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }
    }
}
