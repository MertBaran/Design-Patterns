package patterns.creational.abstractFactory.university;

public class UcuncuSinifFactory implements BilgisayarMuhendisligiFactory{
    public UcuncuSinifFactory() {
    };
    @Override
    public Ders dersYarat(String isim) {
        return null;
    }

    @Override
    public OgretimUyesi ogretimUyesiYarat(String isim) {
        return null;
    }

    @Override
    public Takvim takvimYarat(String isim) {
        return null;
    }

    @Override
    public Mufredat mufredatYarat(String isim) {
        return null;
    }
}
