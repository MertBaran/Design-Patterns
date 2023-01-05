package patterns.creational.factoryMethod.employee.Scenario;


public class CalisanFactory {
    public static Calisan calisanYarat(String name) {
        Calisan calisan = null;
        int id = RastgeleCalisan.idYarat();
        int year = RastgeleCalisan.yilYarat();
        String department = RastgeleCalisan.departmanYarat();
        calisan = new Calisan(id, name, year, department);
        return calisan;
    }

    public static Mudur mudurYarat(String name, String department) {
        Mudur mudur = null;
        int id = RastgeleCalisan.idYarat();
        int year = RastgeleCalisan.yilYarat();
        mudur = new Mudur(id, name, year, department, department);
        return mudur;
    }

    public static GenelMudur genelMudurYarat(String name, String department, int bonus) {
        GenelMudur genelMudur = null;
        int id = RastgeleCalisan.idYarat();
        int year = RastgeleCalisan.yilYarat();
        genelMudur = new GenelMudur(id, name, year, "Management", "Management", 5000);
        return genelMudur;
    }
}
