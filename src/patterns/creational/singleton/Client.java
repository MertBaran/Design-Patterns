package patterns.creational.singleton;
public class Client {
    public static void main(String[] args) {
            
        Cumhurbaskani cumhurbaskani = null;
        cumhurbaskaniYarat(cumhurbaskani);

    }
    static void cumhurbaskaniYarat(Cumhurbaskani cumhurbaskani){
        for(int i=0;i<10;i++){
            cumhurbaskani = Cumhurbaskani.secim("mert" + i);
            System.out.println(cumhurbaskani.getAdi());
        }

    }
}
