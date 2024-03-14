public class JediKnight extends JediPadawan {
    private int battleMeditation;
    public JediKnight(String name, double midichlorianCount, double health, int battleMeditation) {
        super(name, midichlorianCount, health);
        this.battleMeditation = battleMeditation;
    }
}
