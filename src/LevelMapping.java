import java.util.Map;




public class LevelMapping {

    public static int getLevelFromXP(int XP) {
        return FantasyGameConstants.experienceToLevelMap.floorEntry(XP).getValue();
    }

    public static LevelBonus getBonusFromLevel(int level, Map<Integer, LevelBonus> bonusMapping) {
        return bonusMapping.get(level);
    }
}

