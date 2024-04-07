public class ForceUser {
    private String name;
    private double midichlorianCount;
    private double health;
    private double initialHealth = health;
    private boolean tranceState;
    private boolean mindControl;
    public ForceUser(String name, double midichlorianCount, double health) {
        this.name = name;
        this.midichlorianCount = midichlorianCount;
        this.health = health;
        this.tranceState = false;
        this.mindControl = false;
    }

    public String getName() {
        return name;
    }

    public double getMidichlorianCount() {
        return midichlorianCount;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double add) {
        health += add;
    }
    public void setMindControl(boolean mindControl) {
        this.mindControl = mindControl;
    }
    public boolean getMindControl() {
        return mindControl;
    }

    public double getInitialHealth() {
        return initialHealth;
    }

    public void forcePush(double midichlorianCount, ForceUser user) {
        double damage = midichlorianCount * 0.01;
        user.health -= damage;
    }

    public void saberSlash(double midichlorianCount, ForceUser user) {
        double damage = midichlorianCount * 0.05;
        user.health -= damage;
    }
}
