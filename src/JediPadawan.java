public class JediPadawan extends Jedi {
    private boolean forceWall;
    public JediPadawan(String name, double midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        forceWall = false;
    }

    public boolean isForceWall() {
        return forceWall;
    }

    public void saberTwirl(double midichlorianCount, ForceUser user) {
        double damage = midichlorianCount * 0.05;
        if (user.getHealth() <= user.getInitialHealth() / 2) {
            damage *= 2;
        } else if (user.getHealth() < user.getInitialHealth()) {
            damage *= 1.5;
        }
        user.setHealth(-damage);
    }
}
