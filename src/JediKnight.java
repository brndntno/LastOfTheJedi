public class JediKnight extends JediPadawan {
    private int battleMeditation;
    public JediKnight(String name, double midichlorianCount, double health) {
        super(name, midichlorianCount, health);
        this.battleMeditation = 0;
    }
    public int getBattleMeditation() {
        return battleMeditation;
    }
    public void saberTwirl(ForceUser user){
        if (getBattleMeditation() < 5) {
            super.saberTwirl(user);
            battleMeditation++;
        } else {
            super.saberTwirl(user);
            super.saberTwirl(user);
        }
    }
}
