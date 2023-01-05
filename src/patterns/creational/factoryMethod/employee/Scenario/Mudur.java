package patterns.creational.factoryMethod.employee.Scenario;

public class Mudur extends Calisan {

        protected String yonetilenDepartman;

        public static final int MUDUR_MAASI = 3000;

        public Mudur(int no, String isim, int yil, String calisilanDepartman, String yonetilenDepartman){
            super(no, isim, yil, calisilanDepartman);
            this.yonetilenDepartman = yonetilenDepartman;
        }

        public void calis(){
            System.out.println("Müdür calisiyor!");
            calis();
        }

        public void yonet(){
            System.out.println("Müdür departmanı yönetiyor: " + yonetilenDepartman);
        }

        public double maasHesapla(){
            return super.maasHesapla() + MUDUR_MAASI;
        }

        public String getYonetilenDepartman() {
            return yonetilenDepartman;
        }

        public void bilgiVer(){
            super.bilgiVer();
            System.out.println("yonetilen Departman: " + yonetilenDepartman);
        }

        @Override
        public String toString() {
            return "Mudur [yonetilen Departman=" + yonetilenDepartman + ", no=" + no + ", isim=" + isim + ", yil=" + yil
                    + ", departman=" + departman + ", maas=" + maas + "]";
        }
}
