package vorlage;

class Zwerg extends Einheit implements SchwereRuestung, Fernkampf{
    @Override
    public boolean kannAngreifen(Einheit ziel) {
        return ziel instanceof Ork || ziel instanceof Goblin;
    }

    @Override
    public String toString(){
        return "Zwerg" + "(" + "this.lebenspunkte + " + " + this.initiativWert + " + ")";
    }
}
