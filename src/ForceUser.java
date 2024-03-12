public class ForceUser {
    private String name;
    private double midichlorianCount;
    private double health;
    public ForceUser(String name, int midichlorianCount, double health) {
        this.name = name;
        this.midichlorianCount = midichlorianCount;
        this.health = health;
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

    public void takeDamage(double damage) {
        health -= damage;
    }
    public void forcePush(double damage, ForceUser user) {
        user.health -= damage;
    }
}
