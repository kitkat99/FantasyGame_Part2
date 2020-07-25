import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;


//        Level 1:0-299XP
//        Level 2:300-899XP
//        Level 3:900-2699XP
//        Level 4:2700-6499XP
//        Level 5:6500-13999XP

public class LevelMapping {

    public static int getLevelFromXP(int XP) {
        NavigableMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 1);
        map.put(300, 2);
        map.put(900, 3);
        map.put(2700, 4);
        map.put(6500, 5);
        return map.floorEntry(XP).getValue();
    }

    public static LevelBonus bonusMapping(int level) {
        Map<Integer, LevelBonus> bonusMap = new HashMap<>() {{
            put(1, new LevelBonus(0, 0, 0, 0));
            put(2, new LevelBonus(10, 10, 20, 16));
            put(3, new LevelBonus(15, 15, 40, 24));
            put(4, new LevelBonus(20, 18, 60, 40));
            put(5, new LevelBonus(25, 20, 80, 40));
        }};

        return bonusMap.get(level);
    }
}

