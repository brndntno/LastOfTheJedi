public class Sith extends ForceUser {
    private boolean rage;
    public Sith(String name, double midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        rage = false;
    }

    public boolean isRage() {
        return rage;
    }

    public void forceChoke(double midichlorianCount, ForceUser user) {
        double damage = midichlorianCount * 0.05;
        user.setHealth(-damage);
    }

    public void enrage() {

    }
}
