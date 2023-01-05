package patterns.structural.decorator;

import java.util.ArrayList;
import java.util.List;

public class TostEkmegi implements Tost {
	private static String isim;
	protected int fiyat;
	
	public TostEkmegi(String isim, int fiyat) {
		this.isim = isim;
		this.fiyat = fiyat;
		System.out.println(isim + " kızartıldı");
	}

	@Override
	public int fiyatHesapla() {
		return fiyat;
	}

	@Override
	public List<Malzeme> getMalzemeler() {
		return new ArrayList<Malzeme>();
	}
}
