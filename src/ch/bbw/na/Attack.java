package ch.bbw.na;

public class Attack {

    public Attack() {
    }
    public int attack(boolean equipped, int HPenemy,int intemCrit, int itemDamage, String nameOfItem, String actionOfItem){
        int HPenemyafter = HPenemy;
        if(equipped){
            Krit krit= new Krit();
            int damage = krit.Calculatecrit(intemCrit, itemDamage);
            System.out.println("you use your "+nameOfItem+ " to "+actionOfItem+" and deal "+damage+" damage");
            HPenemyafter = HPenemy-damage;
            System.out.println("enemy's life:"+HPenemyafter);

        }
        return HPenemyafter;
    }
}
