package patterns.behavioral.observer;

public class Ebeveyn  implements Observer{

    private String adi;

    Ebeveyn(String adi){
        this.adi=adi;
    }


    @Override
    public void update(Observable observable) {

        Termometre termometre = (Termometre)observable;
        System.out.println(adi + ": ooo sicaklik " + termometre.getAnlikSicaklik() + " derece olmuş");
    }

}
