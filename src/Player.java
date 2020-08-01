import java.util.List;

public class Player extends AbstractPlayer {

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

    private void setPlayerStats() {
        setBaseHP(FantasyGameConstants.BASE_HP);
        setBaseIntelligence(FantasyGameConstants.BASE_INTELLIGENCE);
        setBaseMP(FantasyGameConstants.BASE_MP);
        setBaseStrength(FantasyGameConstants.BASE_STRENGTH);
    }

    @Override
    public int getMaxMP() {
        return getBaseMP() + getBoostFromEquippedItems(EffectType.mana_boost);
    }

    public Player(List<Slot> slots) {
        createPlayerSlotList(slots);
        setPlayerStats();

    }

    public Player(List<Slot> slots, String playerName) {
        createPlayerSlotList(slots);
        setPlayerStats();
        setPlayerName(playerName);
    }
}
