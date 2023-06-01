package lesson4.Task12;

public class Main {
    public static void main(String[] args) {
        Printable printable = new PrinterLimitDecorator(new Emulator());
        printable.execute("Привет");
        printable.execute("Пока");
    }
}
