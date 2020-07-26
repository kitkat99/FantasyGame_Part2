import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPlayer {
    private int baseHP;
    private int HP;
    private int MP;
    private int baseStrength;
    private int baseIntelligence;
    private int baseMP;
    private int XP;
    private List<Item> Inventory = new ArrayList<>();
    private List<Slot> Slots = new ArrayList<>();

    public int getBaseHP() {
        return baseHP;
    }

    public int getBaseIntelligence() {
        return baseIntelligence;
    }

    public int getBaseMP() {
        return baseMP;
    }

    public int getBaseStrength() {
        return baseStrength;
    }

    public void setBaseHP(int baseHP) {
        this.baseHP = baseHP;
    }

    public void setBaseMP(int baseMP) {
        this.baseMP = baseMP;
    }

    public void setBaseIntelligence(int baseIntelligence) {
        this.baseIntelligence = baseIntelligence;
    }

    public void setBaseStrength(int baseStrength) {
        this.baseStrength = baseStrength;
    }

    public int getXP() {
        return XP;
    }

    public int getLevel() {
        return LevelMapping.getLevelFromXP(XP);
    }

    public abstract int getMaxHP();

    public abstract int getLevelHP();

    public abstract int getLevelMP();

    public abstract int getLevelInt();

    public abstract int getLevelStr();

    public abstract int getIntelligence();

    public abstract int getAttackDamage();

    public abstract int getStrength();

    public abstract int getMaxMana();

    public int addXP() {
        return 0;

    }

    public int removeXP() {
        return 0;
    }

    public void pickUp(Item item) {
        Inventory.add(item);
    }

    public void drop(Item item) {
        if (isItemEquipped(item)) {
            System.out.println("item is equipped");
        } else {
            Inventory.remove(item);
        }

    }

    public void showInventory() {
        for (Item i : Inventory) {
            System.out.println(i.getItemName());
        }
    }

    public boolean isItemEquipped(Item item) {
        return getEquippedItems().stream().anyMatch(x -> x.equals(item));

    }

    public List<Item> getEquippedItems() {
        List<Item> equippedItems = new ArrayList<>();
        this.Slots.forEach(e -> {
            equippedItems.addAll(e.getListOfItems());
        });
        return equippedItems;
    }

    public List<ItemEffect> getEquippedItemsEffects() {
        List<ItemEffect> equippedItemsEffects = new ArrayList<>();
        getEquippedItems().forEach(e -> {
            equippedItemsEffects.addAll(e.getItemEffects());
        });
        return equippedItemsEffects;
    }

    public int getBoostFromEquippedItems(EffectType effectType) {
        return getEquippedItemsEffects()
                .stream()
                .filter(e -> e.getEffectType() == effectType)
                .map(e -> e.getEffectAmount())
                .reduce(0, (element1, element2) -> element1 + element2);
    }

    public List<Slot> getSlots() {
        return Slots;
    }

    public void createPlayerSlotList(List<Slot> slots) {
        Slots.addAll((slots));
    }
}
