public class JediKnight extends JediPadawan {
    private int battleMeditation;
    public JediKnight(String name, double midichlorianCount, double health, int battleMeditation) {
        super(name, midichlorianCount, health);
        this.battleMeditation = battleMeditation;
    }

    public int getBattleMeditation() {
        return battleMeditation;
    }

    @Override
    public void saberTwirl(double midichlorianCount, ForceUser user) {
        if (getBattleMeditation() < 5) {

        }
        super.saberTwirl(midichlorianCount, user);
    }
}
