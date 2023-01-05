package patterns.structural.decorator;

public class AyvalikTostFactory implements AbstractTostFactory{


    @Override
    public Tost tostYap() {
        System.out.println(" icin ayvalik Tostu hazırlanıyor:");
        Tost ayvalikTost = null;

        ayvalikTost = new TostEkmegi("Tost ekmeği", 5);
        icindekileriYazdir(ayvalikTost);
        System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

        ayvalikTost = new Peynir(ayvalikTost, "Peynir", 3);
        icindekileriYazdir(ayvalikTost);
        System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());


        ayvalikTost = new Sucuk(ayvalikTost, "Sucuk", 3);
        icindekileriYazdir(ayvalikTost);
        System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

        ayvalikTost = new Domates(ayvalikTost, "Domates", 2);
        icindekileriYazdir(ayvalikTost);
        System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

        ayvalikTost = new Ketcap(ayvalikTost, "Ketçap", 1);
        icindekileriYazdir(ayvalikTost);
        System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

        ayvalikTost = new Marul(ayvalikTost, "Marul", 2);
        icindekileriYazdir(ayvalikTost);
        System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());
        return ayvalikTost;
    }

    @Override
    public void icindekileriYazdir(Tost tost) {
        for (Malzeme malzeme : tost.getMalzemeler())
            System.out.println(malzeme);
    }
}
