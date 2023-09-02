package src.strategy;

public class AccionCrear implements Accion{


    @Override
    public void aplicar() {
        System.out.printf("Estoy creando");
    }

    @Override
    public int getOpcion() {
        return 1;
    }
}
