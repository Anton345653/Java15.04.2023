package lesson3;

public class MaskString {
    public static void main(String[] args) {
        int intValue = 123;
        String s = String.format("%08d", intValue);
        System.out.println(s);
    }
}
