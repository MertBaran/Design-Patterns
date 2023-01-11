package patterns.creational.prototype;

public class Daire extends Sekil{
    public int yaricap;
    public String isim= "Daire";

    public Daire() {
    }

    public Daire(Daire daire) {
        super(daire);
        if (daire != null) {
            this.yaricap = daire.yaricap;
        }
    }

    @Override
    public Sekil clone() {
        return new Daire(this);
    }

    @Override
    public String toString() {
        return "Daire@"+ hashCode();
    }

    @Override
    public boolean equals(Object digerNesne) {
        if (!(digerNesne instanceof Daire) || !super.equals(digerNesne)) return false;
        Daire sekil2 = (Daire) digerNesne;
        return sekil2.yaricap == yaricap;
    }
    @Override
    public void setRenk(String renk) {
        super.setRenk(renk);
    }
}
