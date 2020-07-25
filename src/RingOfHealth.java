import java.util.List;

public class RingOfHealth implements Item, Equippable {
    private final String itemName = "RingOfHealth";

    @Override
    public SlotType getSlotType() {
        return SlotType.Finger;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public List<ItemEffect> getItemEffects() {
        return List.of(
                new ItemEffect(EffectType.hp_boost, 10),
                new ItemEffect(EffectType.damage_boost, 3)
        );

    }


}
