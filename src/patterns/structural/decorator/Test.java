package patterns.structural.decorator;

public class Test {

	public static void main(String[] args) {

		Musteri furkan = new Musteri("Furkan");
		AyvalikTostFactory ayvalik = new AyvalikTostFactory();
		System.out.print(furkan.getAd());
		furkan.siparisVer(ayvalik);

		Musteri mert = new Musteri("Mert");
		SusurlukTostFactory susurluk = new SusurlukTostFactory();
		System.out.print(mert.getAd());
		mert.siparisVer(susurluk);
	}
}
