public class SithAssassin extends Sith{
    public SithAssassin(String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);

    }
    public void saberSlash(ForceUser user) {
        user.setHealth(user.getHealth() * getMidichlorianCount() * 0.1);
    }
}