import java.util.List;

//RelicOfTheAncients:
// equippable,
// neck,
// bonus_damage = 42,
// bonus_hp = 80
public class RelicOfTheAncients implements Item, Equippable {
    private final String itemName = "RelicOfTheAncients";

    @Override
    public SlotType getSlotType() {
        return SlotType.Neck;
    }

    @Override
    public List<ItemEffect> getItemEffects() {
        return List.of(new ItemEffect(EffectType.damage_boost, 42),
                new ItemEffect(EffectType.hp_boost, 80));
    }

    @Override
    public String getItemName() {
        return this.itemName;
    }
}


