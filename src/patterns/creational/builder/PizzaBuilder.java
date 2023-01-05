package patterns.creational.builder;

public abstract class PizzaBuilder {

        protected Pizza pizza;

        public Pizza getPizza() {
            return pizza;
        }

        public void yeniPizzaYarat() {
            pizza = new Pizza();
        }

        public abstract void buildHamur();
        public abstract void buildSos();
        public abstract void buildMalzeme();

}
