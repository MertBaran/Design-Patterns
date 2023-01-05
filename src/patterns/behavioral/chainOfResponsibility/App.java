package patterns.behavioral.chainOfResponsibility;
public class App {

    public static void main(String[] args) {

        KargoSirketi abcKargo = AbcKargo.getKargoSirketi();

        abcKargo.kargola(EnumIl.KARS);

        System.out.println("\n----------\n");

        abcKargo.kargola(EnumIl.ANTALYA);

        System.out.println("\n----------\n");

        abcKargo.kargola(EnumIl.ISTANBUL);

        System.out.println("\n----------\n");

        abcKargo.kargola(EnumIl.ANKARA);

    }
}
