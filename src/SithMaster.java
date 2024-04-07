public class SithMaster extends SithApprentice{
    public SithMaster (String name, int midichlorianCount, double health) {
        super(name, midichlorianCount, health);
    }

    public void mindControl(ForceUser user) {
        user.setMindControl(true);
    }
}
