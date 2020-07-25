import java.util.List;

public class RingOfDestruction implements  Equippable {
    @Override
    public SlotType getSlotType() {
        return SlotType.Finger;
    }

    @Override
    public List<ItemEffect> getItemEffects() {
        return List.of(new ItemEffect(EffectType.damage_boost, 12));
    }

    @Override
    public String getItemName() {
        return "RingOfDestruction";
    }
}
