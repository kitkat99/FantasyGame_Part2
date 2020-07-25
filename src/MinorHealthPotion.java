import java.util.List;

//MinorHealthPotion:
// usable,
// 10 uses,
// health replenish = 5
public class MinorHealthPotion implements Item, Usable {
    int initialUses = 10;

    @Override
    public List<ItemEffect> getItemEffects() {
        return List.of(new ItemEffect(EffectType.hp_replenish, 5));
    }

    @Override
    public String getItemName() {
        return null;
    }

    @Override
    public int usesLeft() {
        return 0;
    }

    @Override
    public List<ItemEffect> use() {
        initialUses--;
        return getItemEffects();
    }

}
