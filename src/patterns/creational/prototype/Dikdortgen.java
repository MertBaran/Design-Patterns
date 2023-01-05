package patterns.creational.prototype;

public class Dikdortgen extends Sekil{
    public int genislik;
    public int yukseklik;

    public Dikdortgen() {
    }

    public Dikdortgen(Dikdortgen dikdortgen) {
        super(dikdortgen);
        if (dikdortgen != null) {
            this.genislik = dikdortgen.genislik;
            this.yukseklik = dikdortgen.yukseklik;
        }
    }

    @Override
    public String toString() {
        return "Dikdortgen@"+ hashCode();
    }

    @Override
    public Sekil clone() {
        return new Dikdortgen(this);
    }

    @Override
    public boolean equals(Object digerNesne) {
        if (!(digerNesne instanceof Dikdortgen) || !super.equals(digerNesne)) return false;
        Dikdortgen sekil2 = (Dikdortgen) digerNesne;
        return sekil2.genislik == genislik && sekil2.yukseklik == yukseklik;
    }

}
