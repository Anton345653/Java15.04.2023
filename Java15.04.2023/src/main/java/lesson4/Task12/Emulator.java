package lesson4.Task12;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Emulator implements Printable {
    private int callCount = 0;
    private ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public void execute(String message) {
        if (callCount >= 10) {
            System.out.println("Вызовов слишком много");
            scheduledExecutorService.shutdown();
            return;
        }
        callCount++;
        scheduledExecutorService.schedule(() -> callCount = 0, 1, TimeUnit.MINUTES);
        print(message);

    }
}
