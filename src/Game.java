import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner scan;
    private String name;
    private ForceUser finalBoss;
    private boolean isJedi;
    private ArrayList<ForceUser> team1;
    public Game() {
        scan = new Scanner(System.in);
        setBoss();
        greetings();

    }

    public void greetings() {
        String JediOrSith = "";
        while (!JediOrSith.equals("J") && !JediOrSith.equals("S")) {
            System.out.println("Enter J to become a jedi or enter S to become a Sith!");
            JediOrSith = scan.nextLine();
            if (JediOrSith.equals("J")) {
                isJedi = true;
            } else {
                isJedi = false;
            }
        }
        if (isJedi) {
            System.out.println("Hello young padawan! Please state your name: ");
            name = scan.nextLine();
            System.out.println("The galaxy is in crisis! As such, we must accelerate the training of our Jedi. Your mission, " + name + ", is to defeat " + finalBoss.getName() + "");
        } else {
            System.out.println("Hello youngling! Please state your name: ");
            name = scan.nextLine();

        }
    }

    public void Game() {
        if (isJedi) {
            JediPadawan user = new JediPadawan(name, 20000, 10000);
            jediStory(user);

        }





    }

    public void jediStory(ForceUser user) {
        System.out.println("A long time ago, in a galaxy far, far away, the Jedi's lived peacefully, but suddenly, the sith started the clone wars.\nDue to this time of war, the jedi were unable to properly train their padawans.\nAs such, padawans were required to persist past ominous tribulations.");
        setBoss();
        System.out.println("Your mission will be to overcome the forces of evil that ravage this galaxy.\nYou must defeat " + finalBoss.getName() + ".");
        team1 = new ArrayList<>();
        team1.add(user);
        System.out.println("You will be assigned with a group of five Jedi, in which YOU SHALL BE DA LEADER!");
    }
    public void setBoss() {
        if (isJedi) {
            if (Math.random() < 0.5) {
                finalBoss = new CountDooku("Count Dooku", 30000, 10000);
            } else {
                finalBoss = new DarthSidious("Darth Sidious", 40000, 20000);
            }
        } else {
            if (Math.random() < 0.5) {
                finalBoss = new GrandmasterMaceWindu("Mace Windu", 30000, 10000);
            } else {
                finalBoss = new GrandmasterYoda("Yoda", 40000, 20000);
            }
        }
    }
}
