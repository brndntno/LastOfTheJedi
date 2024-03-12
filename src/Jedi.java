public class Jedi extends ForceUser {
    private boolean oneWithTheForce;
    public Jedi(String name, double midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        oneWithTheForce = false;
    }

    public boolean isOneWithTheForce() {
        return oneWithTheForce;
    }

    public void forceHeal(double midichlorianCount, ForceUser user) {
        double heal = midichlorianCount * 0.05;
        user.setHealth(heal);
    }

    public void becomeOneWithTheForce() {
        oneWithTheForce = true;
    }

}
