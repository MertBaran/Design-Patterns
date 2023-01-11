package patterns.creational.factoryMethod.employee.Scenario;

public class PayrollOffice {


        public void maasOde(Calisan calisan) {
            String isim = calisan.getIsim();
            String departman = calisan.getDepartman();
            double maas = calisan.maasHesapla();

            System.out.println("Ödeniyor  " + maas + " => " + isim + " ,departmanı: " + departman);
        }
}
