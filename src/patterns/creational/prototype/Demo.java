package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {

        List<Sekil> sekiller = new ArrayList<>();
        List<Sekil> kopyaSekiller = new ArrayList<>();

        Daire daire = new Daire();
        daire.x = 10;
        daire.y = 20;
        daire.yaricap = 15;
        daire.renk = "red";
        sekiller.add(daire);

        Daire baskaDaire = (Daire) daire.clone();
        sekiller.add(baskaDaire);

        Dikdortgen dikdortgen = new Dikdortgen();
        dikdortgen.genislik = 10;
        dikdortgen.yukseklik = 20;
        dikdortgen.renk = "blue";
        sekiller.add(dikdortgen);

        klonlaVeKıyasla(sekiller, kopyaSekiller);
    }

    private static void klonlaVeKıyasla(List<Sekil> sekiller, List<Sekil> kopyaSekiller) {
        for (Sekil sekil : sekiller) {
            kopyaSekiller.add(sekil.clone());
        }

        for (int i = 0; i < sekiller.size(); i++) {
            if (sekiller.get(i) != kopyaSekiller.get(i)) {
                System.out.println(i +"."+ sekiller.get(i).toString() +" ---- "+ kopyaSekiller.get(i).toString()+
                        " " +": Şekiller birbirinden farklı nesneler :)");
                if (sekiller.get(i).equals(kopyaSekiller.get(i))) {
                    System.out.println(i + ": Ancak yine de aynılar :)");
                } else {
                    System.out.println(i + ": Ancak aynı değiller :(");
                }
            } else {
                System.out.println(i + ": Şekiller aynı nesneler :()");
            }
        }
    }
}
