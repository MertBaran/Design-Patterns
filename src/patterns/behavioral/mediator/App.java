package patterns.behavioral.mediator;

import java.math.BigDecimal;

public class App {

    public static void main(String[] args) {

        Kabzimal kabzimal = new Kabzimal();

        DomatesUreticisi ureticiMert = new DomatesUreticisi("mert", BigDecimal.valueOf(4), kabzimal);
        DomatesUreticisi ureticiYusuf = new DomatesUreticisi("yusuf", BigDecimal.valueOf(3), kabzimal);

        DomatesHalcisi halciAhmet = new DomatesHalcisi("ahmet", BigDecimal.valueOf(5), kabzimal);
        DomatesHalcisi halciMehmet = new DomatesHalcisi("mehmet", BigDecimal.valueOf(7), kabzimal);

        kabzimal.ureticiEkle(ureticiMert);
        kabzimal.ureticiEkle(ureticiYusuf);

        kabzimal.halciEkle(halciAhmet);
        kabzimal.halciEkle(halciMehmet);

        ureticiMert.urunSat();
        halciMehmet.urunAl();
    }
}
