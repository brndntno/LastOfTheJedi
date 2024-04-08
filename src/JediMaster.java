import java.util.ArrayList;
public class JediMaster extends JediKnight {
    private boolean forceVision;

    public JediMaster(String name, double midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        this.forceVision = false;
    }

    public boolean isForceVision() {
        return forceVision;
    }

    public void activateForceVision() {
        if (getHealth() <= getInitialHealth()) {
            forceVision = true;
        }
    }

    public void forceWave(ArrayList<SithMaster> users) {
        for (int i = 0; i < users.size(); i++) {
            users.get(i).setHealth(-users.get(i).getInitialHealth() * 0.1);
        }
    }

}
