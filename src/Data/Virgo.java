package Data;

import java.util.concurrent.TimeUnit;

public class Virgo extends Horoscope{
    public static void virgo() throws InterruptedException {
        System.out.print("A virgo...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("You are a practical, sensible, and loyal person...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Who wouldn't want you working on their coding team?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Your future contains immeasurable happiness.");
        TimeUnit.SECONDS.sleep(2);
    }
}
