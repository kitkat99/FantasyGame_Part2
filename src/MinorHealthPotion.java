import java.util.Collections;
import java.util.List;

//MinorHealthPotion:
// usable,
// 10 uses,
// health replenish = 5
public class MinorHealthPotion implements Usable {
    private final String itemName = "MinorHealthPotion";
    int itemUses = 10;

    @Override
    public List<ItemEffect> getItemEffects() {
        return List.of(new ItemEffect(EffectType.hp_replenish, 5));
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public int usesLeft() {
        return itemUses;
    }

    @Override
    public List<ItemEffect> use() {
        if (usesLeft() > 0) {
            itemUses--;
            return getItemEffects();
        } else {
            System.out.println("no uses left for " + getItemName());
            return Collections.emptyList();
        }
    }

}
