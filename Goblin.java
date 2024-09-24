package vorlage;

class Goblin extends Einheit implements Gift,Fernkampf{
    @Override
    public boolean kannAngreifen(Einheit ziel) {
        return ziel instanceof Mensch || ziel instanceof Zwerg;
    }

    @Override
    public String toString(){
        return "Goblin" + "(" + "this.lebenspunkte + " + " + this.initiativWert + " + ")";
    }
}
