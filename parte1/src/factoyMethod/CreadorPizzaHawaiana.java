package src.factoyMethod;

public class CreadorPizzaHawaiana implements CreadorPizza {
    @Override
    public Pizza crear() {
        return new PizzaHawaiana();
    }
}
