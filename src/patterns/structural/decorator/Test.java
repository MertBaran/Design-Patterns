package patterns.structural.decorator;

public class Test {

	public static void main(String[] args) {
		Test test = new Test();
		test.tostYap1();
		test.tostYap2();
	}
	Tost ayvalikTost;
	Tost susurlukTostu;
	public void tostYap1() {
		ayvalikTost = new TostEkmegi("Tost ekmeği", 5);
		icindekileriYazdir(ayvalikTost);
		System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

		ayvalikTost = new Peynir(ayvalikTost, "Peynir", 3);
		icindekileriYazdir(ayvalikTost);
		System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());


		ayvalikTost = new Sucuk(ayvalikTost, "Sucuk", 3);
		icindekileriYazdir(ayvalikTost);
		System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

		ayvalikTost = new Domates(ayvalikTost, "Domates", 2);
		icindekileriYazdir(ayvalikTost);
		System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

		ayvalikTost = new Ketcap(ayvalikTost, "Ketçap", 1);
		icindekileriYazdir(ayvalikTost);
		System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

		ayvalikTost = new Marul(ayvalikTost, "Marul", 2);
		icindekileriYazdir(ayvalikTost);
		System.out.println("fiyatı: " + ayvalikTost.fiyatHesapla());

	}

	public void tostYap2() {
		System.out.println(" icin Susurluk Tostu hazırlanıyor...");

		susurlukTostu = new TostEkmegi("Tost ekmeği", 5);
		icindekileriYazdir(susurlukTostu);
		System.out.println("fiyatı: " + susurlukTostu.fiyatHesapla());
		icindekileriYazdir(susurlukTostu);
		susurlukTostu = new Peynir(susurlukTostu, "mihaliç peyniri", 3);
		icindekileriYazdir(susurlukTostu);
		System.out.println("fiyatı: " + susurlukTostu.fiyatHesapla());
		icindekileriYazdir(susurlukTostu);
		susurlukTostu = new Sucuk(susurlukTostu, "Sucuk", 3);
		icindekileriYazdir(susurlukTostu);
		System.out.println("\nfiyatı: " + susurlukTostu.fiyatHesapla());

	}
	public void icindekileriYazdir(Tost tost) {
		for (Malzeme malzeme : tost.getMalzemeler())
			System.out.println(malzeme);
	}
}
