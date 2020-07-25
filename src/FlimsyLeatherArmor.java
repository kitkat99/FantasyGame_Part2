import java.util.Collections;
import java.util.List;

public class FlimsyLeatherArmor implements Equippable {
    private final String itemName = "FlimsyLeatherArmor";

    @Override
    public SlotType getSlotType() {
        return SlotType.Chest;
    }

    @Override
    public List<ItemEffect> getItemEffects() {
        return Collections.emptyList();
    }

    @Override
    public String getItemName() {
        return itemName;
    }
}
