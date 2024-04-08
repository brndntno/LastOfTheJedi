import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner scan;
    private String name;
    private ForceUser finalBoss;
    private ArrayList<JediPadawan> forceUsers;
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

    public void jediStory(JediPadawan user) {
        System.out.println("A long time ago, in a galaxy far, far away, the Jedi's lived peacefully, but suddenly, the sith started the clone wars.\nDue to this time of war, the jedi were unable to properly train their padawans.\nAs such, padawans were required to persist past ominous tribulations.");
        setBoss();
        System.out.println("Your mission will be to overcome the forces of evil that ravage this galaxy.\nYou must defeat " + finalBoss.getName() + ".");
        forceUsers = new ArrayList<>();
        forceUsers.add(user);
        System.out.println("You will be assigned in a group of three Jedi, in which YOU SHALL BE DA LEADER!");
        JediPadawan wanobi = new JediPadawan("Wanobi", 7500, 4000);
        JediPadawan akina = new JediPadawan("Akina", 8500, 4500);
        forceUsers.add(wanobi);
        forceUsers.add(akina);

        level1(forceUsers);
        System.out.println("Congratulations, you have overcome your first trial.\nThe second trial awaits you...");
        level2(forceUsers);
        System.out.println("It seems that not even the second trial can stop you, however you still have one more trial.\nThe final trial awaits you...");
        level3(forceUsers);
    }


    public void level1(ArrayList<JediPadawan> forceUsers) {

        System.out.println("For your first trial, you must incapacitate the three sith assassins recently found on Tatooine");

        enemyTeam = new ArrayList<ForceUser>();
        SithAssassin tentabrus = new SithAssassin("Tentabrus", 7500, 4250);
        SithAssassin diosius = new SithAssassin("Diosius", 8500, 4000);
        SithAssassin resskuven = new SithAssassin("Resskuven", 8000, 3500);
        enemyTeam.add(tentabrus);
        enemyTeam.add(diosius);
        enemyTeam.add(resskuven);
        while (enemyTeam.size() > 0) {
            for (int i = 0; i < forceUsers.size(); i++) {
                String target;
                System.out.print("Choose your target ((T)entabrus, (D)iosius, (R)esskuven): ");
                target = scan.nextLine();
                if (target.equals("T")) {
                    attacking(tentabrus, i);
                }
                if (target.equals("D")) {
                    attacking(diosius, i);
                }
                if (target.equals("R")) {
                    attacking(resskuven, i);
                }
            }
            afterMath();
        }
    }
    public void level2(ArrayList<JediPadawan> forceUsers) {

        System.out.println("For your second trial, you must incapacitate the three sith assassins recently found on Tatooine");

        enemyTeam = new ArrayList<ForceUser>();
        SithAssassin spectris = new SithAssassin("Spectris", 7500, 4250);
        SithAssassin nafariouz = new SithAssassin("Nafariouz", 8500, 4000);
        SithAssassin haunte = new SithAssassin("Haunte", 8000, 3500);
        enemyTeam.add(spectris);
        enemyTeam.add(nafariouz);
        enemyTeam.add(haunte);

        while (enemyTeam.size() > 0) {
            for (int i = 0; i < forceUsers.size(); i++) {
                String target;
                System.out.print("Choose your target ((S)pectris, (N)afariouz, (H)aunte): ");
                target = scan.nextLine();
                if (target.equals("S")) {
                    attacking(spectris, i);
                }
                if (target.equals("N")) {
                    attacking(nafariouz, i);
                }
                if (target.equals("H")) {
                    attacking(haunte, i);
                }
            }
            afterMath();
        }
    }
    public void level3(ArrayList<JediPadawan> forceUsers) {

        System.out.println("For your third trial, you must incapacitate the three sith assassins recently found on Tatooine");

        enemyTeam = new ArrayList<ForceUser>();
        SithAssassin mystere = new SithAssassin("Mystere", 7500, 4250);
        SithAssassin fotris = new SithAssassin("Fotris", 8500, 4000);
        SithAssassin skexous = new SithAssassin("Skexous", 8000, 3500);
        enemyTeam.add(mystere);
        enemyTeam.add(fotris);
        enemyTeam.add(skexous);
        while (enemyTeam.size() > 0) {
            for (int i = 0; i < forceUsers.size(); i++) {
                String target;
                System.out.print("Choose your target ((M)ystere, (F)otris, (S)kexous): ");
                target = scan.nextLine();
                if (target.equals("M")) {
                    attacking(mystere, i);
                }
                if (target.equals("F")) {
                    attacking(fotris, i);
                }
                if (target.equals("S")) {
                    attacking(skexous, i);
                }
            }
            afterMath();
        }
    }

    public void attacking(ForceUser user, int num) {
        String ability;
        System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
        ability = scan.nextLine();
        if (ability.equals("P")) {
            forceUsers.get(num).forcePush(user);
        }
        if (ability.equals("S")) {
            forceUsers.get(num).saberSlash(user);
        }
        if (ability.equals("H")) {
            heal(num);
        }
        if (ability.equals("T")) {
            forceUsers.get(num).saberTwirl(user);
        }
    }

    public void heal(int num) {
        String who;
        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + forceUsers.get(0).getName() + ")): ");
        who = scan.nextLine();
        if (who.equals("W")) {
            forceUsers.get(num).forceHeal(forceUsers.get(num).getMidichlorianCount(), forceUsers.get(1));
        }
        if (who.equals("A")) {
            forceUsers.get(num).forceHeal(forceUsers.get(num).getMidichlorianCount(), forceUsers.get(2));
        }
        if (who.equals(forceUsers.get(0).getName())) {
            forceUsers.get(num).forceHeal(forceUsers.get(num).getMidichlorianCount(), forceUsers.get(0));
        }
    }

    public void afterMath() {
        for (int i = 0; i < enemyTeam.size(); i++) {
            enemyTeam.get(i).saberSlash(forceUsers.get(i));
        }
        for (int i = 0; i < forceUsers.size(); i++) {
            if (forceUsers.get(i).getHealth() <= 0) {
                System.out.println(forceUsers.get(i).getName() + " health: " + forceUsers.get(i).getHealth() +
                        "\n" + forceUsers.get(i).getName() + " has fallen. ");
                forceUsers.remove(i);
                i--;
            } else {
                System.out.println(forceUsers.get(i).getName() + " health: " + forceUsers.get(i).getHealth());
            }
        }
        for (int i = 0; i < enemyTeam.size(); i++) {
            if (enemyTeam.get(i).getHealth() <= 0) {
                System.out.println(enemyTeam.get(i).getName() + " health: " + enemyTeam.get(i).getHealth() +
                        "\n" + enemyTeam.get(i).getName() + " has been defeated. ");
                enemyTeam.remove(i);
                i--;
            } else {
                System.out.println(enemyTeam.get(i).getName() + " health: " + enemyTeam.get(i).getHealth());
            }
        }
    }

    public void setBoss() {
        if (Math.random() < 0.5) {
            finalBoss = new CountDooku("Count Dooku", 30000, 15000);
        } else {
            finalBoss = new DarthSidious("Darth Sidious", 40000, 20000);
        }
    }
}
