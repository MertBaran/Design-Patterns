package patterns.creational.singleton;

public class Cumhurbaskani {

    private static Cumhurbaskani cumhurbaskani;
    private String adi;
    private Cumhurbaskani(String adi )
    {
        this.adi = adi;
    };

    public static Cumhurbaskani secim(String adi){
        if(cumhurbaskani == null)
      cumhurbaskani =  new Cumhurbaskani(adi);
      return cumhurbaskani;
    }

    public String getAdi(){return adi;};
}
