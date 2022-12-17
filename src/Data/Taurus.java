package Data;

import java.util.concurrent.TimeUnit;

public class Taurus extends Horoscope{
    public static void taurus() throws InterruptedException {
        System.out.print("I should have known...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("you do seem like the stubborn sort...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You are also loyal, reliable, and down-to-earth...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Which is why you will be so successful in your new career ventures!");
        TimeUnit.SECONDS.sleep(2);
    }
}
