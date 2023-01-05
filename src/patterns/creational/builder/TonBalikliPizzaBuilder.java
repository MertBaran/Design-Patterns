package patterns.creational.builder;

public class TonBalikliPizzaBuilder extends PizzaBuilder{

    @Override
    public void buildHamur() {
        pizza.setHamur("yumuşak");
    }

    @Override
    public void buildSos() {
    pizza.setSos("hafif tatli");
    }

    @Override
    public void buildMalzeme() {
    pizza.setHamur("ton balığı+mısır");
    }
}
