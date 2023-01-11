package patterns.creational.singleton;

public class Cumhurbaskani {

    private static Cumhurbaskani cumhurbaskani; // nesne değişkeni statik ve gizli olarak tutulmalı
    private String adi;
    private Cumhurbaskani(String adi )
    {
        this.adi = adi;
    };

    public static Cumhurbaskani secim(String adi){  // kurucu metot statik olmalı
        if(cumhurbaskani == null)               // nesne değişenin daha önce bir değer atanmadığı kontrol edilmeli
      cumhurbaskani =  new Cumhurbaskani(adi);
      return cumhurbaskani;
    }

    public String getAdi(){return adi;};
}
