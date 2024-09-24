package vorlage;

import java.util.Random;

public abstract class Einheit implements Comparable<Einheit>{
    public static final int FERNKAMPF_SCHADEN = 2;
    public static final int SCHWERE_RUESTUNG_DAMAGE_DIVIDER= 2;
    public static final int GIFT_SCHADEN = 2;
    protected int lebenspunkte;
    protected int basisschaden = 2;
    protected int initiativWert;


    @Override
    public int compareTo(Einheit other) {
        return Integer.compare(other.initiativWert, this.initiativWert);
    }

    public Einheit() {
        this.lebenspunkte = 20;
        Random random = new Random();
        this.initiativWert = random.nextInt(101);
    }

    // ?? maybe change name because it is always negated
    boolean lebtNoch(){
        return this.lebenspunkte > 0;
    };

    abstract boolean kannAngreifen(Einheit ziel);

    void werdeAngegriffen(int schaden){
        this.lebenspunkte -= schaden;
        if (!lebtNoch()) {
            this.lebenspunkte = 0;
        }
    }

    public int calculateReducedDamage(int originalDamage) {
        return originalDamage/SCHWERE_RUESTUNG_DAMAGE_DIVIDER;
    }

    public int calculateRangeDamage(int originalDamage) {
        return originalDamage + FERNKAMPF_SCHADEN;
    }

    public int calculatePoisonDamage(int originalDamage) {
        return originalDamage + GIFT_SCHADEN;
    }

    @Override
    public String toString(){
        return "(" + this.lebenspunkte + ", " + this.initiativWert + ")";
    }

    void attackiere(Einheit ziel){
        int damage = this.basisschaden;
        if( ziel instanceof Fernkampf){
            damage = calculateRangeDamage(damage);
        }
        // todo: check logic, is wrong need to check if Goblin
        if( ziel instanceof Gift ){
            damage = calculatePoisonDamage(damage);
        }
        if( (ziel instanceof SchwereRuestung) ){
            damage = damage/SCHWERE_RUESTUNG_DAMAGE_DIVIDER;
        }
        if (kannAngreifen(ziel)){
            ziel.werdeAngegriffen(damage);
            // to string is implicit ??
            System.out.println(this + " hat " + ziel);
        }
    };
}
