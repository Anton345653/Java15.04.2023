package lesson8.task6;

public class Main {
    public static void main(String[] args) {
        ThreeFunction<Integer, Integer, Integer, Integer> threeFunctionInt = (a, b, c) -> a + b + c;
        int res = threeFunctionInt.foo(1, 2, 3);
        System.out.println(res);

        ThreeFunction<String, String, String, String> threeFunctionString = (s, s2, s3) -> s + s2 + s3;
        String res2 = threeFunctionString.foo("Weather ", "is ", "fine");
        System.out.println(res2);
    }
}
