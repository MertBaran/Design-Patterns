package patterns.creational.factoryMethod.employee.Scenario;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		IK Ik = new IK();

		PayrollOffice po = new PayrollOffice();

		// Add more employees

		Ik.yeniCalisanEkle(CalisanFactory.calisanYarat("Ali"));
		Ik.yeniCalisanEkle(CalisanFactory.calisanYarat("Zeynep"));
		Ik.yeniCalisanEkle(CalisanFactory.calisanYarat("Turgut"));
		Ik.yeniCalisanEkle(CalisanFactory.mudurYarat("Selim", "Satış Departmanı"));
		Ik.yeniCalisanEkle(CalisanFactory.mudurYarat("Handan", "Üretim Departmanı"));
		Ik.yeniCalisanEkle(CalisanFactory.genelMudurYarat("Ahmet", "Yönetim Departmanı", 10_000));


		System.out.println();

		// Now pay time!
		List<Calisan> calisanlar = Ik.getCalisanlar();

		for (Calisan calisan : calisanlar)
			po.maasOde(calisan);
	}
}
