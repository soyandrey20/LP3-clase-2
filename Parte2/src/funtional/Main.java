package funtional;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {

        Function<Integer, String> function = (Integer integer) -> integer.toString() + " -> este es el numero";

        MiInterfazFuncional<String, Integer> miInterfazFuncional = (String string,String string1) -> {
            System.out.println("Valor de entrada " + string + " " + string1);
            return 50;
        };
        System.out.println(miInterfazFuncional.aplicar("100","200"));
//        System.out.println(function.apply(8,200));
    }

}
