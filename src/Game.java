import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner scan;
    private String name;
    private ForceUser finalBoss;
    private ArrayList<ForceUser> team1;
    private ArrayList<ForceUser> enemyTeam;
    public Game() {
        scan = new Scanner(System.in);
        setBoss();
        greetings();
    }

    public void greetings() {
        String JediOrSith = "";
        System.out.println("Hello young padawan! Please state your name: ");
        name = scan.nextLine();
        JediPadawan user = new JediPadawan(name, 10000, 5000);
        jediStory(user);
    }

    public void jediStory(ForceUser user) {
        System.out.println("A long time ago, in a galaxy far, far away, the Jedi's lived peacefully, but suddenly, the sith started the clone wars.\nDue to this time of war, the jedi were unable to properly train their padawans.\nAs such, padawans were required to persist past ominous tribulations.");
        setBoss();
        System.out.println("Your mission will be to overcome the forces of evil that ravage this galaxy.\nYou must defeat " + finalBoss.getName() + ".");
        team1 = new ArrayList<>();
        team1.add(user);
        System.out.println("You will be assigned with a group of five Jedi, in which YOU SHALL BE DA LEADER!");
        JediPadawan wanobi = new JediPadawan("Wanobi", 7500, 4000);
        JediPadawan akina = new JediPadawan("Akina", 8500, 4500);
        team1.add(wanobi);
        team1.add(akina);
    }

    public void level1() {
        System.out.println("");
    }

    public void setBoss() {
        if (Math.random() < 0.5) {
            finalBoss = new CountDooku("Count Dooku", 30000, 15000);
        } else {
            finalBoss = new DarthSidious("Darth Sidious", 40000, 20000);
        }
    }
}
