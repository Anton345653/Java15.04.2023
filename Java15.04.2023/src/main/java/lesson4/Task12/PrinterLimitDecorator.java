package lesson4.Task12;

import java.util.Random;

public class PrinterLimitDecorator extends PrinterDecorator {
    public PrinterLimitDecorator(Printable printable) {
        super(printable);
    }

    @Override
    public void print(String message) {
        super.print(message);
    }

    @Override
    public void execute(String message) {
        Random random = new Random();
        int millis = random.nextInt(1000);
        for (int i = 0; i < 11; i++) {
            super.execute(message);
            try {
                Thread.sleep(millis);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
