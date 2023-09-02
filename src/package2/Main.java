package src.package2;

import src.builder.Empleado;
import src.factoyMethod.CreadorPizza;
import src.factoyMethod.CreadorPizzaHawaiana;
import src.factoyMethod.CreadorPizzaSalami;
import src.factoyMethod.Pizza;
import src.package1.Prueba;
import src.prototype.Estudiante;
import src.singleton.Singleton;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
//        Empleado empleado = Empleado.builder()
//                .id(123l)
//                .nombre("pedro")
//                .build();
//
//        System.out.print(empleado);

//        Estudiante estudiante = new Estudiante(123, 8, "andrey");
//        Estudiante estudiante1 = estudiante.clone();
//
//        System.out.println(estudiante == estudiante1);
//        System.out.println("estudiante 1" + estudiante);
//        System.out.println("estudiante 2 " + estudiante1);

        CreadorPizza creadorPizza = new CreadorPizzaHawaiana();
        CreadorPizza creadorPizza1 = new CreadorPizzaSalami();
        Pizza pizza = crearPizza(creadorPizza);
        Pizza pizza1 = crearPizza(creadorPizza1);
        System.out.println(pizza.getTipoMasa() + " " + pizza.getTipoQueso() + " " + pizza.getTopings());

        System.out.println(pizza1.getTipoMasa() + " " + pizza1.getTipoQueso() + " " + pizza1.getTopings());

    }

    public static Pizza crearPizza(CreadorPizza creadorPizza) {
        return creadorPizza.crear();
    }

}
