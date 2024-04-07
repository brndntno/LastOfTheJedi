public class SithAssassin extends Sith{
    public SithAssassin(String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);

    }
    public void saberSlash(ForceUser user) {
        double damage = getMidichlorianCount() * 0.15;
        user.setHealth(-damage);
        setHealth(-damage / 2);
    }
}