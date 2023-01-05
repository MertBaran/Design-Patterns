package patterns.creational.factoryMethod.employee.Scenario;

import java.util.Random;

public class RastgeleCalisan {
    private static Random random = new Random();

    private static String[] isimler = { "Ali", "Ayse", "Bahar", "Bekir", "Bulent", "Can", "Cem", "Demet", "Elif",
            "Eylem", "Faruk", "Fatma", "Ganime", "Gulsum", "Haydar", "Halil", "Ismail", "Jale", "Kemal", "Leman",
            "Mehmet", "Mihrimah", "Murat", "Mustafa", "Nedim", "Nilufer", "Selim", "Selman", "Sevda", "S¸leyman",
            "Tarik", "Teoman", "Turgut", "Yeliz", "Zuhal" };

    private static String[] departmanlar = { "Production", "Sales", "Marketing", "Engineering"};

    public static int idYarat(){
        int randomInt = random.nextInt(100000);
        return randomInt;
    }

    public static String isimYarat() {
        int randomInt = random.nextInt(35);
        return isimler[randomInt];
    }

    public static String departmanYarat() {
        int randomInt = random.nextInt(4);
        return departmanlar[randomInt];
    }

    public static int yilYarat(){
        int randomInt = random.nextInt(20);
        return randomInt;
    }
}
