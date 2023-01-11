package patterns.creational.builder;

public class Client {
    public static void main(String[] args) {
        Asci asci = new Asci();
        PizzaBuilder baharartliPizzaBuilder = new BaharatliPizzaBuilder();
        PizzaBuilder tonBalikliPizzaBuilder = new TonBalikliPizzaBuilder();

        asci.setPizzaBuilder(baharartliPizzaBuilder);
        asci.PizzaYap();
        Pizza pizza = asci.getPizza();

    }
}
