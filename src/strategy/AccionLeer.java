package src.strategy;

public class AccionLeer implements Accion{
    @Override
    public void aplicar() {
        System.out.printf("Estoy leyendo");

    } @Override
        public int getOpcion(){
            return 2;
        }




}
