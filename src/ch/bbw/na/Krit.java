package ch.bbw.na;

public class Krit {
    public Krit() {
    }
    public int Calculatecrit(int critChance, int damage){
        int critChan;
        int random_intcrit = (int) (Math.random() * (100)+1);
        if(random_intcrit%100>100-critChance){
            critChan = 2;
            System.out.println("you Crit");
        }
        else{
            critChan= 1;
        }
        critChan = damage*critChan;
        return critChan;
    }
}
