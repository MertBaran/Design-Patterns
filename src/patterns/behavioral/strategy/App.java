package patterns.behavioral.strategy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Ogrenci mert = new Ogrenci(Bolum.SAYISAL);
		Ogrenci veli = new Ogrenci(Bolum.ESITAGIRLIK);
		Ogrenci ahmet = new Ogrenci(Bolum.SOZEL);
		
		List<Ogrenci> ogrenciListesi = new ArrayList<Ogrenci>(Arrays.asList(mert,ahmet,veli));
		
		
		for(Ogrenci o:ogrenciListesi)
		System.out.println(o.getOncelikSiralamasi());
		
	}

}
