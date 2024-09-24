package vorlage;

class Ork extends Einheit implements SchwereRuestung {
    @Override
    public boolean kannAngreifen(Einheit ziel) {
        return ziel instanceof Mensch || ziel instanceof Zwerg;
    }

    @Override
    public String toString(){
        return "Ork" + "(" + "this.lebenspunkte + " + " + this.initiativWert + " + ")";
    }
}
