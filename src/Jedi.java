public class Jedi extends ForceUser{
    private boolean oneWithTheForce;
    public Jedi(String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        oneWithTheForce = false;
    }
    public void becomeOneWithTheForce() {
        oneWithTheForce = true;
    }
}
