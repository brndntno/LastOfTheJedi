public class SithMaster extends SithApprentice{
    public SithMaster (String name, double midichlorianCount, double health) {
        super(name, midichlorianCount, health);
    }

    public void forceRepulse(ForceUser user) {
        if (user.getHealth() <= user.getInitialHealth() * 0.25) {
            user.setHealth(-user.getHealth());
        } else {
            user.setHealth(-0.5 * user.getHealth());
        }
    }
}
