import java.util.List;

public class Player extends AbstractPlayer {

    @Override
    public void setBaseStrength(int baseStrength) {
        super.setBaseStrength(20);
    }

    @Override
    public int getMaxHP() {
        return getBaseHP() + getLevelHP() + getBoostFromEquippedItems(EffectType.hp_boost);

    }

    @Override
    public int getLevelHP() {
        return LevelMapping.getBonusFromLevel(getLevel(), FantasyGameConstants.playerLevelToBonusMap).getHPBonus();
    }

    @Override
    public int getLevelMP() {
        return LevelMapping.getBonusFromLevel(getLevel(), FantasyGameConstants.playerLevelToBonusMap).getMPBonus();
    }

    @Override
    public int getLevelInt() {
        return LevelMapping.getBonusFromLevel(getLevel(), FantasyGameConstants.playerLevelToBonusMap).getIntelligenceBonus();
    }

    @Override
    public int getLevelStr() {
        return LevelMapping.getBonusFromLevel(getLevel(), FantasyGameConstants.playerLevelToBonusMap).getStrengthBonus();
    }

    @Override
    public int getIntelligence() {
        return getBaseIntelligence() + LevelMapping.getBonusFromLevel(getLevel(), FantasyGameConstants.playerLevelToBonusMap).getIntelligenceBonus();
    }

    @Override
    public int getAttackDamage() {
        return getBoostFromEquippedItems(EffectType.damage_boost);
    }

    @Override
    public int getStrength() {
        return getBaseStrength()
                + LevelMapping.getBonusFromLevel(getLevel(), FantasyGameConstants.playerLevelToBonusMap).getStrengthBonus();
    }

    @Override
    public int getMaxMana() {
        return getBaseMP() + getBoostFromEquippedItems(EffectType.mana_boost);
    }

    @Override
    public void setBaseIntelligence(int baseIntelligence) {
        super.setBaseIntelligence(10);
    }

    @Override
    public void setBaseHP(int baseHP) {
        super.setBaseHP(20);
    }

    @Override
    public void setBaseMP(int baseMP) {
        super.setBaseMP(10);
    }

    public Player(List<Slot> slots) {
        createPlayerSlotList(slots);
    }

}
