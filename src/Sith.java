public class Sith extends ForceUser{
    public Sith(String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);
    }

    public void forceChoke(ForceUser user) {
        user.setHealth(user.getInitialHealth() * 0.15);
    }
}