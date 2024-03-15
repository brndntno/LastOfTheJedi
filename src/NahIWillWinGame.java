import java.util.Scanner;
import java.util.ArrayList;

public class NahIWillWinGame {
    private Scanner scan;
    private String name;
    String JediOrSith;
    public NahIWillWinGame() {
        scan = new Scanner(System.in);
        greetings();

    }

    public void greetings() {
        while (!JediOrSith.equals("J") || !JediOrSith.equals("S")) {
            System.out.println("Enter J to become a jedi or enter S to become a Sith!");
            JediOrSith = scan.nextLine();
        }
        if (JediOrSith.equals("J")) {
            System.out.println("Hello young padawan! Please state your name: ");
            name = scan.nextLine();
            System.out.println("The galaxy is in crisis! As such, we must accelerate the training of our Jedi. Your mission, " + name + ", is to defeat ");
        } else {
            System.out.println("Hello youngling! Please state your name: ");
            name = scan.nextLine();
        }
    }

    public void Game() {
        ForceUser user = new ForceUser("Anakin", 20000, 10000);
        ForceUser user2 = new ForceUser("Ahsoka", 15000, 10000);

        user.forcePush(1000, user2);
        System.out.println(user2.getHealth());

        //
    }
    public void setBoss() {

    }
}
