import java.util.List;

public class WristbandOfMana implements Item, Equippable {
    private final String itemName = "WristbandOfMana";

    @Override
    public SlotType getSlotType() {
        return SlotType.Hand;
    }

    @Override
    public List<ItemEffect> getItemEffects() {
        return List.of(new ItemEffect(EffectType.mana_boost, 5));
    }

    @Override
    public String getItemName() {
        return itemName;
    }
}
