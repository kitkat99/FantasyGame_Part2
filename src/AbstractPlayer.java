public abstract class AbstractPlayer {
    private int baseHP;
    private int HP;
    private int MP;
    private int baseStrength;
    private int baseIntelligence;
    private int baseMP;
    private int XP;

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public void setBaseMP(int baseMP) {
        this.baseMP = baseMP;
    }

    public void setBaseIntelligence(int baseIntelligence) {
        this.baseIntelligence = baseIntelligence;
    }

    public void setBaseStrength(int baseStrength) {
        this.baseStrength = baseStrength;
    }

    public int getXP() {
        return XP;
    }

    public int getLevel() {
        return LevelMapping.getLevelFromXP(XP);
    }

    public int getMaxHP() {
        return baseHP + LevelMapping.getBonusFromLevel(getLevel(), FantasyGameConstants.playerLevelToBonusMap).getHPBonus();
    }

    public int addXP() {
        return 0;

    }

    public int removeXP() {
        return 0;
    }
}
