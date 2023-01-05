package patterns.creational.builder;

public class BaharatliPizzaBuilder extends PizzaBuilder{
    @Override
    public void buildHamur() {
        pizza.setHamur("çıtır");
    }

    @Override
    public void buildSos() {
    pizza.setSos("aci");
    }

    @Override
    public void buildMalzeme() {
    pizza.setMalzeme("jambon+biber+özel baharat");
    }
}
