package collection;

import java.util.ArrayList;
import java.util.List;

public class EjemploList {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("\uD83D\uDC9b".trim());
        strings.add("hola".trim());
        strings.add("  mundo".trim());


        strings.add("\uD83D\uDC9b".trim());

        for (String str : strings) {
            System.out.print(str + " ");
        }

        strings.remove("   mundo  ".trim());

        System.out.println("\n");

        for (String str : strings) {
            System.out.print(str + " ");
        }
        strings.addAll(List.of("\uD83C\uDF56".trim(), " barbacoa ".trim(), " con mostaza ".trim(), "\uD83C\uDF56".trim()));

        System.out.println("\n");

        for (String str : strings) {
            System.out.print(str + " ");
        }
        System.out.println("\n");

        strings.add(" y cerveza ".trim());
        strings.add("\uD83C\uDF7A".trim());


        strings.forEach(str -> System.out.print(str + " "));

        System.out.println("\n");

    }

}
