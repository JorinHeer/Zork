package ch.bbw.na;

public class Items {
    private boolean isequipped;
    private int damage;
    private int critChance;
    public Items(boolean isequipped, int damage, int critChance) {
        this.isequipped = isequipped;
        this.damage = damage;
        this.critChance = critChance;
    }

    public int getDamage() {
        return damage;
    }

    public int getCritChance() {
        return critChance;
    }

    public void setCritChance(int critChance) {
        this.critChance = critChance;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public boolean isIsequipped() {
        return isequipped;
    }

    public void setIsequipped(boolean isequipped) {
        this.isequipped = isequipped;
    }
}
