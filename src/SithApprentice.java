public class SithApprentice extends SithAssassin{
    public SithApprentice(String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);

    }

    public void forceLightning(ForceUser user) {
        if (getHealth() < getInitialHealth() * 0.5) {
            user.setHealth(-user.getInitialHealth() * 0.35);
        } else {
            user.setHealth(-user.getInitialHealth() * 0.25);
        }
    }
}
