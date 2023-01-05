package patterns.behavioral.observer;

import java.math.BigDecimal;

public class Termometre extends Observable{
    private BigDecimal anlikSicaklik;
    private BigDecimal minSicaklik;
    private BigDecimal maxSicaklik;

    public Termometre(BigDecimal minSicaklik, BigDecimal maxSicaklik) {
        this.minSicaklik = minSicaklik;
        this.maxSicaklik = maxSicaklik;
        this.anlikSicaklik = BigDecimal.valueOf(24);
    }

    public void setAnlikSicaklik(BigDecimal anlikSicaklik) {
        this.anlikSicaklik=anlikSicaklik;

        System.out.println(anlikSicaklik);

        sicakligiKontrolEt(anlikSicaklik);

    }

    public BigDecimal getAnlikSicaklik() {
        return anlikSicaklik;
    }


    public void sicakligiKontrolEt(BigDecimal anlik) {

        boolean isCokSoguk = anlik.compareTo(minSicaklik) <= 0;
        boolean isCokSicak = anlik.compareTo(maxSicaklik) >= 0;

        if(isCokSoguk || isCokSicak)
            notifyToObserver();

    }
}
