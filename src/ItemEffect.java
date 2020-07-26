public class ItemEffect {
    private EffectType effectType;
    private int effectAmount;

    public EffectType getEffectType() {
        return effectType;
    }

    public int getEffectAmount() {
        return effectAmount;
    }

    public ItemEffect(EffectType effectType, int effectAmount) {
        this.effectAmount = effectAmount;
        this.effectType = effectType;
    }

    @Override
    public String toString() {
        return "effectType: " + effectType + ", effectAmount: " + effectAmount;
    }
}
