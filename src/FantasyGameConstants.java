import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class FantasyGameConstants {
    public static Map<Integer, LevelBonus> playerLevelToBonusMap = new HashMap<>() {{
        put(1, new LevelBonus(0, 0, 0, 0));
        put(2, new LevelBonus(10, 10, 20, 16));
        put(3, new LevelBonus(15, 15, 40, 24));
        put(4, new LevelBonus(20, 18, 60, 40));
        put(5, new LevelBonus(25, 20, 80, 40));
    }};

    //    Level 1:0-299XP
//        Level 2:300-899XP
//        Level 3:900-2699XP
//        Level 4:2700-6499XP
//        Level 5:6500-13999XP
    public static NavigableMap<Integer, Integer> experienceToLevelMap = new TreeMap<>() {{
        put(LEVEL_1_MIN_EXP, LEVEL_1);
        put(LEVEL_2_MIN_EXP, LEVEL_2);
        put(LEVEL_3_MIN_EXP, LEVEL_3);
        put(LEVEL_4_MIN_EXP, LEVEL_4);
        put(LEVEL_5_MIN_EXP, LEVEL_5);
    }};

    public static final int LEVEL_1 = 1;
    public static final int LEVEL_2 = 2;
    public static final int LEVEL_3 = 3;
    public static final int LEVEL_4 = 4;
    public static final int LEVEL_5 = 5;
    public static final int LEVEL_1_MIN_EXP = 0;
    public static final int LEVEL_2_MIN_EXP = 300;
    public static final int LEVEL_3_MIN_EXP = 900;
    public static final int LEVEL_4_MIN_EXP = 2700;
    public static final int LEVEL_5_MIN_EXP = 6500;

}
