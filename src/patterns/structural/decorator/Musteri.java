package patterns.structural.decorator;

public class Musteri {
    private String ad;

    public Musteri(String ad) {
        this.ad = ad;
    }

    public Tost siparisVer(AbstractTostFactory tostFactory){
        return tostFactory.tostYap();
    };

    public String getAd() {
        return ad;
    }
}
