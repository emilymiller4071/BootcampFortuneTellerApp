package UI;

import Business.FortuneTeller;
import Data.Horoscope;

public class FortuneTellerApp {

    public static void main(String[] args) throws InterruptedException {

        FortuneTeller.greeting();
        System.out.println();
        FortuneTeller.isDistractedOK();
        FortuneTeller.tellMeYourName();
        Horoscope.askForZodiacSign();
        FortuneTeller.oneLastThing();

    }

}
