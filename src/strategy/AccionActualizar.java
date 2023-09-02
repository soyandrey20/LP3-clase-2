package src.strategy;

public class AccionActualizar implements Accion{
    @Override
    public void aplicar() {
        System.out.printf("Estoy actualizando");
    }
        @Override
        public int getOpcion() {
            return 3;
        }

}
