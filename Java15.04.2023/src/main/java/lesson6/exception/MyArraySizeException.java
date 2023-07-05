package lesson6.exception;

public class MyArraySizeException extends IllegalArgumentException {
    public MyArraySizeException(String s) {
        super(s);
    }
}
