package patterns.behavioral.chainOfResponsibility;
public class AbcKargo {

    public static KargoSirketi getKargoSirketi(){

        BalikesirSube cankiriSube = new BalikesirSube();
        AnkaraSube ankaraSube = new AnkaraSube();
        IstanbulSube istanbulSube = new IstanbulSube();
        AntalyaSube antalyaSube = new AntalyaSube();

        KargoSirketi sbmKargo = cankiriSube
                .setSonrakiKargoSirketi(ankaraSube
                        .setSonrakiKargoSirketi(istanbulSube
                                .setSonrakiKargoSirketi(antalyaSube)
                        )
                );

        return sbmKargo;
    }
}
