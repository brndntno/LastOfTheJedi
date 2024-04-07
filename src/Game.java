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
        level1(user);
    }


    public void level1(JediPadawan user) {
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

        System.out.println("For your first trial, you must incapacitate the three sith assassins recently found on Tatooine");

        enemyTeam = new ArrayList<ForceUser>();
        SithAssassin tentabrus = new SithAssassin("Tentabrus", 7500, 4250);
        SithAssassin diosius = new SithAssassin("Diosius", 8500, 4000);
        SithAssassin resskuven = new SithAssassin("Resskuven", 8000, 3500);
        enemyTeam.set(0, tentabrus);
        enemyTeam.set(1, diosius);
        enemyTeam.set(2, resskuven);
        while (enemyTeam.size() > 0) {
            for (int i = 0; i < team1.size(); i++) {
                String target;
                System.out.print("Choose your target ((T)entabrus, (D)iosius, (R)esskuven): ");
                target = scan.nextLine();
                if (target.equals("T")) {
                    String ability;
                    System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
                    ability = scan.nextLine();
                    if (ability.equals("P")) {
                        user.forcePush(tentabrus);
                    }
                    if (ability.equals("S")) {
                        user.saberSlash(tentabrus);
                    }
                    if (ability.equals("H")) {
                        String who;
                        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + user.getName() + ")): ");
                        who = scan.nextLine();
                        if (who.equals("W")) {
                            user.forceHeal(user.getMidichlorianCount(), wanobi);
                        }
                        if (who.equals("A")) {
                            user.forceHeal(user.getMidichlorianCount(), akina);
                        }
                        if (who.equals(user.getName())) {
                            user.forceHeal(user.getMidichlorianCount(), user);
                        }
                    }
                    if (ability.equals("T")) {
                        user.saberTwirl(tentabrus);
                    }
                }
                if (target.equals("D")) {
                    String ability;
                    System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
                    ability = scan.nextLine();
                    if (ability.equals("P")) {
                        user.forcePush(diosius);
                    }
                    if (ability.equals("S")) {
                        user.saberSlash(diosius);
                    }
                    if (ability.equals("H")) {
                        String who;
                        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + user.getName() + ")): ");
                        who = scan.nextLine();
                        if (who.equals("W")) {
                            user.forceHeal(user.getMidichlorianCount(), wanobi);
                        }
                        if (who.equals("A")) {
                            user.forceHeal(user.getMidichlorianCount(), akina);
                        }
                        if (who.equals(user.getName())) {
                            user.forceHeal(user.getMidichlorianCount(), user);
                        }
                    }
                    if (ability.equals("T")) {
                        user.saberTwirl(diosius);
                    }
                }
                if (target.equals("R")) {
                    String ability;
                    System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
                    ability = scan.nextLine();
                    if (ability.equals("P")) {
                        user.forcePush(resskuven);
                    }
                    if (ability.equals("S")) {
                        user.saberSlash(resskuven);
                    }
                    if (ability.equals("H")) {
                        String who;
                        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + user.getName() + ")): ");
                        who = scan.nextLine();
                        if (who.equals("W")) {
                            user.forceHeal(user.getMidichlorianCount(), wanobi);
                        }
                        if (who.equals("A")) {
                            user.forceHeal(user.getMidichlorianCount(), akina);
                        }
                        if (who.equals(user.getName())) {
                            user.forceHeal(user.getMidichlorianCount(), user);
                        }
                    }
                    if (ability.equals("T")) {
                        user.saberTwirl(resskuven);
                    }
                }
            }
            for (int i = 0; i < enemyTeam.size(); i++) {
                enemyTeam.get(i).saberSlash(team1.get(i));
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
