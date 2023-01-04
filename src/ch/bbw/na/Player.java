package ch.bbw.na;

import java.util.ArrayList;

public class Player {
    int maxHP;
    int hp;
    boolean alive = true;
    private ArrayList<Items> items;
    public Player(int hp, boolean alive) {
        this.alive = alive;
        this.hp = hp;
        items = new ArrayList<Items>();

    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getHp() {
        return hp;
    }
    public int getMaxHP() {
        return maxHP;
    }

    public void setMaxHP(int maxHP) {
        this.maxHP = maxHP;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }

    public ArrayList<Items> getItems() {
        return items;
    }

    public void setItems(ArrayList<Items> items) {
        this.items = items;
    }


    public void addItem(Items item){
        items.add(item);
    }
    public int inventorysize(){
        return items.size();
    }
    public void damage (int damage){
        hp -= damage;
        if(hp<=0){
            setAlive(false);
            System.out.println("\nyou dumb bitch you played your self");
        }
    }
}
