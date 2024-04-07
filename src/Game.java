import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner scan;
    private String name;
    private ForceUser finalBoss;
    private ArrayList<JediPadawan> team1;
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
        team1 = new ArrayList<>();
        team1.add(user);
        System.out.println("You will be assigned in a group of three Jedi, in which YOU SHALL BE DA LEADER!");
        JediPadawan wanobi = new JediPadawan("Wanobi", 7500, 4000);
        JediPadawan akina = new JediPadawan("Akina", 8500, 4500);
        team1.add(wanobi);
        team1.add(akina);

        level1(team1);
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
                    String ability;
                    System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
                    ability = scan.nextLine();
                    if (ability.equals("P")) {
                        forceUsers.get(i).forcePush(tentabrus);
                    }
                    if (ability.equals("S")) {
                        forceUsers.get(i).saberSlash(tentabrus);
                    }
                    if (ability.equals("H")) {
                        String who;
                        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + forceUsers.get(0).getName() + ")): ");
                        who = scan.nextLine();
                        if (who.equals("W")) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(1));
                        }
                        if (who.equals("A")) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(2));
                        }
                        if (who.equals(forceUsers.get(0).getName())) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(0));
                        }
                    }
                    if (ability.equals("T")) {
                        forceUsers.get(i).saberTwirl(tentabrus);
                    }
                }
                if (target.equals("D")) {
                    String ability;
                    System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
                    ability = scan.nextLine();
                    if (ability.equals("P")) {
                        forceUsers.get(i).forcePush(diosius);
                    }
                    if (ability.equals("S")) {
                        forceUsers.get(i).saberSlash(diosius);
                    }
                    if (ability.equals("H")) {
                        String who;
                        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + forceUsers.get(0).getName() + ")): ");
                        who = scan.nextLine();
                        if (who.equals("W")) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(1));
                        }
                        if (who.equals("A")) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(2));
                        }
                        if (who.equals(forceUsers.get(0).getName())) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(0));
                        }
                    }
                    if (ability.equals("T")) {
                        forceUsers.get(i).saberTwirl(diosius);
                    }
                }
                if (target.equals("R")) {
                    String ability;
                    System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
                    ability = scan.nextLine();
                    if (ability.equals("P")) {
                        forceUsers.get(i).forcePush(resskuven);
                    }
                    if (ability.equals("S")) {
                        forceUsers.get(i).saberSlash(resskuven);
                    }
                    if (ability.equals("H")) {
                        String who;
                        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + forceUsers.get(0).getName() + ")): ");
                        who = scan.nextLine();
                        if (who.equals("W")) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(1));
                        }
                        if (who.equals("A")) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(2));
                        }
                        if (who.equals(forceUsers.get(0).getName())) {
                            forceUsers.get(i).forceHeal(forceUsers.get(i).getMidichlorianCount(), forceUsers.get(0));
                        }
                    }
                    if (ability.equals("T")) {
                        forceUsers.get(i).saberTwirl(resskuven);
                    }
                }
            }
            for (int i = 0; i < enemyTeam.size(); i++) {
                enemyTeam.get(i).saberSlash(forceUsers.get(i));
            }
            for (int i = 0; i < team1.size(); i++) {
                if (team1.get(i).getHealth() <= 0) {
                    team1.remove(i);
                    System.out.println(team1.get(i).getName() + " health: " + team1.get(i).getHealth() +
                            "\n" + team1.get(i).getName() + " has fallen. ");
                } else {
                    System.out.println(team1.get(i).getName() + " health: " + team1.get(i).getHealth());
                }
            }
            for (int i = 0; i < enemyTeam.size(); i++) {
                if (enemyTeam.get(i).getHealth() <= 0) {
                    enemyTeam.remove(i);
                    System.out.println(enemyTeam.get(i).getName() + " health: " + enemyTeam.get(i).getHealth() +
                            "\n" + enemyTeam.get(i).getName() + " has been defeated. ");
                } else {
                    System.out.println(enemyTeam.get(i).getName() + " health: " + enemyTeam.get(i).getHealth());
                }
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
