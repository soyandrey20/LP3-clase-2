package src.factoyMethod;

public class PizzaHawaiana implements Pizza {


    @Override
    public String getTipoMasa() {
        return "delagada";
    }

    @Override
    public String getTipoQueso() {
        return "Mozzarela";
    }

    @Override
    public String getTopings() {
        return "jamon y piña";
    }


}
