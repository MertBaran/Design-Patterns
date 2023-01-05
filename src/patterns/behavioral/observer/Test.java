package patterns.behavioral.observer;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        BigDecimal min = BigDecimal.valueOf(20);
        BigDecimal max = BigDecimal.valueOf(28);

        Termometre termometre = new Termometre(min,max);
        Ebeveyn anne = new Ebeveyn("anne");
        Ebeveyn baba = new Ebeveyn("baba");


        termometre.addObserver(anne);
        termometre.addObserver(baba);

        for(int i=termometre.getAnlikSicaklik().intValue();i<30;i++) {
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));

        }

        for(int i=termometre.getAnlikSicaklik().intValue();i>22;i--) {
            termometre.setAnlikSicaklik(BigDecimal.valueOf(i));

        }
    }
}
