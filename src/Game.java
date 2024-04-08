import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private Scanner scan;
    private String name;
    private SithMaster finalBoss;
    private ArrayList<JediPadawan> forceUsers;
    private ArrayList<JediKnight> forceUsers2;
    private ArrayList<JediMaster> forceUsers3;
    private ArrayList<SithAssassin> enemyTeam;
    private ArrayList<SithApprentice> enemyTeam2;
    private ArrayList<SithMaster> enemyTeam3;

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
        forceUsers2 = new ArrayList<>();
        JediKnight wanobi2 = new JediKnight("Wanobi", 7500, 4000);
        JediKnight akina2 = new JediKnight("Akina", 8500, 4500);
        JediKnight user2 = new JediKnight(name, 10000, 5000);
        JediKnight anakinSkywalker = new JediKnight("Anakin", 12000, 6000);
        forceUsers2.add(wanobi2);
        forceUsers2.add(akina2);
        forceUsers2.add(user2);
        forceUsers2.add(anakinSkywalker);
        System.out.println("Jedi Knight Anakin Skywalker has joined your team");
        level2(forceUsers2);
        System.out.println("It seems that not even the second trial can stop you, however you still have one more trial.\nThe final trial awaits you...");
        forceUsers3 = new ArrayList<>();
        JediMaster wanobi3 = new JediMaster("Wanobi", 9000, 4250);
        JediMaster akina3 = new JediMaster("Akina", 10000, 4750);
        JediMaster user3 = new JediMaster(name, 12000, 6000);
        JediMaster anakinSkywalker2 = new JediMaster("Anakin", 12000, 6000);
        JediMaster yoda = new JediMaster("Master Yoda", 35000, 10000);
        forceUsers3.add(wanobi3);
        forceUsers3.add(akina3);
        forceUsers3.add(user3);
        forceUsers3.add(anakinSkywalker2);
        forceUsers3.add(yoda);
        System.out.println("You and your friends have grown greatly in strength. Master Yoda will now assist in your final trial. ");
        level3(forceUsers3);
    }


    public void level1(ArrayList<JediPadawan> forceUsers) {

        System.out.println("For your first trial, you must incapacitate the three sith assassins recently found on Tatooine");

        enemyTeam = new ArrayList<>();
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
            for (int i = 0; i < enemyTeam.size(); i++) {
                enemyTeam.get(i).saberSlash(forceUsers.get(i));
            }
            afterMath();
        }
    }
    public void level2(ArrayList<JediKnight> forceUsers) {

        System.out.println("For your second trial, you must incapacitate the four sith zealots recently found on Naboo");

        enemyTeam2 = new ArrayList<SithApprentice>();
        SithApprentice spectris = new SithApprentice("Spectris", 8000, 4500);
        SithApprentice nafariouz = new SithApprentice("Nafariouz", 8750, 4250);
        SithApprentice haunte = new SithApprentice("Haunte", 8250, 3750);
        SithApprentice maul = new SithApprentice("Maul", 12000, 4750);
        enemyTeam2.add(spectris);
        enemyTeam2.add(nafariouz);
        enemyTeam2.add(haunte);
        enemyTeam2.add(maul);

        while (enemyTeam2.size() > 0) {
            for (int i = 0; i < forceUsers.size(); i++) {
                String target;
                System.out.print("Choose your target ((S)pectris, (N)afariouz, (H)aunte, (M)aul): ");
                target = scan.nextLine();
                if (target.equals("S")) {
                    attacking2(spectris, i);
                }
                if (target.equals("N")) {
                    attacking2(nafariouz, i);
                }
                if (target.equals("H")) {
                    attacking2(haunte, i);
                }
                if (target.equals("M")) {
                    attacking2(maul, i);
                }
            }
            for (int i = 0; i < enemyTeam2.size(); i++) {
                double num = Math.random();
                if (num > 0.5) {
                    enemyTeam2.get(i).forceLightning(forceUsers2.get(i));
                } else if (num > 0.25) {
                    enemyTeam2.get(i).saberSlash(forceUsers2.get(i));
                } else {
                    enemyTeam2.get(i).forceChoke(forceUsers2.get(i));
                }
            }
            afterMath2();
        }
    }
    public void level3(ArrayList<JediMaster> forceUsers) {

        System.out.println("For your third trial, you must incapacitate the three sith assassins recently found on Tatooine");

        enemyTeam3 = new ArrayList<SithMaster>();
        SithMaster mystere = new SithMaster("Mystere", 7500, 5000);
        SithMaster skexous = new SithMaster("Skexous", 7500, 5000);
        SithMaster giusplei = new SithMaster("Gisplei", 12000, 5000);
        SithMaster maul2 = new SithMaster("Maul", 12000, 4750);
        enemyTeam3.add(mystere);
        enemyTeam3.add(finalBoss);
        enemyTeam3.add(skexous);
        enemyTeam3.add(maul2);
        enemyTeam3.add(giusplei);
        while (enemyTeam3.size() > 0) {
            for (int i = 0; i < forceUsers.size(); i++) {
                String target;
                System.out.print("Choose your target ((M)ystere, (" + finalBoss.getName() + "), (S)kexous, (Ma)ul, (G)iusPlei): ");
                target = scan.nextLine();
                if (target.equals("M")) {
                    attacking3(mystere, i);
                }
                if (target.equals(finalBoss.getName())) {
                    attacking3(finalBoss, i);
                }
                if (target.equals("S")) {
                    attacking3(skexous, i);
                }
                if (target.equals("Ma")) {
                    attacking3(maul2, i);
                }
                if (target.equals("G")) {
                    attacking3(giusplei, i);
                }
            }
            for (int i = 0; i < enemyTeam3.size(); i++) {
                double num = Math.random();
                if (num > 0.5) {
                    enemyTeam3.get(i).forceRepulse(forceUsers3.get(i));
                } else if (num > 0.25) {
                    enemyTeam3.get(i).forceLightning(forceUsers3.get(i));
                } else if (num > 0.125) {
                    enemyTeam3.get(i).saberSlash(forceUsers3.get(i));
                } else {
                    enemyTeam3.get(i).forceChoke(forceUsers3.get(i));
                }
            }
            afterMath3();
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

    public void attacking2(ForceUser user, int num) {
        String ability;
        System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl): ");
        ability = scan.nextLine();
        if (ability.equals("P")) {
            forceUsers2.get(num).forcePush(user);
        }
        if (ability.equals("S")) {
            forceUsers2.get(num).saberSlash(user);
        }
        if (ability.equals("H")) {
            heal2(num);
        }
        if (ability.equals("T")) {
            forceUsers2.get(num).saberTwirl(user);
        }
    }

    public void attacking3(ForceUser user, int num) {
        String ability;
        System.out.print("Choose your ability (force(P)ush, saber(S)lash, force(H)eal, saber(T)wirl, force(W)ave): ");
        ability = scan.nextLine();
        if (ability.equals("P")) {
            forceUsers3.get(num).forcePush(user);
        }
        if (ability.equals("S")) {
            forceUsers3.get(num).saberSlash(user);
        }
        if (ability.equals("H")) {
            heal3(num);
        }
        if (ability.equals("T")) {
            forceUsers3.get(num).saberTwirl(user);
        }
        if (ability.equals("W")) {
            forceUsers3.get(num).forceWave(enemyTeam3);
        }
    }

    public void heal(int num) {
        String who;
        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + forceUsers.get(0).getName() + "): ");
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

    public void heal2(int num) {
        String who;
        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + forceUsers2.get(0).getName() + "), Ana(k)in): ");
        who = scan.nextLine();
        if (who.equals("W")) {
            forceUsers2.get(num).forceHeal(forceUsers2.get(num).getMidichlorianCount(), forceUsers2.get(1));
        }
        if (who.equals("A")) {
            forceUsers2.get(num).forceHeal(forceUsers2.get(num).getMidichlorianCount(), forceUsers2.get(2));
        }
        if (who.equals(forceUsers3.get(0).getName())) {
            forceUsers2.get(num).forceHeal(forceUsers2.get(num).getMidichlorianCount(), forceUsers2.get(0));
        }
        if (who.equals("k")) {
            forceUsers2.get(num).forceHeal(forceUsers2.get(num).getMidichlorianCount(), forceUsers2.get(3));
        }
    }

    public void heal3(int num) {
        String who;
        System.out.print("Who would you like to heal? ((W)anobi, (A)kina, (" + forceUsers3.get(0).getName() + "), Ana(k)in, (Y)oda): ");
        who = scan.nextLine();
        if (who.equals("W")) {
            forceUsers3.get(num).forceHeal(forceUsers3.get(num).getMidichlorianCount(), forceUsers3.get(1));
        }
        if (who.equals("A")) {
            forceUsers3.get(num).forceHeal(forceUsers3.get(num).getMidichlorianCount(), forceUsers3.get(2));
        }
        if (who.equals(forceUsers3.get(0).getName())) {
            forceUsers3.get(num).forceHeal(forceUsers3.get(num).getMidichlorianCount(), forceUsers3.get(0));
        }
        if (who.equals("k")) {
            forceUsers3.get(num).forceHeal(forceUsers3.get(num).getMidichlorianCount(), forceUsers3.get(3));
        }
        if (who.equals("Y")) {
            forceUsers3.get(num).forceHeal(forceUsers3.get(num).getMidichlorianCount(), forceUsers3.get(4));
        }
    }

    public void afterMath() {
        ForceUser[][] allPresent = new ForceUser[2][3];
        for (int i = 0; i < forceUsers.size(); i++) {
            allPresent[0][i] = forceUsers.get(i);
        }
        for (int i = 0; i < enemyTeam.size(); i++) {
            allPresent[1][i] = enemyTeam.get(i);
        }
        for (int r = 0; r < allPresent.length; r++) {
            for (int c = 0; c < allPresent[r].length; c++) {
                if (allPresent[r][c].getHealth() <= 0) {
                    System.out.println(allPresent[r][c].getName() + " health: " + allPresent[r][c].getHealth() +
                            "\n" + allPresent[r][c].getName() + " has fallen. ");
                    allPresent[r][c] = new ForceUser("Dead", 0, 0);
                }
            }
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
    public void afterMath2() {
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
        for (int i = 0; i < enemyTeam2.size(); i++) {
            if (enemyTeam2.get(i).getHealth() <= 0) {
                System.out.println(enemyTeam2.get(i).getName() + " health: " + enemyTeam2.get(i).getHealth() +
                        "\n" + enemyTeam2.get(i).getName() + " has been defeated. ");
                enemyTeam2.remove(i);
                i--;
            } else {
                System.out.println(enemyTeam2.get(i).getName() + " health: " + enemyTeam2.get(i).getHealth());
            }
        }
    }

    public void afterMath3() {
        for (int i = 0; i < forceUsers3.size(); i++) {
            if (forceUsers3.get(i).getHealth() <= 0) {
                System.out.println(forceUsers3.get(i).getName() + " health: " + forceUsers3.get(i).getHealth() +
                        "\n" + forceUsers3.get(i).getName() + " has fallen. ");
                forceUsers3.remove(i);
                i--;
            } else {
                System.out.println(forceUsers3.get(i).getName() + " health: " + forceUsers3.get(i).getHealth());
            }
        }
        for (int i = 0; i < enemyTeam3.size(); i++) {
            if (enemyTeam3.get(i).getHealth() <= 0) {
                System.out.println(enemyTeam3.get(i).getName() + " health: " + enemyTeam3.get(i).getHealth() +
                        "\n" + enemyTeam3.get(i).getName() + " has been defeated. ");
                enemyTeam3.remove(i);
                i--;
            } else {
                System.out.println(enemyTeam3.get(i).getName() + " health: " + enemyTeam3.get(i).getHealth());
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
