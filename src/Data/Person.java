package Data;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Person {

    public static void kait() throws InterruptedException {
        System.out.println("You have much technical knowledge, but you seem distracted...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Is it Simba or Bandit that is causing the issue:");
        System.out.println("(1) Simba");
        System.out.println("(2) Bandit");
        System.out.println("(3) Both");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Enter 1, 2, or 3: ");
        Scanner scanner = new Scanner(System.in);
        String kaitChoice = scanner.nextLine();

        while (true) {
            if (kaitChoice.equals("1")) {
                System.out.println("What a pretty girl she is, but she's very prone to mischief.");
                TimeUnit.SECONDS.sleep(2);
                System.out.print("You should probably feed her soon...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Anyway...");
                break;
            } else if (kaitChoice.equals("2")) {
                System.out.println("He's probably just looking for some attention...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("GO TO BED, BANDIT!...Anyway...");
                break;
            } else if (kaitChoice.equals("3")) {
                System.out.println("Oh my, it's busy around the apartment today!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("I feel that they can sense how easily distracted you are today.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("By the way, have you watered the plants?");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Anyway...");
                break;
            }else {
                System.out.print("Follow directions!... Please enter 1, 2, or 3: ");
                kaitChoice = scanner.nextLine();
            }
        }
    }

    public static void emily() throws InterruptedException {
        System.out.println("I can sense that you have questions...");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("So. ");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Many. ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Questions.");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Try to control yourself.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Maybe only four questions per class?");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("Just a thought...");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Do you have questions now? (yes / no): ");
        Scanner scanner = new Scanner(System.in);
        String emilyChoice = scanner.nextLine();

        while (true) {
            if (emilyChoice.equalsIgnoreCase("yes")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Why am I not surprised?");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Keep it to yourself, there isn't time for questions now.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("I have to clear the burden of your future from my mind...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Anyway...");
                break;
            } else if (emilyChoice.equalsIgnoreCase("no")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.print("Alright...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("I see that we are starting out with a little dishonesty...");
                TimeUnit.SECONDS.sleep(2);
                System.out.print("Don't worry,");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("even your hidden questions will be answered...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Anyway...");
                TimeUnit.SECONDS.sleep(2);
                break;
            } else {
                System.out.print("Listen! I said to enter yes or no:  ");
                emilyChoice = scanner.nextLine();
            }
        }
    }

    public static void amy() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I do hope that your son is feeling better.");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Is he better? (yes / no): ");
        Scanner scanner = new Scanner(System.in);
        String amyChoice = scanner.nextLine();

        while (true) {
            if (amyChoice.equalsIgnoreCase("yes")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("I'm so glad to hear that!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Hospitals are no fun for anyone.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Anyway...");
                TimeUnit.SECONDS.sleep(2);
            break;
            } else if (amyChoice.equalsIgnoreCase("no")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("I'm so sorry to hear that.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Hopefully the doctors at Children's will get their poop in a group...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("What was I just saying...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Sorry, I really am distracted today...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Is that the sound of dogs fighting?");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Anyway...");
                TimeUnit.SECONDS.sleep(2);
                break;
            } else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("FOLLOW DIRECTIONS! Please enter yes or no: ");
                amyChoice = scanner.nextLine();
            }
        }
    }

    public static void casey() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("Oh my, those are some lovely pink headphones you have.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("All the better to hear that important coding information...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I know you have questions.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Will you ask out loud, or type it out?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(1) out loud\n(2) type it out");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Enter 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        String caseyChoice = scanner.nextLine();

        while (true) {
            if (caseyChoice.equals("1")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("What? I can't hear you...Oh, well...");
                break;
            } else if (caseyChoice.equals("2")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("Yes! I just got BINGO!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Moving along...");
                break;
            } else {
                System.out.println();
                TimeUnit.SECONDS.sleep(1);
                System.out.print("Were you listening? Please enter 1 or 2: ");
                caseyChoice = scanner.nextLine();
            }
        }
    }
    public static void trent() throws InterruptedException {
        System.out.println();
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I can sense that your speedy fingers are eager to fly across the keys,");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("but you'll have to be patient to hear my insights...");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Do you have a sucker...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("I seem to be in need of a snack (yes / no): ");

        Scanner scanner = new Scanner(System.in);
        String trentChoice = scanner.nextLine();

        while (true) {
            if (trentChoice.equalsIgnoreCase("yes")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("Oh, thank you! You have been generous with me...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("I'll remember that as I read into your future...");
                break;
            } else if (trentChoice.equalsIgnoreCase("no")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("What selfishness is this?");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("I KNOW YOU HAVE SOME!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Your stinginess will not go unnoticed as I look into your future...");
                TimeUnit.SECONDS.sleep(2);
                break;
            } else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("Are you even listening? Please enter 1, 2, or 3: ");
                trentChoice = scanner.nextLine();
            }
        }
    }
    public static void steven() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("I'm getting the feeling that you have some technical background,");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("but tell me...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("In a speed test, who would type more words per minute?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(1) You\n(2) your teacher\n");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("Enter 1 or 2: ");
        Scanner scanner = new Scanner(System.in);
        String stevenChoice = scanner.nextLine();

        while (true) {
            if (stevenChoice.equals("1")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("Be this arrogance, or be this truth...");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("only a battle will tell...Anyway...");
                break;
            } else if (stevenChoice.equals("2")) {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("Is that modesty, ");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("or room for improvement?");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Hard to know without a race, wouldn't you say? Anyway...");
                TimeUnit.SECONDS.sleep(2);
                break;
            } else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("You don't listen... Please enter 1 or 2: ");
                stevenChoice = scanner.nextLine();
            }
        }
    }
    public static void james() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("Oh, James...the wearer of many hats.");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Is it for warmth, security, stylistic choice...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Who can know? ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("What color hat are you wearing today?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("(1) blue\n(2) another color\n(3) no hat");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Enter 1, 2, or 3: ");
        Scanner scanner = new Scanner(System.in);
        String jamesChoice = scanner.nextLine();

        while(true){
            if (jamesChoice.equals("1")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("The trusty blue hat. This is clearly your favorite.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Maybe it will be your good luck charm...");
                TimeUnit.SECONDS.sleep(2);
                break;
            }else if (jamesChoice.equals("2")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("Why wear any color but blue???");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Think about all the people that just lost at BINGO!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Oh well, moving on...");
                break;
            }else if (jamesChoice.equals("3")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("What do you mean \"no hat,\" are you feeling alright?!?");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Anyway...");
            }else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("Follow Directions! Please enter 1, 2, or 3: ");
                jamesChoice = scanner.nextLine();
            }
        }

    }

    public static void jacob() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.print("Oh yes, Jacob...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("With your eagerness to succeed and your fantastic power message,");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I'm eager to peer into your future.");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("Tell me, have you finished studying for your next assignment? (yes / no): ");
        Scanner scanner = new Scanner(System.in);
        String jacobChoice = scanner.nextLine();

        while(true){
            if (jacobChoice.equalsIgnoreCase("yes")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("Impossible! Grab a coffee, and hit those books again! Anyway...");
                TimeUnit.SECONDS.sleep(2);
                break;
            }else if (jacobChoice.equalsIgnoreCase("no")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("Of course you haven't...there is always more to learn. Anyway...");
                TimeUnit.SECONDS.sleep(2);
                break;
            }else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("Can you listen? Please enter yes or no: ");
                jacobChoice = scanner.nextLine();
            }
        }
    }

    public static void ike() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("Ike? I can barely see you...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("Are you still working on just one monitor?");
        TimeUnit.SECONDS.sleep(1);
        System.out.print("(yes / no): ");
        Scanner scanner = new Scanner(System.in);
        String ikeChoice = scanner.nextLine();

        while(true){
            if (ikeChoice.equalsIgnoreCase("yes")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("You silly man, call Kim!");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("Well, you seem to do great work...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("even with just one monitor...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Anyway...");
                TimeUnit.SECONDS.sleep(2);
                break;
            }else if (ikeChoice.equalsIgnoreCase("no")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("Hooray! Life has gotten easier!");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("You will do great things with this new development, I'm sure.");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Anyway...");
                TimeUnit.SECONDS.sleep(2);
                break;
            }else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("That is not what I said to enter. Please enter yes or no: ");
                ikeChoice = scanner.nextLine();
            }
        }
    }
    public static void ted() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("Ted! What is that wonderful smell?");
        System.out.print("Is Heather about to bring you some food (yes/ no): ");
        Scanner scanner = new Scanner(System.in);
        String tedChoice = scanner.nextLine();

        while(true){
            if (tedChoice.equalsIgnoreCase("yes")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("How wonderful! ");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Now, just tell her that the whole class might also need a snack delivered...");
                TimeUnit.SECONDS.sleep(2);
                System.out.print("She has time for that, right? ");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("Anyway...");
                break;
            }else if (tedChoice.equalsIgnoreCase("no")){
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.println("NO?!? How will you code without sustenance?");
                TimeUnit.SECONDS.sleep(2);
                System.out.println("Oh well, maybe you will own your own restarante one day...");
                TimeUnit.SECONDS.sleep(2);
                System.out.print("Ristorante?");
                TimeUnit.SECONDS.sleep(1);
                System.out.print("Restaurante?");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Oh bother...");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Just get your own food! Anyway...");
                break;
            }else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println();
                System.out.print("Follow Directions! Please enter yes or no: ");
                tedChoice = scanner.nextLine();
            }
        }
    }

    public static void stranger() throws InterruptedException {
        TimeUnit.SECONDS.sleep(1);
        System.out.println();
        System.out.println("If that is really your name, how did you get to me?");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("I was only telling the futures of the brilliant minds of Max");
        System.out.println("Technical Training bootcamp members today...");
        TimeUnit.SECONDS.sleep(2);
        System.out.print("I suppose you could be lying about your name...");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("or you can't spell correctly...");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("hmmmm...let's continue with a look at your future anyway... ");
        TimeUnit.SECONDS.sleep(2);
        System.out.println("You really should look into Max Technical Training though...");
        TimeUnit.SECONDS.sleep(2);
    }
}








