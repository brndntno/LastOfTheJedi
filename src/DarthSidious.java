import java.util.ArrayList;

public class DarthSidious extends SithMaster {
    public DarthSidious(String name, double midichlorianCoumnt, double health) {
        super(name, midichlorianCoumnt, health);
    }

    public void unrelentingTorrents(ArrayList<ForceUser> forceUsers) {
        for (int i = 0; i < forceUsers.size(); i++) {
            forceUsers.get(i).setHealth(-forceUsers.get(i).getInitialHealth() * 0.2);
        }
    }
}
