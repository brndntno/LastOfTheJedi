import java.util.ArrayList;

public class CountDooku extends SithMaster {

    public CountDooku(String name, double midichlorianCount, double health) {
        super(name, midichlorianCount, health);
    }

    public void makashi(ArrayList<ForceUser> forceUsers) {
        for (int i = 0; i < forceUsers.size(); i++) {
            forceUsers.get(i).setHealth(-forceUsers.get(i).getInitialHealth() * 0.15);
        }
    }
}
