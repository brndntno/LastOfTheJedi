public class SithAssassin extends Sith{
    private boolean hidden;
    private boolean intoTheShadows;
    public SithAssassin(String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        hidden = false;
        intoTheShadows = false;
    }

    public void prep() {
        if (!intoTheShadows) {
            intoTheShadows = true;
        } else {
            hidden = true;
        }
    }

    public void oneShot(ForceUser user) {
        if (hidden) {
            user.setHealth(-user.getHealth());
            hidden = false;
            intoTheShadows = false;
        }
    }
}