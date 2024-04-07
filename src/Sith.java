public class Sith extends ForceUser{
    private boolean rage;
    public Sith(String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        rage = false;
    }

    public void enrage() {
        setMidichlorianCount(getMidichlorianCount() * 2);
        setHealth(getInitialHealth() * 0.75);
    }
}