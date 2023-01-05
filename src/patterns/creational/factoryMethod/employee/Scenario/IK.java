package patterns.creational.factoryMethod.employee.Scenario;


import java.util.ArrayList;
import java.util.List;

public class IK {
    private List<Calisan> calisanlar = new ArrayList<Calisan>();

    public IK() {
    }

    public List<Calisan> getCalisanlar() {
        return calisanlar;
    }

    public int getCalisanlarinSayisi() {
        return calisanlar.size();
    }

    public void yeniCalisanEkle(Calisan calisan) {
        calisanlar.add(calisan);
    }

    public void CalisanlariListele(){
        System.out.println("Tüm Calisanlar:");
        for(Calisan calisan : calisanlar)
            System.out.println(calisan);
    }
}
