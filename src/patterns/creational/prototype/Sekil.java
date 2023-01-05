package patterns.creational.prototype;

import java.util.Objects;

public abstract class Sekil{
    public int x;
    public int y;
    public String renk;

    public Sekil() {
    }

    public Sekil(Sekil sekil) {
        if (sekil != null) {
            this.x = sekil.x;
            this.y = sekil.y;
            this.renk = sekil.renk;
        }
    }

    public abstract Sekil clone();
    @Override
    public boolean equals(Object digerNesne) {
        if (!(digerNesne instanceof Sekil)) return false;
        Sekil sekil2 = (Sekil) digerNesne;
        return sekil2.x == x && sekil2.y == y && Objects.equals(sekil2.renk, renk);
    }

    @Override
    public String toString() {
        return "Sekil@" + hashCode();
    }
}
