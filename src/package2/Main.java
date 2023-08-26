package src.package2;

import src.builder.Empleado;
import src.package1.Prueba;
import src.singleton.Singleton;

public class Main {

    public static void main(String[] args) {
        Empleado empleado = Empleado.builder()
                .id(123l)
                .nombre("pedro")
                .build();

        System.out.print(empleado);
    }


}
