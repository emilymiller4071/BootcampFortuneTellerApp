package Business;

import Data.Person;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FortuneTeller {


    //greeting
    public static void greeting() throws InterruptedException {
        LocalDate currentDate = LocalDate.now();
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Bootcamp Fortune Telling Experience!");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("What brings you here today?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("1 [I want to hear my fortune]");
        System.out.println("2 [I was forced into it by my teacher]");
        System.out.println("3 [I always consult with the mystical forces on a " + dayOfWeek + ".");
        System.out.println();
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Enter your response (1/2/3): ");
        String response1 = scanner.nextLine();
        boolean isValid = false;

        while (!isValid) {

                switch (response1) {
                    case "1":
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println();
                        System.out.print("Ah, a curious soul.");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("I hope you get the answers you seek!");
                        TimeUnit.SECONDS.sleep(1);
                        isValid = true;
                        break;
                    case "2":
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println();
                        System.out.println("Your teacher must be wise to send you to me.");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("I'm a little concerned that you didn't arrive on your own...");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Hopefully it won't interfere with my gift.");
                        TimeUnit.SECONDS.sleep(1);
                        isValid = true;
                        break;
                    case "3":
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println();
                        System.out.println("Well, that's a little weird, but who am I to judge?");
                        isValid = true;
                        break;
                    default:
                        System.out.println();
                        System.out.print("That wasn't really a choice. Interesting...");
                        TimeUnit.SECONDS.sleep(2);
                        System.out.println("Please enter a valid response: ");
                        response1 = scanner.nextLine();
                }

            }
        }


    public static void isDistractedOK() throws InterruptedException {

        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("I should warn you...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I get a bit distracted sometimes.");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Is that ok (yes / no): ");
        Scanner scanner = new Scanner(System.in);
        String response2 = scanner.nextLine();


        if (response2.equalsIgnoreCase("yes")) {
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            System.out.print("Good.");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("I've been doing this for a long time.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("I don't know how it works...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("I drink coffee and I know things.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("I should probably get your name...");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("For this to work, I need your complete honesty.");
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Otherwise I'd be looking into someone else's future...");
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
        } else if (response2.equalsIgnoreCase("no")) {
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            System.out.print("Well, I never. You're quite rude... ");
            System.out.println();
            TimeUnit.SECONDS.sleep(2);
        } else {
            System.out.println();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("You don't listen very well...I said to enter yes or no. Try again: ");
            response2 = scanner.nextLine();
            TimeUnit.SECONDS.sleep(1);

        }

    }

    public static void tellMeYourName() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please tell me your name: ");
        String name = scanner.nextLine();
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Glad to meet you, " + name + "!");
        TimeUnit.SECONDS.sleep(1);
        System.out.println();

        if (name.equalsIgnoreCase("kait")) {
            Person.kait();
        } else if (name.equalsIgnoreCase("emily")) {
            Person.emily();
        } else if (name.equalsIgnoreCase("amy")) {
            Person.amy();
        } else if (name.equalsIgnoreCase("casey")) {
            Person.casey();
        } else if (name.equalsIgnoreCase("trent")) {
            Person.trent();
        } else if (name.equalsIgnoreCase("steven")) {
            Person.steven();
        }else if (name.equalsIgnoreCase("james")) {
            Person.james();
        }else if (name.equalsIgnoreCase("jacob")){
            Person.jacob();
        }else if (name.equalsIgnoreCase("Ike")) {
            Person.ike();
        }else if (name.equalsIgnoreCase("Ikenna")) {
            Person.ike();
        }else if (name.equalsIgnoreCase("Ted")){
            Person.ted();
        }else {
            Person.stranger();
        }

    }

    public static void oneLastThing() throws InterruptedException {

        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Would you look at that...our time is up for today.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I'm so glad that we could meet today.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Before you go, I do have one last thing to tell you...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Pay close attention, because this is important.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("To achieve all your goals, all you need to do is...");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Wait...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("why is my screen dimming...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("No! I forgot my charger...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Ok, to be successful you just need to");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("*** service has been terminated, come again ***");

    }
}

