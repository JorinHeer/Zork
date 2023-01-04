package ch.bbw.na;

public class Entities {
    private boolean dead;
    private int enemyHP;
    private int damage;
    public Entities(boolean dead, int enemyHP, int enemyDamage) {
        this.dead = dead;
        this.enemyHP = enemyHP;
        this.damage = enemyDamage;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getEnemyHP() {
        return enemyHP;
    }

    public void setEnemyHP(int enemyHP) {
        this.enemyHP = enemyHP;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }
}
