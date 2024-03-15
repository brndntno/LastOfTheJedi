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

    public void fullHeal(int numTurns, ArrayList<ForceUser> users) {
        if (numTurns == 7) {
            for (int i = 0; i < users.size(); i++) {
                users.get(i).setHealth(getInitialHealth() - getHealth());
            }
        }
    }
}
