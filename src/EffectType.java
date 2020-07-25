public enum EffectType {
    none(false),
    mana_boost(false),
    mana_replenish(true),
    hp_boost(false),
    hp_replenish(true),
    damage_boost(false);
    private boolean useEffect;

    EffectType(final boolean useEffect) {
        this.useEffect = useEffect;
    }

    public boolean getUseEffect() {
        return useEffect;
    }

}
