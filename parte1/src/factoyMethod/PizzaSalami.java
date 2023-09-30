package src.factoyMethod;

public class PizzaSalami implements Pizza {
    @Override
    public String getTipoMasa() {
        return "Gruesa";
    }

    @Override
    public String getTipoQueso() {
        return "Quesito";
    }

    @Override
    public String getTopings() {
        return "Salami";
    }
}
