package patterns.creational.factoryMethod.employee.Scenario;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		IK Ik = new IK();
		PayrollOffice maasÖdemeBurosu = new PayrollOffice();

		CalisanFactory calisanFactory = new CalisanFactoryImpl();
		MudurFactory mudurFactory = new MudurFactoryImpl();
		GenelMudurFactory genelMudurFactory = new GenelMudurFactoryImpl();

		Ik.yeniCalisanEkle(calisanFactory.yarat("Ali"));
		Ik.yeniCalisanEkle(calisanFactory.yarat("Zeynep"));
		Ik.yeniCalisanEkle(calisanFactory.yarat("Turgut"));
		Ik.yeniCalisanEkle(mudurFactory.yarat("Selim", "Satış Departmanı"));
		Ik.yeniCalisanEkle(mudurFactory.yarat("Handan", "Üretim Departmanı"));
		Ik.yeniCalisanEkle(genelMudurFactory.yarat("Ahmet", "Yönetim Departmanı", 10_000));

		System.out.println();

		List<Calisan> calisanlar = Ik.getCalisanlar();

		for (Calisan calisan : calisanlar)
			maasÖdemeBurosu.maasOde(calisan);
	}
}
