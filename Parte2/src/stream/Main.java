package stream;

import stream.Empleado;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>();

        empleados.add(new Empleado(1L, 20, "Andres"));
        empleados.add(new Empleado(6L, 18, "Fernando"));
        empleados.add(new Empleado(8L, 17, "Andrey"));


        Set<Character> iniciales = empleados.stream().
                map(empleado -> empleado.getNombre())
                .map(nombre -> nombre.charAt(0))
                .collect(Collectors.toSet());


        Set<Empleado> filtro = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) != 'A')
                .collect(Collectors.toSet());

        Optional<Empleado> Max = empleados.stream()
                .max(Comparator.comparing(empleado -> empleado.getNombre().length()));

        Optional<Empleado> encontrarPrimero = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) == 'A')
                .findFirst();

        Optional<Empleado> encontrarCualquiera = empleados.stream()
                .filter(empleado -> empleado.getNombre().charAt(0) == 'A')
                .findAny();

        Map<Long, Empleado> EmpleadoMap = empleados.stream()
                .collect(Collectors.toMap(empleado -> empleado.getId(), empleado -> empleado));

//        empleados.stream()
//                .map(Empleado::getId)
//                .forEach(System.out::println);


        Optional<Empleado> optionalEmpleado =
                Optional.of(new Empleado(5l, 10, "Alan brito"))
                        .filter(empleado -> empleado.getEdad() > 18);

        optionalEmpleado.orElseGet(() -> new Empleado(4l, 25, "sebastian"));



        System.out.println(optionalEmpleado);

//        System.out.println(iniciales);
//        System.out.println(filtro);
//        System.out.println(empleados);
//        System.out.println(Max);
//        System.out.println(encontrarPrimero);
//        System.out.println(encontrarCualquiera);
//        System.out.println(EmpleadoMap);
    }
}