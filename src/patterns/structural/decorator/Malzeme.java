package patterns.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public abstract class Malzeme implements Tost{
	private String isim;
	protected Tost tostMalzemeleri;
	protected int fiyat;
	
	private List<Malzeme> malzemeler = new ArrayList<>();
	
	public Malzeme(Tost tostMalzemeleri, int fiyat, String isim){
		this.tostMalzemeleri = tostMalzemeleri;
		malzemeler.add(this);
		this.isim = isim;
		this.fiyat = fiyat;
	}
	
	@Override
	public int fiyatHesapla() {
		return tostMalzemeleri.fiyatHesapla() + fiyat;
	}
	
	@Override
	public List<Malzeme> getMalzemeler() {
		 List<Malzeme> malzemeler = tostMalzemeleri.getMalzemeler();
		 malzemeler.add(this);
		 return malzemeler;
	}

	public String getIsim() {
		return isim;
	}

	public Tost getTostMalzemeleri() {
		return tostMalzemeleri;
	}



	@Override
	public String toString() {
		return "malzemeler: [ismi=" + isim + ", fiyatı=" + fiyat + "]";
	}
}
