package Data;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static Data.Aquarius.aquarius;
import static Data.Aries.aries;
import static Data.Capricorn.capricorn;
import static Data.Gemini.gemini;
import static Data.Leo.leo;
import static Data.Libra.libra;
import static Data.Pisces.pisces;
import static Data.Sagittarius.sagittarius;
import static Data.Scorpio.scorpio;
import static Data.Taurus.taurus;
import static Data.Virgo.virgo;

public class Horoscope {
    String horoscope;
    String zodiac;

    public static void askForZodiacSign() throws InterruptedException {
        System.out.print("I'm having some trouble...would you mind telling me your zodiac sign?: ");
        Scanner scanner = new Scanner(System.in);
        String zodiac = scanner.nextLine();

        while(true){
            if (zodiac.isBlank()){
                System.out.println("Well, that's not really a valid answer, now is it...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Not much to work with at all...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Let me see...");
                TimeUnit.SECONDS.sleep(2);
                Horoscope horoscope = new Horoscope();
                horoscope.fortune();
                break;
            } else if(zodiac.equalsIgnoreCase("sagittarius")){
                Horoscope sagittarius = new Horoscope();
                sagittarius();
                break;
            }else if (zodiac.equalsIgnoreCase("capricorn")){
                Horoscope capricorn = new Horoscope();
                capricorn();
                break;
            }else if (zodiac.equalsIgnoreCase("aquarius")) {
                aquarius();
                break;
            }else if (zodiac.equalsIgnoreCase("virgo")){
                virgo();
                break;
            }else if (zodiac.equalsIgnoreCase("libra")) {
                libra();
                break;
            }else if (zodiac.equalsIgnoreCase("aries")) {
                aries();
                break;
            }else if (zodiac.equalsIgnoreCase("scorpio")) {
                scorpio();
                break;
            }else if (zodiac.equalsIgnoreCase("taurus")) {
                taurus();
                break;
            }else if (zodiac.equalsIgnoreCase("pisces")) {
                pisces();
                break;
            }else if (zodiac.equalsIgnoreCase("gemini")) {
                gemini();
                break;
            }else if (zodiac.equalsIgnoreCase("leo")) {

                break;
            }else if (zodiac.equalsIgnoreCase("cancer")) {
                leo();
                break;
            }else {
                System.out.println("Are you sure you typed that correctly?...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Check your spelling, and let's try that again...");
                TimeUnit.SECONDS.sleep(1);
                zodiac = scanner.nextLine();
            }
        }
    }

    void fortune() throws InterruptedException {
        System.out.println("Your future is hazy...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("All good things...All good things...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I wish that I could tell you more...I'm just too distracted today.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Be sure to come again...maybe on a different day?");
    }
}
