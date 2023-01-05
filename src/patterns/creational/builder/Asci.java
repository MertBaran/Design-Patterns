package patterns.creational.builder;

public class Asci {
    private PizzaBuilder pizzaBuilder;
    public void setPizzaBuilder(PizzaBuilder pb) {
        pizzaBuilder = pb;
    }

    public Pizza getPizza() {
        return pizzaBuilder.getPizza();
    }

    public void PizzaYap() {
        pizzaBuilder.yeniPizzaYarat();
        pizzaBuilder.buildHamur();
        pizzaBuilder.buildSos();
        pizzaBuilder.buildMalzeme();
    }
}
