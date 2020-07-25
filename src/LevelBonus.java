public class LevelBonus {
    private int strengthBonus;
    private int intelligenceBonus;
    private int HPBonus;
    private int MPBonus;

    public int getHPBonus() {
        return HPBonus;
    }

    public int getMPBonus() {
        return MPBonus;
    }

    public int getIntelligenceBonus() {
        return intelligenceBonus;
    }

    public int getStrengthBonus() {
        return strengthBonus;
    }

    public LevelBonus(int strength, int intelligence, int hp, int mp) {
        strengthBonus = strength;
        intelligenceBonus = intelligence;
        HPBonus = hp;
        MPBonus = mp;
    }
}

