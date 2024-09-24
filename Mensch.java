package vorlage;

class Mensch extends Einheit implements SchwereRuestung, Fernkampf{
    @Override
    public boolean kannAngreifen(Einheit ziel) {
        return ziel instanceof Ork || ziel instanceof Goblin;
    }

    @Override
    public String toString(){
        return "Mensch" + "(" + "this.lebenspunkte + " + " + this.initiativWert + " + ")";
    }
}
