package patterns.behavioral.iterator;

import java.util.Iterator;

public class Uygulama {

    public static void main(String[] args) {

        Kitap kitap = new Kitap("Matematik");
        Fasikul fasikul = new Fasikul("Türkce");
        Deneme deneme = new Deneme("Fen");
        SoruBankasi soruBankasi = new SoruBankasi("Sosyal Soru Bankasi");

        Iterator soruIteratorKitap = kitap.getSoruIterator();
        Iterator soruIteratorFasikul = fasikul.getSoruIterator();
        Iterator soruIteratorDeneme = deneme.getSoruIterator();
        Iterator soruIteratorBanka = soruBankasi.getSoruIterator();

        yazdir(soruIteratorKitap);
        yazdir(soruIteratorFasikul);
        yazdir(soruIteratorDeneme);
        yazdir(soruIteratorBanka);
    }

    private static void yazdir(Iterator soruIterator) {
        while (soruIterator.hasNext()) {
            Soru soru = (Soru) soruIterator.next();

            Long soruNo = soru.getSoruNo();

            System.out.println("Soru No: " + soruNo);
        }
    }

}
