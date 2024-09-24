package vorlage;

class Schaf extends Einheit {

    @Override
    public boolean kannAngreifen(Einheit ziel) {
        return false;
    }

    @Override
    void werdeAngegriffen(int schaden) throws SchafException{
        if (!lebtNoch()) {
            this.lebenspunkte = 0;
            throw new SchafException("Ein Schaf fiel den Horden zum Opfer!");
        }
        throw new SchafException("Ein Schaf fiel den Horden zum Opfer!");
    }

    // todo: do I need it? --> delete
    @Override
    public String toString(){
        return "Schaf" + "(" + "this.lebenspunkte + " + " + this.initiativWert + " + ")";
    }
}
