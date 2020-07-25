import java.util.List;

public abstract class AbstractPlayer {
    private int baseHP;
    private int HP;
    private int MP;
    private int baseStrength;
    private int baseIntelligence;
    private int baseMP;
    private int XP;
    private List<Item> Inventory;

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
        Inventory.remove(item);
    }

    public void showInventory() {
        for (Item i : Inventory) {
            System.out.println(i.getItemName());
        }
    }
}
