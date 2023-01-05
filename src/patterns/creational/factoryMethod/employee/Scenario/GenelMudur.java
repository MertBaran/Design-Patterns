package patterns.creational.factoryMethod.employee.Scenario;

public class GenelMudur extends Mudur{
    protected double bonus;

    public GenelMudur(int no, String name, int year, String workingDepartment, String managingDepartment, double bonus) {
        super(no, name, year, workingDepartment, managingDepartment);
        this.bonus = bonus;
    }

    @Override
    public void calis() {
        super.calis();
    }

    @Override
    public String getYonetilenDepartman() {
        return super.getYonetilenDepartman();
    }

    @Override
    public void yonet() {
        System.out.println("Genel Müdür tüm şirketi yönetiyor!");
        stratejikPlanYap();
    }

    private void stratejikPlanYap() {
        System.out.println("Genel müdür stratejik plan yapıyor" );
    }

    @Override
    public double maasHesapla() {
        return super.maasHesapla();
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public void bilgiVer() {
        super.bilgiVer();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
