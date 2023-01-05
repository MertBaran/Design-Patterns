package patterns.structural.decorator;

public class SusurlukTostFactory implements AbstractTostFactory{
    @Override
    public Tost tostYap() {
        System.out.println(" icin Susurluk Tostu hazırlanıyor...");
        Tost susurlukTostu;
        susurlukTostu = new TostEkmegi("Tost ekmeği", 5);
        icindekileriYazdir(susurlukTostu);
        System.out.println("fiyatı: " + susurlukTostu.fiyatHesapla());
        icindekileriYazdir(susurlukTostu);
        susurlukTostu = new Peynir(susurlukTostu, "mihaliç peyniri", 3);
        icindekileriYazdir(susurlukTostu);
        System.out.println("fiyatı: " + susurlukTostu.fiyatHesapla());
        icindekileriYazdir(susurlukTostu);
        susurlukTostu = new Sucuk(susurlukTostu, "Sucuk", 3);
        icindekileriYazdir(susurlukTostu);
        System.out.println("\nfiyatı: " + susurlukTostu.fiyatHesapla());
        return susurlukTostu;
    }

    @Override
    public void icindekileriYazdir(Tost tost) {
        for (Malzeme malzeme : tost.getMalzemeler())
            System.out.println(malzeme);
    }
}
