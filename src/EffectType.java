public enum EffectType {
    none,
    mana_boost,
    mana_replenish,
    hp_boost,
    hp_replenish,
    damage_boost;
    private boolean useEffect;

    public boolean getUseEffect() {

        return useEffect;
    }

}
