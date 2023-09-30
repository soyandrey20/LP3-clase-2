package src.strategy;

public class AccionBuscar implements Accion {


    @Override
    public void aplicar() {
        System.out.printf("Estoy buscando");
    }

    @Override
    public int getOpcion() {
        return 5;
    }
}
