package src.factoyMethod;

public class CreadorPizzaSalami implements CreadorPizza {


    @Override
    public Pizza crear() {
        return new PizzaSalami();
    }
}
