package src.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static final int OPCION_SALIR = 6;

    public static void main(String[] args) {
        int option = 0;

        Map<Integer, Accion> strategy = AccionHandler.getStrategy();

        do {
            option = scanner.nextInt();
            scanner.nextLine();
            Accion accion = strategy.get(option);
            if (option == OPCION_SALIR) {
                continue;
            }
            if (accion == null) {
                System.out.printf("Esta opcion no existe\n");
            } else {
                accion.aplicar();
            }
        } while (option != OPCION_SALIR);
        System.out.printf("Salida existosa");


    }
}
