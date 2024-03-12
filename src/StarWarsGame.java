import java.util.Scanner;
public class StarWarsGame {
    Scanner scan = new Scanner(System.in);
    public StarWarsGame() {
        greetings();
        start();
    }

    public void greetings() {
        System.out.println("Hello young traveler! State your name: ");
        String name = scan.nextLine();
        System.out.println("Are you part of the dark side or the light side?");
        String side = scan.nextLine();
    }

    public void start() {

    }
}
