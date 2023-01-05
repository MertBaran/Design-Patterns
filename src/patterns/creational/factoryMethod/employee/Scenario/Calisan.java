package patterns.creational.factoryMethod.employee.Scenario;
public class Calisan {
    protected int no;
    protected String isim;
    protected int yil;
    protected String departman;
    protected double maas;

    public static final int SABIT_MAAS = 500;

    public Calisan(int no, String isim, int yil, String departman){
        this.no = no;
        this.isim = isim;
        this.yil = yil;
        this.departman = departman;
    }
    public void calis(){
        System.out.println("Calisan calisiyor!");
    }

    public double maasHesapla(){
        maas = yil * SABIT_MAAS;
        return maas;
    }

    public void bilgiVer(){
        System.out.println("\nCalisan Bilgileri");
        System.out.println("Numara: " + no);
        System.out.println("İsim:" + isim);
        System.out.println("Yıl: " + yil);
        System.out.println("Departman: " + departman);
    }
    public int getNo() {
        return no;
    }

    public String getIsim() {
        return isim;
    }

    public int getYil() {
        return yil;
    }

    public String getDepartman() {
        return departman;
    }

    public double getMaas() {
        return maas;
    }

    @Override
    public String toString() {
        return "Calisan [no=" + no + ", isim=" + isim + ", yıl=" + yil + ", departman=" + departman + ", maas="
                + maas + "]";
    }
}
