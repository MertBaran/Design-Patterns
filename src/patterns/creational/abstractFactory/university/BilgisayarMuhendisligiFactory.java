package patterns.creational.abstractFactory.university;

public interface BilgisayarMuhendisligiFactory {
	
	Ders dersYarat(String isim);
	OgretimUyesi ogretimUyesiYarat(String isim);
	Takvim takvimYarat(String isim);
	Mufredat mufredatYarat(String isim);
}
