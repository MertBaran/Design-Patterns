package patterns.creational.abstractFactory.university;

public class BirinciSinifFactory implements BilgisayarMuhendisligiFactory{
    public BirinciSinifFactory() {
    };
    @Override
    public Ders dersYarat(String isim) {
        return new Ders();
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
